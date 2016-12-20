package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArt;
import Exceptions.GleicherDinosaurier;

// TODO: Auto-generated Javadoc
/**
 * The Class Rex.
 *
 * @author Marius
 */
public class Rex extends Fleischfresser {

	/**
	 * Instantiates a new rex.
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
		return "ROOAAR!!!";
	}

	/* (non-Javadoc)
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurier,AndereArt {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {
																			
			return new Rex();
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
