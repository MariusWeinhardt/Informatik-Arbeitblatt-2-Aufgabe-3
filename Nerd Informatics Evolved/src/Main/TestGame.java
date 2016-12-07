package Main;

import Herbivoren.Bronto;
import Herbivoren.Dodo;
import Herbivoren.Triceratops;
import Karnivoren.Raptor;
import Karnivoren.Rex;
import Zivilisation.Jaeger;
import Zivilisation.Mensch;
import Zivilisation.Sammler;
import Zivilisation.Stamm;

public class TestGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

		System.out.println(Bronto1.giblaut());
		System.out.println(Dodo1.giblaut());
		System.out.println(Triceratops1.giblaut());
		System.out.println(Raptor1.giblaut());
		System.out.println(Rex1.giblaut());
	


	
		System.out.println(Rex1.paaren(Rex2));
		
		System.out.println(Raptor1.paaren(Raptor1));
		
		System.out.println(Bronto1.paaren(Dodo1));

		System.out.println(Dodo1.toString());
		Bronto1.stossen(Dodo1);
		System.out.println(Dodo1.toString());
		Dodo1.picken(Triceratops1);
		Triceratops1.stossen(Raptor1);
		Raptor1.angreifen(Rex1);
		Rex1.angreifen(Raptor1);

		System.out.println(Rex1.toString());
		
		//Menschen tests
        Sammler sammler = new Sammler("Bob");
		Jaeger jaeger = new Jaeger("Alrik");

		sammler.reiten(Bronto1);
		jaeger.reiten(Rex1);
		sammler.reiten(Rex1);
		
		//zustand aendern ???
		Mensch.zustandAendern(0);
		Mensch.zustandAendern(0);
		System.out.println(sammler.toString());
	
		//Stamm test
		Stamm stamm1= new Stamm("Stamm1");
		Stamm stamm2= new Stamm("stamm2");
		
		
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
		
		
		
	}

}
