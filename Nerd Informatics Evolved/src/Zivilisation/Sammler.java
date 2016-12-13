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

	@Override
	public boolean equals(Object ziel) {
		if (ziel.getClass() != getClass()) {
			return false;
		}

		return true;

	}
	public String toString(){
		return "Name: "+getName()+" Leben: "+getleben()+" Alter: "+getAlter()+" Stamm: "+getStamm()+" Reittier: "+getReittier().getClass()+" "+getReittier();
	}
}
