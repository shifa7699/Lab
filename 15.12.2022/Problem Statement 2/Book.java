package com.book;

import java.util.Collection;
import java.util.LinkedList;

public class Book  //1st class
{
	int bookId;
	String title, author;
	public class InvalidBookException extends Exception { //created a custom exception 
	}
	//created parameterized constructor
	public Book(int bookId, String title, String author) throws InvalidBookException  {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
}}


