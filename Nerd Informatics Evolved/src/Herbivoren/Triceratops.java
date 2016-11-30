package Herbivoren;

import Dinosaurier.Dinosaurier;

public class Triceratops extends Pflanzenfresser {

	/**
	 * 
	 */
	public Triceratops() {
		setstaerke(5);
		setleben(60);
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
		return "Roooow�";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {// art
																			// abfrage
																			// ?

			return new Triceratops();
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
