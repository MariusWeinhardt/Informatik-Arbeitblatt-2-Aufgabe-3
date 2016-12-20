package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArt;
import Exceptions.AnzahlZuKlein;
import Exceptions.GleicherDinosaurier;

// TODO: Auto-generated Javadoc
/**
 * The Class Dodo.
 */
public class Dodo extends Pflanzenfresser {

	/**
	 * Instantiates a new dodo.
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
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurier,AndereArt {
		// abfrage partner haben anderes geschlecht und gleicher art
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {

			return new Dodo();
		}
			if(partner.getID()==getID()){
				throw new GleicherDinosaurier();
			}
			else{
				throw new AndereArt();
			}

	}

	/**
	 * Picken.
	 *
	 * @param ziel the ziel
	 * @throws AnzahlZuKlein 
	 */
	public void picken(Object ziel) throws AnzahlZuKlein {
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
