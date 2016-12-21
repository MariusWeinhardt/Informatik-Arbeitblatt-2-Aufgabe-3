package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;
import Exceptions.NameZuKurzException;
import Herbivoren.Dodo;
import Herbivoren.Pflanzenfresser;
import Karnivoren.Fleischfresser;

/**
 * Die Klasse Mensch
 */
public abstract class Mensch {
	
	/** Der name. */
	private	String name;
	
	/** Das leben. */
	private	int leben;

	/** Das alter. */
	private	int alter;

	/** Der stamm. */
	private	Stamm stamm;
	
	/** Das reittier. */
	private	Dinosaurier reittier;
	
	/**
	 * Instanziiert einen neuen Mensch.
	 *
	 * @param name der name
	 * @throws NameZuKurzException Wenn der name weniger als 2 zeichen hat
	 */
	Mensch(String name) throws NameZuKurzException {
		stamm=null;
		
		if(name.length() >=2)
		this.name=name;
		else
			throw new NameZuKurzException();
	}

	/**
	 * gibt das alter zurück.
	 *
	 * @return das alter
	 */
	public int getAlter() {
		return alter;
	}

	/**
	 * gibt das leben zurück.
	 *
	 * @return das leben
	 */
	public int getleben() {
		return leben;
	}

	/**
	 * Git den namen zurück.
	 *
	 * @return das name
	 */
	public String getName() {
		return name;
	}

	/**
	 * gibt das Reittier zurück.
	 *
	 * @return das reittier
	 */
	public Dinosaurier getReittier() {
		return reittier;
	}

	/**
	 * Gibt den stamm zurück
	 *
	 * @return der stamm
	 */
	public Stamm getStamm() {
		return stamm;
	}

	/**
	 * Setzt das Leben
	 *
	 * @param leben das neue Leben
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}

	/**
	 * setzt das Alter
	 *
	 * @param alter das neue Alter
	 */
	protected void setAlter(int alter) {
		this.alter = alter;
	}
	
	/**
	 * Setzt den Namen
	 *
	 * @param name der neue name
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * Setzt das Reittier.
	 *
	 * @param reittier das neue reittier
	 */
	protected void setReittier(Dinosaurier reittier) {
		this.reittier = reittier;
	}

	/**
	 * Setzt den Stamm
	 *
	 * @param stamm the new stamm
	 */
	protected void setStamm(Stamm stamm) {
		this.stamm = stamm;
	}
	
	/**
	 * Action handler für die Unter Klassen
	 * je nach Ziel führt die Methode andere Berechnungen durch.
	 *
	 * @param ziel das Ziel
	 * @throws AnzahlZuKleinException Wenn die Anzahl 0 oder weniger beträgt wird diese Exception geweorfen
	 */
	void action(Object ziel) throws AnzahlZuKleinException {
		if(reittier==null){
			if (ziel instanceof Dinosaurier) {

				((Dinosaurier) ziel).setleben(((Dinosaurier) ziel).getleben() - (1*1));
			}

			if (ziel instanceof Mensch) {
				((Mensch) ziel).setleben(((Mensch) ziel).getleben() - (1*1));
			}

			if (ziel instanceof Ressource) {
				((Ressource) ziel).setanzahl(((Ressource) ziel).getanzahl() + (1*1));
		}
	
			
	
		}else{
			if(	reittier instanceof Fleischfresser){
				((Fleischfresser) reittier).angreifen(ziel);
			}
			
			if(reittier instanceof Pflanzenfresser && (!(reittier.equals(Dodo.class)))){
				((Pflanzenfresser) reittier).stossen(ziel);
			}
		if(reittier instanceof Pflanzenfresser && (reittier.equals(Dodo.class))){
			((Dodo) reittier).picken(ziel);
		}
		
		}
	}

	/**
	 * Reiten stellt eine kentniss beziehung zwischen mensch und dinosaurier her
	 *
	 * @param dino der dino
	 */
	abstract void reiten(Dinosaurier dino);
	
	
	

}
