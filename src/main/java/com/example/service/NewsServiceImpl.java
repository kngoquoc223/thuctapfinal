package com.example.service;

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
}
