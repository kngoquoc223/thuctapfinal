package com.example.DAO;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.entities.News;

@Repository
public interface NewsDAO extends CrudRepository<News, Integer>{
}
