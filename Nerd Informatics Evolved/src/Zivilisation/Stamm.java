package Zivilisation;

import Dinosaurier.Dinosaurier;
/**
 * 
 * @author Marius
 *
 */

/**
 * Die Klasse Stamm verwaltet Menschen und Dinosaurier und verwaltet außerdem auch noch ressourcen
 * 
 *
 */
public class Stamm {

	String namen;

	private Mensch[] mitglieder = new Mensch[10];
	private Dinosaurier[] dinos = new Dinosaurier[10];

	public Stamm(String namen) {
		//testAusgabe
		//System.out.println("Stamm konstruktor");
		this.namen=namen;
	}
/**
 * mitglied Hinzufügen fügt in das bergebene objekte in das array ein
 * @param mensch das übergebende objekt wird in das array mitglieder aufgenommen
 */
	public void mitgliedHinzufuegen(Mensch mensch) {

		//array nicht voll und mensch in keinem stamm
		//setter getter Mensch ???
		if(mensch.getStamm()==null && mitglieder[9]==null){
			System.out.println("Mitglied Hinzufügen");
			//über schleifen und if verzweigungen ???
			for(int zähler=0;zähler<10;zähler++){
			
				if(mitglieder[zähler]!=null){
				 mitglieder[zähler]=mensch;
				 //this anscheined  null ?
				 mensch.setStamm(this);
				 zähler=10;
				}
			}
		}
	}
/**
 * 
 * @param dino
 */
	public void verwildern(Dinosaurier dino) {
		System.out.println("verwildern");
	dino.setStamm(null);
		for(int zähler=0;zähler<10;zähler++){
			
			if(dinos[zähler]==dino){
				for(; zähler<10-1;zähler++)
					dinos[zähler]=dinos[zähler+1];
			}
		}
		
	}
/**
 * 
 * @param mensch
 */
	public void ausStammEntlassen(Mensch mensch){
		System.out.println("Entlassen");
		mensch.setStamm(null);
		for(int zähler=0;zähler<10;zähler++){
			
			if(mitglieder[zähler]==mensch){
				for(; zähler<10-1;zähler++)
				mitglieder[zähler]=mitglieder[zähler+1];
			}
		}
		
	}
	/**
	 * 
	 * @param dino
	 */
	public void zaehmen(Dinosaurier dino) {
		//array voll zugriff auf stam  ?? //this = null ????????
				if(dino.getStamm()==null && dinos[9]==null){
					System.out.println("zaehmen");
					for(int zähler=0;zähler<10;zähler++){
						
						if(dinos[zähler]!=null){
							dinos[zähler]=dino;
							dino.setStamm(this);
							zähler=10;
						}
					}
					
				}
			
	}
	
	/**
	 * 
	 */
	void verwalteRessourcen(){
		//??? Nutzen ?????
	Ressource[] ressourcen=new Ressource[10];
	
	ressourcen[0]=new Ressource("Stein",1);
	
		
		
	}
	
}
