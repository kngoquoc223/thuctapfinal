package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.DAO.NewsDAO;
import com.example.entities.News;

@Service("newsService")
@Transactional
public class NewsServiceImpl implements NewsService{

	private static ArrayList<News> hot = new ArrayList<News>();
	private static ArrayList<News> news = new ArrayList<News>();
	private static ArrayList<News> danhmuc = new ArrayList<News>();
	
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	@Autowired
	private NewsDAO newsDAO;
	
	@Override
	public Iterable<News> findAll() {
		return newsDAO.findAll();
	}

	@Override
	public void delete(Integer id) {
		 newsDAO.deleteById(id);
		
	}

	@Override
	public Optional<News> findOne(int id) {
		return newsDAO.findById(id);

	}

	@Override
	public void save(News news) {
		newsDAO.save(news);
	}


	@Override
	public ArrayList<News> getFilmHot() {
		hot.clear();
		for (News film : newsDAO.findAll()) {
			if(film.getHot()==1)
				hot.add(film);
		}
		return hot;
	}


	@Override
	public List<News> getTheLoai(String tl) {
		 if(tl.equals("HOT")) {
			hot.clear();
			for (News film : newsDAO.findAll()) {
				if(film.getHot()==1)
					hot.add(film);
			}
			return hot;
		}else if(tl.equals("NEW")) {
			news.clear();
			for (News film : newsDAO.findAll()) {
				if(film.getNews()==1)
					news.add(film);
			}
			return news;
		}else {
		danhmuc.clear();
		for (News film : newsDAO.findAll()) {
			if(film.getTheloai().equals(tl))
				danhmuc.add(film);
		}
		return danhmuc;
		}
	}

	@Override
	public Optional<News> findById(Integer id) {
		return newsDAO.findById(id);
	}




	

}
