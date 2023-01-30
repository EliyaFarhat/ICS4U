package Library;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		//Initialize ArrayList
		ArrayList<Book> library = new ArrayList<>();
		//Two different types of books exist here, TextBooks and Novels.
		library.add(new Book("Fish", "Eliyah Farhat"));
		library.add(new TextBook("Science", "Eliyah Farhat", 1, true));
		library.add(new TextBook("Mathematics","Shaan Tandon", 142, false));
		library.add(new TextBook("Geo","Joe Chen", 13, true));
		library.add(new NovelBook("How to Get Good at School","Abdulhadi Asad", 8, "Non-fiction"));
		library.add(new NovelBook("I dont know","Joe Chen", 14, "Fiction"));
		library.add(new NovelBook("Unicorns","Shaan Tandon", 1, "Fiction"));
		
		//For loop runs through ArrayList, printing every item.
		for(int i = 0; i < library.size(); i++) {
			
		    System.out.print((library.get(i)).toString());
		}

	}

}
