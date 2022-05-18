import java.util.Hashtable;
import java.util.Iterator;

public class LiteraturaPostbelica implements CarteIterator{
	
	Hashtable<Integer, Carte> BACromana = new Hashtable<Integer, Carte>();
	int hashKey = 0;
	
	public LiteraturaPostbelica(){
		
		addBook("Morometii", "Marin Preda", 1955);
		addBook("Leoaica tanara, iubirea", "Nichita Stanescu", 1964);
		addBook("Iona", "Marin Sorescu", 1968);
		
	}
	
	public void addBook(String bookName, String bookAuthor, int yearReleased){
		
		Carte c = new Carte(bookName, bookAuthor, yearReleased);
		
		BACromana.put(hashKey, c);
		
		hashKey++;
		
	}
	
	public Iterator createIterator(){
		return BACromana.values().iterator();
	}

}


