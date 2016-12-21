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
	
	/** The name. */
	private	String name;
	
	/** The leben. */
	private	int leben;

	/** The alter. */
	private	int alter;

	/** The stamm. */
	private	Stamm stamm;
	
	/** The reittier. */
	private	Dinosaurier reittier;
	
	/**
	 * Instanziiert einen neuen Mensch.
	 *
	 * @param name the name
	 * @throws NameZuKurz the name zu kurz
	 */
	Mensch(String name) throws NameZuKurzException {
		stamm=null;
		
		if(name.length() >=2)
		this.name=name;
		else
			throw new NameZuKurzException();
	}

	/**
	 * Action handler für die Unter Klassen
	 * je nach Ziel führt die Methode andere Berechnungen durch.
	 *
	 * @param ziel the ziel
	 * @throws AnzahlZuKlein the anzahl zu klein
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
				//verwalteRessourcen();
			

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
	 * gibt das alter zurück.
	 *
	 * @return the alter
	 */
	public int getAlter() {
		return alter;
	}
	
	/**
	 * gibt das leben zurück.
	 *
	 * @return the leben
	 */
	public int getleben() {
		return leben;
	}

	/**
	 * Git den namen zurück.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * gibt das Reittier zurück.
	 *
	 * @return the reittier
	 */
	public Dinosaurier getReittier() {
		return reittier;
	}

	/**
	 * Gibt den stamm zurück
	 *
	 * @return the stamm
	 */
	public Stamm getStamm() {
		return stamm;
	}

	/**
	 * Reiten stellt eine kentniss beziehung zwischen mensch und dinosaurier her
	 *
	 * @param dino the dino
	 */
	abstract void reiten(Dinosaurier dino);

	/**
	 * setzt das Alter
	 *
	 * @param alter the new alter
	 */
	public void setAlter(int alter) {
		this.alter = alter;
	}

	/**
	 * Setzt dsa Leben
	 *
	 * @param leben the new leben
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}
	
	/**
	 * Setzt den Namen
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setzt das Reittier.
	 *
	 * @param reittier the new reittier
	 */
	public void setReittier(Dinosaurier reittier) {
		this.reittier = reittier;
	}

	/**
	 * Setzt den Stamm
	 *
	 * @param stamm the new stamm
	 */
	public void setStamm(Stamm stamm) {
		this.stamm = stamm;
	}
	

}
