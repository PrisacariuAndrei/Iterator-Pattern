
public class Carte {
	
	String bookName;
	String bookAuthor;
	int yearReleased;
	
	public Carte(String newBookName, String newBookAuthor, int newYearReleased){
		
		bookName = newBookName;
		bookAuthor = newBookAuthor;
		yearReleased = newYearReleased;
	}
	
	public String getBookName(){ return bookName;}
	public String getBookAuthor(){ return bookAuthor;}
	public int getYearReleased(){ return yearReleased;}
	
}
