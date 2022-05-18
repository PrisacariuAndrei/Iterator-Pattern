import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LiteraturaInterbelica implements CarteIterator{
	
	Carte[] BACromana;
	int arrayValue = 0;
	
	public LiteraturaInterbelica(){
		
		BACromana = new Carte[3];
		
		addBook("Ion", "Liviu Rebreanu", 1920);
		addBook("Enigma Otiliei", "George Calinescu", 1938);
		addBook("Baltagul", "Mihail Sadoveanu", 1930);
		
	}
	
	public void addBook(String bookName, String bookAuthor, int yearReleased){
		
		Carte c = new Carte(bookName, bookAuthor, yearReleased);
		
		BACromana[arrayValue] = c;
		
		arrayValue++;
		
	}
	
	public Iterator createIterator(){
		return Arrays.asList(BACromana).iterator();
	}

}

