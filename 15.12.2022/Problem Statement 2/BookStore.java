package com.book;
import com.book.Book;
import java.util.Collection;
import java.util.LinkedList;

	public class BookStore { // class
		
		private static com.book.Book Book;
		public LinkedList<Book> list1= new LinkedList<Book>(); //creating list
	
		public void addBook(Book b) { // 1st method 
			if(list1.add(Book)) {
				System.out.println(list1); //print list
			}
		}
		public void searchByTitle(String title)  { //2nd method to fetch the details of book through title
			if (list1.contains(title)) { //search for the book
				System.out.println(list1.contains(Book)); //prints the book detail if pesent
			} else 
				System.out.println("Book NOT found"); //if book not present
		}
		public void searchByAuthor(String author) { //3rd method to fetch book details through author name
			if(list1.contains(author)) { //search for the book
				System.out.println(list1.contains(Book)); //prints if the book is found
			}else 
				System.out.println("Book Not Found");// prints if the book is not found
		}
	}


