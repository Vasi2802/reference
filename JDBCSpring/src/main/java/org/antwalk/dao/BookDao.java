package org.antwalk.dao;
import org.antwalk.model.Book;

import java.util.List;

import javax.sql.DataSource;

public interface BookDao {
	public void setDataSource(DataSource ds);
	public void create(String title,String author,int price);
	public List<Book> listBook();
	
}
