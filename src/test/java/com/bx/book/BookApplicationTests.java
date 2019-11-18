package com.bx.book;

import com.bx.book.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class BookApplicationTests {
@Autowired
private BookService bookService;

	@Test
	public void findBookList() {
		bookService.list().forEach(System.out::println);
	}

}
