package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKlein;
import Exceptions.NameZuKurz;
import Herbivoren.Dodo;
import Herbivoren.Pflanzenfresser;
import Karnivoren.Fleischfresser;

// TODO: Auto-generated Javadoc
/**
 * The Class Mensch.
 */
public abstract class Mensch {
	
	/** The zustand. *///????zustand zustand aendern ?????
	private	static int zustand;
	
	/**
	 * Zustand aendern.
	 *
	 * @param neuerZustand the neuer zustand
	 */
	public static void zustandAendern(int neuerZustand) {
		Mensch.zustand=neuerZustand;
		System.out.println("Zustand andern"+zustand);
	
	}
	
	
	
	/** The name. */
	private	String name;
	
	/** The leben. */
	private	int leben;

	/** The alter. */
	private	int alter;
	//Setter getter ??

	/** The stamm. */
	private	Stamm stamm;
	
	/** The reittier. */
	private	Dinosaurier reittier;
	
	/**
	 * Instantiates a new mensch.
	 *
	 * @param name the name
	 */
	Mensch(String name) throws NameZuKurz {
		stamm=null;
		
		if(name.length() >=2)
		this.name=name;
		else
			throw new NameZuKurz();
	}

	/**
	 * Action.
	 *
	 * @param ziel the ziel
	 * @throws AnzahlZuKlein 
	 */
	void action(Object ziel) throws AnzahlZuKlein {
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
	 * Gets the alter.
	 *
	 * @return the alter
	 */
	public int getAlter() {
		return alter;
	}
	
	/**
	 * Gets the leben.
	 *
	 * @return the leben
	 */
	public int getleben() {
		return leben;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the reittier.
	 *
	 * @return the reittier
	 */
	public Dinosaurier getReittier() {
		return reittier;
	}

	/**
	 * Gets the stamm.
	 *
	 * @return the stamm
	 */
	public Stamm getStamm() {
		return stamm;
	}

	/**
	 * Reiten.
	 *
	 * @param dino the dino
	 */
	abstract void reiten(Dinosaurier dino);

	/**
	 * Sets the alter.
	 *
	 * @param alter the new alter
	 */
	public void setAlter(int alter) {
		this.alter = alter;
	}

	/**
	 * Sets the leben.
	 *
	 * @param leben the new leben
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the reittier.
	 *
	 * @param reittier the new reittier
	 */
	public void setReittier(Dinosaurier reittier) {
		this.reittier = reittier;
	}

	/**
	 * Sets the stamm.
	 *
	 * @param stamm the new stamm
	 */
	public void setStamm(Stamm stamm) {
		this.stamm = stamm;
	}
	

}
