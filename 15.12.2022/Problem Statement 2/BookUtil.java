package com.bookutil;

import java.util.List;

import com.book.*;

import com.book.Book.InvalidBookException;
public class BookUtil {
public static void main(String[] args) throws InvalidBookException {
	// created an object of Book class and passed the arguments
	Book b=new Book(123,"Pride and Prejudice"," Jane Austen");
	Book b1= new Book(145,"Alice in Wonderland"," Lewis Carrol");
	Book b2 = new Book(133,"Arthashastra","Kautilya");
	BookStore bs=new BookStore(); // created an object of BookStore to add the Book details
	bs.addBook(b);
	bs.addBook(b1);
	bs.addBook(b2);
	bs.searchByTitle("Athashastra"); //searching by title name
	bs.searchByAuthor("jane Austen"); //searching by author name
	System.out.println(bs.list1); // prints the list
}

}
