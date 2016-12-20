package Dinosaurier;

import Exceptions.AndereArt;
import Exceptions.AnzahlZuKlein;
import Exceptions.GleicherDinosaurier;
import Zivilisation.Mensch;
import Zivilisation.Ressource;
import Zivilisation.Stamm;

// TODO: Auto-generated Javadoc
/**
 * The Class Dinosaurier.
 *
 * @author Marius
 */

/**
 * 
 * Dinosaurier ist eine abstrakte klasse die für die erstellung der objekte der Sub klassen im Packet Herbivoren und Karnivoren veratntwortlich ist
 *
 */
public abstract class Dinosaurier {

/** The counter. */
//Initialisierung der Attribute
	private static int counter;
	
	/** Die id. */
	private int ID;
	
	/** Das leben. */
	private int leben;
	
	/** Die staerke. */
	private int staerke;
	
	/** Der stamm. */
	private Stamm stamm;

	
	/**
	 * Der Konsruktor von Dinosaurier ist dafür verantwortlich jedem erstelltem objekt eine einzigartige ID zuzuweisen.
	 * 
	 * counter wird bei der erstellung eines jeden Objektes erhöht 
	 * 
	 * ID wird von counter festgelegt jedes Objekt besitzt eine andere ID.
	 *
	 */
	protected Dinosaurier() {
		
		// ID von counter anlegen danach counter inkrementieren
		ID = counter++;
	}

	//action handeling für die verschiedenen objekte
	/**
	 * action ist dafür verantwortlich die verschiedenen aktionen der Dinosaurier und Menschen 
	 * auszuführen. Je nach typ des übergebenen objekts wird das leben um einen errechneten wert verringert  oder die Ressource um einen errechneten wert erhöht.
	 * 
	 * @param Ziel ein Objekt das entweder ein Dinosaurier eine Ressource oder ein Mensch ist
	 * @param dmgMult gibt den schaden multiplikator an der entweder 0,1 oder 2 ist
	 * @param harvestMult gibt den Ernte multiplikator an der entweder 0,1 oder 2 ist
	 * @throws AnzahlZuKlein 
	 */
	protected void action(Object Ziel, int dmgMult, int harvestMult) throws AnzahlZuKlein {
		
		if (Ziel instanceof Dinosaurier) {
			((Dinosaurier) Ziel).setleben(((Dinosaurier) Ziel).getleben() - (getstaerke() * dmgMult));
		}

		if (Ziel instanceof Mensch) {
			((Mensch) Ziel).setleben(((Mensch) Ziel).getleben() - (getstaerke() * dmgMult));
		}

		if (Ziel instanceof Ressource) {
			
			if(getStamm()==null){
				System.out.println("Der Dinosaurer hat keinen Stamm und kann deshalb keine Ressourcen sammeln");
			}
			else{
				
			getStamm().verwalteRessourcen((Ressource) Ziel,(getstaerke() * harvestMult));
			
			((Ressource) Ziel).setanzahl(((Ressource) Ziel).getanzahl() - (getstaerke() * harvestMult));
			}
			
				
			
			
		}
			
		}

	/**
	 * Gibt die ID des Objektes zurück.
	 *
	 * @return die ID des objektes
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Gibt das leben des Objektes zurück.
	 *
	 * @return das leben des objektes
	 */
	public int getleben() {
		return leben;
	} 

			
		

	

	/**
	 * Gibt die staerke des Objektes zurück.
	 *
	 * @return die staerke des objektes
	 */
	public int getstaerke() {
		return staerke;
	}

	/**
	 * Gibt den stamm züruck.
	 *
	 * @return stamm
	 */
	public Stamm getStamm() {
		return stamm;
	}

	/**
	 * Gibt einen String zurück der den laut eines Dinosauriers darstellt.
	 * In den Unterklassen implementiert
	 * 
	 * @return  String
	 * 
	 */
	public abstract String giblaut();

	/**
	 * Gibt einen neuen Dinosaurier zurück wenn beide partner unterschiedlichen geschlechts sind und von der gleichen Art.
	 * 
	 * @param partner ein objekt von Dinosaurier definiert den partner 
	 * @return gibt ein Objekt einer Dinosaurier Klasse zurück
	 * @throws GleicherDinosaurier 
	 * @throws AndereArt 
	 */
	public abstract Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurier, AndereArt;

	/**
	 * Sets the leben.
	 *
	 * @param leben Das leben des objektes wird auf den übergebenen wert gesetzt
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}

	/**
	 * Die staerke des objektes wird auf den übergebenen wert gesetzt .
	 *
	 * @param staerke ist der ubergebene parameter
	 */
	protected void setstaerke(int staerke) {
		this.staerke = staerke;
	}

	/**
	 * setzt denn stamm auf den übergebenden parameter.
	 *
	 * @param stamm übergebener wert
	 */
	public void setStamm(Stamm stamm) {
		this.stamm = stamm;
	}

}
