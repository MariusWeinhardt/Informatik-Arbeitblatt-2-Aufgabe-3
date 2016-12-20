package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;

/**
 *Die Klasse Pflanzenfresser.
 */
public abstract class Pflanzenfresser extends Dinosaurier {

	/**
	 * Instanziert einen Neuen Pflanzenfresser
	 */
	Pflanzenfresser() {
	}

	/**
	 * action-Methode stossen() von Pflanzenfresser
	 *
	 * @param Ziel das Ziel 
	 * @throws AnzahlZuKlein 
	 */
	public void stossen(Object Ziel) throws AnzahlZuKleinException {
		action(Ziel, 1, 2);

	}

}
