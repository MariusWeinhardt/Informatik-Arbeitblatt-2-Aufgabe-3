package Herbivoren;

import Dinosaurier.Dinosaurier;

public abstract class Pflanzenfresser extends Dinosaurier {

	/**
	 * 
	 */
	Pflanzenfresser() {
		super();
	}

	/**
	 * @param Ziel
	 */
	public void stossen(Object Ziel) {
		action(Ziel, 1, 2);

	}

}
