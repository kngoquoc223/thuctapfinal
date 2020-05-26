package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.NewsDAO;
import com.example.entities.News;
import com.example.service.NewsService;


@Controller
public class AdminController {
	
	@Autowired
	private NewsService newsService;
	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("news", newsService.findAll());
		return "webapp/WEB-INF/rvfilm/admin/index";
	}

}