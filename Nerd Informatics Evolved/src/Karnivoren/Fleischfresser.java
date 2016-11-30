package Karnivoren;

import Dinosaurier.Dinosaurier;

public abstract class Fleischfresser extends Dinosaurier {

	/**
	 * 
	 */
	protected Fleischfresser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param Ziel
	 */
	public void angreifen(Object Ziel) {
		action(Ziel, 2, 1);
	}
}
