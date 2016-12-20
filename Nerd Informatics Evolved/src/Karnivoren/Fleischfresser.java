package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKlein;

// TODO: Auto-generated Javadoc
/**
 * The Class Fleischfresser.
 */
public abstract class Fleischfresser extends Dinosaurier {

	/**
	 * Instantiates a new fleischfresser.
	 */
	protected Fleischfresser() {
	}

	/**
	 * Angreifen.
	 *
	 * @param Ziel the ziel
	 * @throws AnzahlZuKlein 
	 */
	public void angreifen(Object Ziel) throws AnzahlZuKlein {
		action(Ziel, 2, 1);
	}
}
