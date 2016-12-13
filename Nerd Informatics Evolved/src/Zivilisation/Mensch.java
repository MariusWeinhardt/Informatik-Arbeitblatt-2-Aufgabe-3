package Zivilisation;

import Dinosaurier.Dinosaurier;
import Herbivoren.Dodo;
import Herbivoren.Pflanzenfresser;
import Karnivoren.Fleischfresser;

public abstract class Mensch {
	/**
	 * 
	 *///????zustand zustand aendern ?????
	private	static int zustand;
	public static void zustandAendern(int neuerZustand) {
		System.out.println("Zustand andern");
	}
	
	private	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private	int leben;
	private	int alter;
	//Setter getter ??
	
	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	private	Stamm stamm;
	
	public Stamm getStamm() {
		return stamm;
	}

	public void setStamm(Stamm stamm) {
		this.stamm = stamm;
	}

	public Dinosaurier getReittier() {
		return reittier;
	}

	public void setReittier(Dinosaurier reittier) {
		this.reittier = reittier;
	}

	private	Dinosaurier reittier;

	/**
	 * 
	 */
	Mensch(String name) {
		this.name=name;
		stamm=null;
		//test
		//System.out.println("Mensch konstruktor");
	}

	/**
	 * @param ziel
	 */
	void action(Object ziel) {
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
	 * @return
	 */
	public int getleben() {
		return leben;
	}

	/**
	 * @param dino
	 */
	abstract void reiten(Dinosaurier dino);

	/**
	 * @param leben
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}
	

}
