import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class Publicatii {
	
	LiteraturaClasica Lc;
	LiteraturaInterbelica Li;
	LiteraturaPostbelica Lp;
	
	CarteIterator iterLc;
	CarteIterator iterLi;
	CarteIterator iterLp;
	
	public Publicatii(CarteIterator newLc, CarteIterator newLi, CarteIterator newLp){
		
		iterLc = newLc;
		iterLi = newLi;
		iterLp = newLp;
		
	}
	
	public void showBook(){
		
		Iterator Lc = iterLc.createIterator();
		Iterator Lp = iterLp.createIterator();
		Iterator Li = iterLi.createIterator();
		
		System.out.println("\nCartile literaturii clasice\n");
		printBook(Lc);
		
		System.out.println("\nCartile literaturii interbelica\n");
		printBook(Li);
		
		System.out.println("\nCartile literaturii postbelica\n");
		printBook(Lp);
		
	}

	private void printBook(Iterator iterator) {
		while(iterator.hasNext()){
			Carte c = (Carte)iterator.next();
			
			System.out.println(c.getBookName());
			System.out.println(c.getBookAuthor());
			System.out.println(c.getYearReleased());
			
		}
		
	}

}
