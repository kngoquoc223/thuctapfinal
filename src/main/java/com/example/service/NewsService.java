package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;

import com.example.entities.News;

public interface NewsService {
	
	public Iterable<News> findAll();

	public ArrayList<News> getFilmHot();

    void delete(Integer id);


	Optional<News> findById(Integer id);
	
	public List<News> getTheLoai(String tl);


	void save(News baiviet);
}
