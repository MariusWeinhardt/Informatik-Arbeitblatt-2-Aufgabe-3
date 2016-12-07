package Herbivoren;

import Dinosaurier.Dinosaurier;

public class Dodo extends Pflanzenfresser {

	/**
	 * 
	 */
	public Dodo() {
		setstaerke(1);
		setleben(10);
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
		// TODO Auto-generated method stub

		return "Gurrgurr";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) {
		// abfrage partner haben anderes geschlecht und gleicher art
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)&&partner.getID()!=getID()) {// art
																			// abfrage
																			// ?

			return new Dodo();
		} else {
			// try catch fehlerausgabe 
			
			return null;
		}
	}

	/**
	 * @param ziel
	 */
	public void picken(Object ziel) {
		action(ziel, 0, 0);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Stärke: " + getstaerke() + " Leben: " + getleben() + " ID: " + getID();

	}

}
