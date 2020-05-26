package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;

import com.example.entities.News;

public interface NewsService {
	
	public Iterable<News> findAll();


    
    Optional<News> findOne(int id);
    
    void save(News news);
    

	public ArrayList<News> getFilmHot();

    void delete(Integer id);


	Optional<News> findById(Integer id);
	
	public List<News> getTheLoai(String tl);

}
