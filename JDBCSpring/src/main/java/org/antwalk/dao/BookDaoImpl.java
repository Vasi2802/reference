package org.antwalk.dao;
import org.antwalk.model.Book;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao{
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObj;
	
	public void setDataSource(DataSource ds) {
		this.datasource=ds;//initializing connection
		this.jdbcTemplateObj=new  JdbcTemplate(datasource);
	}
	
	public void create(String title,String author, int price) {
		String query="insert into Book(title,author,price) values(?,?,?)";
		jdbcTemplateObj.update(query,title,author,price);		
	}
	
	public List<Book> listBook(){
		String query="select * from book";
		List<Book> books=jdbcTemplateObj.query(query, new BookMapper());
		return books;
	}
}
