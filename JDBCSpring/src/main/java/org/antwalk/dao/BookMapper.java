package org.antwalk.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Book;
import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book>{
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Book book =new Book();
		book.setId(rs.getInt("id"));
		book.setTitle(rs.getString("title"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getInt("price"));
		return book;
	}

}
