package Herbivoren;

import Dinosaurier.Dinosaurier;

public abstract class Pflanzenfresser extends Dinosaurier {

	/**
	 * 
	 */
	Pflanzenfresser() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @param Ziel
	 */
	public void stossen(Object Ziel) {
		action(Ziel, 1, 2);

	}

}
