package Zivilisation;

import Dinosaurier.Dinosaurier;
/**
 * 
 * @author Marius
 *
 */

/**
 * Die Klasse Stamm verwaltet Menschen und Dinosaurier und verwaltet au�erdem auch noch ressourcen
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
 * mitglied Hinzuf�gen f�gt in das bergebene objekte in das array ein
 * @param mensch das �bergebende objekt wird in das array mitglieder aufgenommen
 */
	public void mitgliedHinzufuegen(Mensch mensch) {

		//array nicht voll und mensch in keinem stamm
		//setter getter Mensch ???
		if(mensch.getStamm()==null && mitglieder[9]==null){
			System.out.println("Mitglied Hinzuf�gen");
			//�ber schleifen und if verzweigungen ???
			for(int z�hler=0;z�hler<10;z�hler++){
			
				if(mitglieder[z�hler]!=null){
				 mitglieder[z�hler]=mensch;
				 //this anscheined  null ?
				 mensch.setStamm(this);
				 z�hler=10;
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
		for(int z�hler=0;z�hler<10;z�hler++){
			
			if(dinos[z�hler]==dino){
				for(; z�hler<10-1;z�hler++)
					dinos[z�hler]=dinos[z�hler+1];
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
		for(int z�hler=0;z�hler<10;z�hler++){
			
			if(mitglieder[z�hler]==mensch){
				for(; z�hler<10-1;z�hler++)
				mitglieder[z�hler]=mitglieder[z�hler+1];
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
					for(int z�hler=0;z�hler<10;z�hler++){
						
						if(dinos[z�hler]!=null){
							dinos[z�hler]=dino;
							dino.setStamm(this);
							z�hler=10;
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
