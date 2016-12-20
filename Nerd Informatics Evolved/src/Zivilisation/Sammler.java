package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.NameZuKurzException;
import Herbivoren.Pflanzenfresser;

// TODO: Auto-generated Javadoc
/**
 * The Class Sammler.
 */
public class Sammler extends Mensch {

	/**
	 * Instantiates a new sammler.
	 *
	 * @param name the name
	 * @throws NameZuKurz the name zu kurz
	 */
	public Sammler(String name) throws NameZuKurzException {
		super(name);
		setleben(25);
		setAlter(20);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ziel) {
		if (ziel.getClass() != getClass()) {
			return false;
		}

		return true;

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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Name: "+getName()+" Leben: "+getleben()+" Alter: "+getAlter()+" Stamm: "+getStamm()+" Reittier: "+getReittier().getClass()+" "+getReittier();
	}
}
