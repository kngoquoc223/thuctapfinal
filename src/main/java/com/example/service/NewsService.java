package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;

import com.example.entities.News;

public interface NewsService {
	
	public Iterable<News> findAll();



    void delete(Integer id);


	Optional<News> findById(Integer id);


	void save(News baiviet);
}
