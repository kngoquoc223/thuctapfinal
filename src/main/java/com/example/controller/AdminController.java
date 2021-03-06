package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.NewsDAO;
import com.example.entities.News;
import com.example.service.NewsService;


@Controller
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	private NewsService newsService;
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		return "webapp/WEB-INF/rvfilm/admin/index";
	}
	@RequestMapping(value="/danhsach",method = RequestMethod.GET)
	public String ds(ModelMap modelMap) {
		modelMap.put("news", newsService.findAll());
		return "webapp/WEB-INF/rvfilm/admin/danhsachBaiViet";
	}
	
	@RequestMapping(value="/{id}/xoa",method = RequestMethod.GET)
	public String xoa(@PathVariable ("id")int id,ModelMap modelMap) {
		newsService.delete(id);
		modelMap.put("news", newsService.findAll());
		return "webapp/WEB-INF/rvfilm/admin/danhsachBaiViet";
	}
	@RequestMapping(value="/thembaiviet",method = RequestMethod.GET)
	public String themBaiViet(ModelMap modelMap) {
		modelMap.put("news", newsService.findAll());
		return "webapp/WEB-INF/rvfilm/admin/themBaiViet";
	}
	@RequestMapping(value="/{id}/edit",method = RequestMethod.GET)
	public String edit(@PathVariable ("id")int id,ModelMap modelMap) {	
		News fi = newsService.findById(id).get() ;
		modelMap.put("news",fi);
		return "webapp/WEB-INF/rvfilm/admin/themBaiVietEdit";
	}
	
	@RequestMapping(value="/{id}/editSave",method = RequestMethod.POST)
	public String Editsave(News news,ModelMap modelMap) {
		newsService.delete(news.getId());
		newsService.save(news);
		modelMap.put("news", newsService.findAll());
		return "webapp/WEB-INF/rvfilm/admin/danhsachBaiViet";
	}
	
	@RequestMapping(value="save",method = RequestMethod.POST)
	public String save(News news,ModelMap modelMap) {
		newsService.save(news);
		modelMap.put("news", newsService.findAll());
		return "webapp/WEB-INF/rvfilm/admin/danhsachBaiViet";
	}
	
	

}