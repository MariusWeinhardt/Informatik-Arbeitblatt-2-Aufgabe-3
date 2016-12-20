package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArt;
import Exceptions.GleicherDinosaurier;

// TODO: Auto-generated Javadoc
/**
 * The Class Bronto.
 *
 * @author Marius
 */

public class Bronto extends Pflanzenfresser {

	/**
	 * Instantiates a new bronto.
	 */
	public Bronto() {
		setstaerke(8);
		setleben(130);
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
	 * @see Dinosaurier.Dinosaurier#giblaut()
	 */
	@Override
	public String giblaut() {
		return "Duuuh…";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurier,AndereArt {
		if (partner.getID() % 2 != getID() % 2 && (this.equals(partner))){ 
			return new Bronto();
		}
		if(partner.getID()==getID()){
			throw new GleicherDinosaurier();
		}
		else{
			throw new AndereArt();
		}
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Stärke: " + getstaerke() + " Leben: " + getleben() + " ID: " + getID();

	}
}
