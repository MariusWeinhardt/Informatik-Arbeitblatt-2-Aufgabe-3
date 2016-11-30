package Dinosaurier;

import Zivilisation.Mensch;
import Zivilisation.Ressource;
import Zivilisation.Stamm;

/**
 * @author Marius
 *
 */

public abstract class Dinosaurier {
//Initialisierung der Attribute
	private static int counter;
	private int ID;
	private int leben;
	private int staerke;
	Stamm stamm;

	// Konstruktor legt fest ob Dinosaurier männlich oder weiblich ist
	/**
	 * 
	 */
	protected Dinosaurier() {
		counter++;
		// id von counter anlegen
		ID = counter;
		// dino männlich oder weiblich
	}

	//action handeling für die verschiedenen objekte
	/**
	 * @param Ziel
	 * @param dmgMult
	 * @param harvestMult
	 */
	protected void action(Object Ziel, int dmgMult, int harvestMult) {
		
		if (Ziel instanceof Dinosaurier) {

			((Dinosaurier) Ziel).setleben(((Dinosaurier) Ziel).getleben() - (getstaerke() * dmgMult));
		}

		if (Ziel instanceof Mensch) {
			((Mensch) Ziel).setleben(((Mensch) Ziel).getleben() - (getstaerke() * dmgMult));
		}

		if (Ziel instanceof Ressource) {
			((Ressource) Ziel).setanzahl(((Ressource) Ziel).getanzahl() + (getstaerke() * harvestMult));
		} else {

			// try catch fehlermeldung
		}

	}

	/**
	 * @return
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return
	 */
	public int getleben() {
		return leben;
	}

	/**
	 * @return
	 */
	public int getstaerke() {
		return staerke;
	}

	/**
	 * @return
	 */
	public abstract String giblaut();

	/**
	 * @param partner
	 * @return
	 */
	public abstract Dinosaurier paaren(Dinosaurier partner);

	/**
	 * @param leben
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}

	/**
	 * @param staerke
	 */
	protected void setstaerke(int staerke) {
		this.staerke = staerke;
	}

}
