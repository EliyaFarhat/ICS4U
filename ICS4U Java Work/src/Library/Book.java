
package Library;
import java.util.*;

public class Book {
	//Initialize variables
	private String author;
	private String title;
	//Constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//Getters and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	//Override toString
	public String toString() {
		
		return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\nBook/Title: " + title + ", Author: " + author + ".\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	}
	
}
