package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKlein;

// TODO: Auto-generated Javadoc
/**
 * The Class Pflanzenfresser.
 */
public abstract class Pflanzenfresser extends Dinosaurier {

	/**
	 * Instantiates a new pflanzenfresser.
	 */
	Pflanzenfresser() {
	}

	/**
	 * Stossen.
	 *
	 * @param Ziel the ziel
	 * @throws AnzahlZuKlein 
	 */
	public void stossen(Object Ziel) throws AnzahlZuKlein {
		action(Ziel, 1, 2);

	}

}
