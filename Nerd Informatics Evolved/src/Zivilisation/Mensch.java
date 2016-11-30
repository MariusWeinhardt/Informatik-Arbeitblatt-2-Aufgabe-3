package Zivilisation;

import Dinosaurier.Dinosaurier;
import Herbivoren.Dodo;
import Herbivoren.Pflanzenfresser;
import Karnivoren.Fleischfresser;

public abstract class Mensch {
	/**
	 * 
	 */
	static int zustand;
	public static void zustandAendern(int neuerZustand) {
		System.out.println("Zustand andern");
	}
	
	String name;
	int leben;
	int alter;
	Stamm stamm;
	Dinosaurier reittier;

	/**
	 * 
	 */
	Mensch() {
		System.out.println("Mensch konstruktor");
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		this.leben = leben;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Name: "+name+" Leben: "+leben+" Alter: "+alter+" Stamm: "+stamm+"Reittier: "+reittier;
	}
}
