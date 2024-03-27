package com.karuna.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllbooks(){
		return Arrays.asList(
				new Book(1,"Mastring spring 5.0","Karuna Dande"),
				new Book(2,"Mastring Hibernate 5.0","Prashant Dhanorkar"));
	}
}
