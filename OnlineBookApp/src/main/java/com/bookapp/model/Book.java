package com.bookapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Getter
@Setter
@ToString*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	Integer bookId;
	String title;
	String author;
	String category;
	Double price;
	
	
	

}
