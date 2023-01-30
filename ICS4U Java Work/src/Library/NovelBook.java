package Library;

public class NovelBook extends Book {
	//Initialize variables
	private String title;
	private String author;
	private int readingLevel;
	private String genre;
	//Constructor
	public NovelBook(String title, String author, int readingLevel, String genre) {
		super(title, author);
		this.title = title;
		this.author = author;
		this.readingLevel = readingLevel;
		this.genre = genre;
	}
	//Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReadingLevel() {
		return readingLevel;
	}

	public void setReadingLevel(int readingLevel) {
		this.readingLevel = readingLevel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	//Override toString
	public String toString() {
		
		return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\nBook/Title: " + title + ", Author: " + author + ", Reading level: " + readingLevel + ", Genre: " + genre + ".\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	}
}
