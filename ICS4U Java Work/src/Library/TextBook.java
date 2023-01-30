package Library;

public class TextBook extends Book{
	//Initialize variables
	private String title;
	private String author;
	private int edition;
	private boolean isEbook;
	//Constructor
	public TextBook(String title, String author, int edition, boolean isEbook) {
		super(title, author);
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.isEbook = isEbook;
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

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public boolean isEbook() {
		return isEbook;
	}

	public void setEbook(boolean isEbook) {
		this.isEbook = isEbook;
	}
	
	//Override toString
	public String toString() {
		
		return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\nBook/Title: " + title + ", Author: " + author + ", Edition: " + edition + ", eBook: " + isEbook + ".\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	}
	
	
	
	
	
	
	
	
	
	
}
