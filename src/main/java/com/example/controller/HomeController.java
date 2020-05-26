package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entities.News;
import com.example.service.NewsService;

@Controller
//@RequestMapping("index")
public class HomeController {
	
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value = "index",method= RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("films", newsService.findAll());
		modelMap.put("filmsHOT", newsService.getFilmHot());
		return "webapp/WEB-INF/rvfilm/index.html";
	}	
	@RequestMapping(value = "{tl}", method= RequestMethod.GET)
	public String TheLoai(@PathVariable("tl") String tl, ModelMap modelMap) {
		if(isNumeric(tl))
			{
				int id = Integer.parseInt(tl);
				News fi = newsService.findById(id).get() ;
				modelMap.put("filmsingle",fi);
				return "webapp/WEB-INF/rvfilm/single.html";
			}else {
		modelMap.put("DM",tl);
		modelMap.put("filmsDM",newsService.getTheLoai(tl));
		return "webapp/WEB-INF/rvfilm/reviews.html";
			}
		
	}
}
