package Karnivoren;

import Dinosaurier.Dinosaurier;

/**
 * @author Marius
 *
 */
public class Rex extends Fleischfresser {

	/**
	 * 
	 */
	public Rex() {
		setstaerke(10);
		setleben(100);
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
		return "ROOAAR!!!";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {// art
																			// abfrage
																			// ?

			return new Rex();
		} else {

			return null;
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
