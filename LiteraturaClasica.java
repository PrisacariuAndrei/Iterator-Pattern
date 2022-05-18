import java.util.ArrayList;
import java.util.Iterator;

public class LiteraturaClasica implements CarteIterator{
	
	ArrayList<Carte> BACromana;
	
	public LiteraturaClasica(){
		
		BACromana = new ArrayList<Carte>();
		
		addBook("Maitreyi", "Mircea Eliade", 1933);
		addBook("Padurea spanzuratilor", "Liviu Rebreanu", 1922);
		addBook("La Medeleni", "Ionel Teodoreanu", 1925);
		
	}
	
	public void addBook(String bookName, String bookAuthor, int yearReleased){
		
		Carte c = new Carte(bookName, bookAuthor, yearReleased);
		
		BACromana.add(c);
		
	}
	
	
	public Iterator createIterator(){
		return BACromana.iterator();
	}

}
