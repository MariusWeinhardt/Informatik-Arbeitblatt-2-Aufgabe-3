package Zivilisation;

import Dinosaurier.Dinosaurier;
import Herbivoren.Pflanzenfresser;

public class Sammler extends Mensch {

	/**
	 * 
	 */
	public Sammler(String name) {
		super(name);
		setleben(25);
		setAlter(20);
	}

	/* (non-Javadoc)
	 * @see Zivilisation.Mensch#reiten(Dinosaurier.Dinosaurier)
	 */
	@Override
	public void reiten(Dinosaurier dino) {
		if(dino instanceof Pflanzenfresser){
			setReittier(dino);
			//testAusgaben
			//System.out.println("Reitet "+reittier);
		}
		else{
			//Test Ausgabe
			//System.out.println("Nicht möglich");
		}
	}

}
