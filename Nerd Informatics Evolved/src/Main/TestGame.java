package Main;

import Exceptions.AndereArtException;
import Exceptions.AnzahlZuKleinException;
import Exceptions.ArrayistLeerException;
import Exceptions.ArrayistVollException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.NameZuKurzException;
import Herbivoren.Bronto;
import Herbivoren.Dodo;
import Herbivoren.Triceratops;
import Karnivoren.Raptor;
import Karnivoren.Rex;
import Zivilisation.Jaeger;
import Zivilisation.Ressource;
import Zivilisation.Sammler;
import Zivilisation.Stamm;

// TODO: Auto-generated Javadoc
/**
 * The Class TestGame.
 */
public class TestGame {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws NameZuKurz the name zu kurz
	 * @throws AnzahlZuKlein the anzahl zu klein
	 * @throws ArrayistVoll the arrayist voll
	 * @throws ArrayistLeer the arrayist leer
	 * @throws GleicherDinosaurier the gleicher dinosaurier
	 * @throws AndereArt the andere art
	 */
	public static void main(String[] args) throws NameZuKurzException, AnzahlZuKleinException, ArrayistVollException, ArrayistLeerException, GleicherDinosaurierException, AndereArtException {
		
		//Objekte erstellen
		Bronto Bronto1 = new Bronto();
		Dodo Dodo1 = new Dodo();
		Triceratops Triceratops1 = new Triceratops();
		Raptor Raptor1 = new Raptor();
		Rex Rex1 = new Rex();
		Bronto Bronto2 = new Bronto();
		Dodo Dodo2 = new Dodo();
		Triceratops Triceratops2 = new Triceratops();
		Raptor Raptor2 = new Raptor();
		Rex Rex2 = new Rex();

		Ressource Stein = new Ressource("Stein",100);
		Ressource Fleisch = new Ressource("Fleisch",100);
		Ressource Metall = new Ressource("Metall",100);
		Ressource Holz = new Ressource("Holz",100);
		Ressource Obsidian = new Ressource("Obsidian",100);
		Ressource Kristall = new Ressource("Kristall",100);
		Ressource Chitin = new Ressource("Chitin",100);
		Ressource oel = new Ressource("Oel",100);
		Ressource Perlen = new Ressource("Perlen",100);
		Ressource Pelze = new Ressource("Pelze",100);
		
		Stamm stamm1= new Stamm("New Kids");
		Stamm stamm2= new Stamm("Old Kids");
	    Sammler sammler = new Sammler("Bob");
	    Jaeger jaeger = new Jaeger("Alrik");

	    
	    
		
		
		//Dino tests
		System.out.println(Bronto1.giblaut());
		System.out.println(Dodo1.giblaut());
		System.out.println(Triceratops1.giblaut());
		System.out.println(Raptor1.giblaut());
		System.out.println(Rex1.giblaut());
	
		
		System.out.println(Rex1.paaren(Rex2));
		//System.out.println(Raptor1.paaren(Raptor1));
		//System.out.println(Bronto1.paaren(Dodo1));

		System.out.println(Dodo1.toString());
		Bronto1.stossen(Dodo1);
		System.out.println(Dodo1.toString());
		Dodo1.picken(Triceratops1);
		Triceratops1.stossen(Raptor1);
		Raptor1.angreifen(Rex1);
		Rex1.angreifen(Raptor1);
		System.out.println(Rex1.toString());
		
		//Menschen tests
		sammler.reiten(Bronto1);
		jaeger.reiten(Rex1);
		sammler.reiten(Rex1);
		
		System.out.println(sammler.toString());
	
		//Stamm test
		stamm1.mitgliedHinzufuegen(jaeger);
		stamm1.mitgliedHinzufuegen(jaeger);
		stamm2.mitgliedHinzufuegen(jaeger);
		
		System.out.println(jaeger.toString());
		
		stamm1.ausStammEntlassen(jaeger);
		stamm1.ausStammEntlassen(jaeger);
		stamm1.ausStammEntlassen(sammler);
			
		
		stamm1.zaehmen(Rex2);
		stamm1.zaehmen(Rex2);
		stamm2.zaehmen(Rex2);
		
		stamm1.verwildern(Rex2);
		stamm1.verwildern(Rex2);
		stamm2.verwildern(Raptor2);
		
		stamm2.zaehmen(Rex1);
		
		//ressourcen test
		Bronto1.stossen(Stein);
		Rex1.angreifen(Pelze);
		Rex1.angreifen(Stein);
		System.out.println(Pelze);
		
		
		stamm2.mitgliedHinzufuegen(jaeger);
		stamm2.mitgliedHinzufuegen(sammler);
		stamm2.zaehmen(Bronto1);
		
		
		System.out.println(stamm1.toString());
		
	/* Array ist voll test
		Bronto Bronto3 =new Bronto();
		Bronto Bronto4 = new Bronto();
		Bronto Bronto5 = new Bronto();
		Bronto Bronto6 = new Bronto();
		Bronto Bronto7 = new Bronto();
		Bronto Bronto8 = new Bronto();
		Bronto Bronto9 = new Bronto();
		Bronto Bronto10 = new Bronto();
		Bronto Bronto11 = new Bronto();
		Bronto Bronto12 = new Bronto();
		Bronto Bronto13 = new Bronto();
		
		
		stamm1.zaehmen(Bronto3);
		stamm1.zaehmen(Bronto4);
		stamm1.zaehmen(Bronto5);
		stamm1.zaehmen(Bronto6);
		stamm1.zaehmen(Bronto7);
		stamm1.zaehmen(Bronto8);
		stamm1.zaehmen(Bronto9);
		stamm1.zaehmen(Bronto10);
		stamm1.zaehmen(Bronto11);
		stamm1.zaehmen(Bronto12);
		stamm1.zaehmen(Bronto13);
		*/
		
		//System.out.println(stamm2.toString());
	
	
	
	
	
	
	
	
	
	}

}
