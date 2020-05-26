package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEWS")
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="short_content")
	private String short_content;
	
	@Column(name="theloai")
	private String theloai;
	
	@Column(name="img")
	private String img;
	
	@Column(name="hot")
	private String hot;
	
	@Column(name="new")
	private String news;
	
	public News() {
	  }
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShort_content() {
		return short_content;
	}

	public void setShort_content(String short_content) {
		this.short_content = short_content;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getHot() {
		return hot;
	}

	public void setHot(String hot) {
		this.hot = hot;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content + ", short_content=" + short_content
				+ ", theloai=" + theloai + ", img=" + img + ", hot=" + hot + ", news=" + news + "]";
	}

	public News(Integer id, String title, String content, String short_content, String theloai, String img, String hot,
			String news) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.short_content = short_content;
		this.theloai = theloai;
		this.img = img;
		this.hot = hot;
		this.news = news;
	}

	
	
	

}
