package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArt;
import Exceptions.GleicherDinosaurier;

// TODO: Auto-generated Javadoc
/**
 * The Class Raptor.
 */
public class Raptor extends Fleischfresser {

	/**
	 * Instantiates a new raptor.
	 */
	public Raptor() {
		setstaerke(6);
		setleben(40);
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
		return "GRRR!";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurier,AndereArt {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {
																		

			return new Raptor();
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
