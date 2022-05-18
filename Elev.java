
public class Elev {

	public static void main(String[] args) {
		
		LiteraturaClasica Lc = new LiteraturaClasica();
		LiteraturaInterbelica Li = new LiteraturaInterbelica();
		LiteraturaPostbelica Lp = new LiteraturaPostbelica();
		
		Publicatii opere = new Publicatii(Lc, Li, Lp);
		
		opere.showBook();

	}

}
