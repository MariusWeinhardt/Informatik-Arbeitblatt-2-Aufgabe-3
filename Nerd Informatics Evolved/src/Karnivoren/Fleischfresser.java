package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;

// TODO: Auto-generated Javadoc
/**
 * The Class Fleischfresser.
 */
public abstract class Fleischfresser extends Dinosaurier {

	/**
	 * Instanziert einen neuen Fleischfresser.
	 */
	protected Fleischfresser() {
	}

	/**
	 * action-Methode angreifen() von Pflanzenfresser
	 *
	 * @param Ziel das Ziel
	 * @throws AnzahlZuKlein 
	 */
	public void angreifen(Object Ziel) throws AnzahlZuKleinException {
		action(Ziel, 2, 1);
	}
}
