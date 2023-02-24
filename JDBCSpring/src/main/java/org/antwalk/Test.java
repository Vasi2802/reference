package org.antwalk;
import java.util.List;
import org.antwalk.dao.BookDaoImpl;
import org.antwalk.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {	
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		BookDaoImpl book=(BookDaoImpl)context.getBean("bookDaoImpl");
		System.out.println("Adding records");
		//book.create("The firm", "John Grisham", 100);
		//book.create("The souffle", "Anand", 195);
		///book.create("The Panther", "John Grisham", 190);
		//book.create("The Deal", "John Doe", 300);
		book.create("Concept of physics", "H.C. Verma", 300);
		
		System.out.println("Listing Books : ");
		List<Book> books=book.listBook();
		for(Book book1:books)
		{
			System.out.println("id "+book1.getId());
			System.out.println("Title "+book1.getTitle());
			System.out.println("Author "+book1.getAuthor());
			System.out.println("Price "+book1.getPrice());			
		}
	}
}
