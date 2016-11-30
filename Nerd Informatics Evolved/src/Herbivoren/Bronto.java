package Herbivoren;

import Dinosaurier.Dinosaurier;

/**
 * @author Marius
 *
 */

public class Bronto extends Pflanzenfresser {

	/**
	 * 
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
		// try catch
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
		// TODO Auto-generated method stub
		return "Duuuh�";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) {
		if (partner.getID() % 2 != getID() % 2 && (this.equals(partner))) {// art
	//try catch 																		// abfrage
																			// ?

			return new Bronto();
		} else {

			return null;
		}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "St�rke: " + getstaerke() + " Leben: " + getleben() + " ID: " + getID();

	}
}
