package Zivilisation;

import Dinosaurier.Dinosaurier;
import Karnivoren.Fleischfresser;

public class Jaeger extends Mensch {

	/**
	 * 
	 */
	public Jaeger(String name) {
		super(name);
		setleben(50);
		setAlter(20);
	}

	/* (non-Javadoc)
	 * @see Zivilisation.Mensch#reiten(Dinosaurier.Dinosaurier)
	 */
	@Override
	public void reiten(Dinosaurier dino) {
		if(dino instanceof Fleischfresser){
			setReittier(dino);
			//test
			//System.out.println("Reitet "+getReittier());
		}
		else{
			//test
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
	@Override
	public String toString(){
		return "Name: "+getName()+" Leben: "+getleben()+" Alter: "+getAlter()+" Stamm: "+getStamm()+" Reittier: "+getReittier().getClass()+" "+getReittier();
	}
}
