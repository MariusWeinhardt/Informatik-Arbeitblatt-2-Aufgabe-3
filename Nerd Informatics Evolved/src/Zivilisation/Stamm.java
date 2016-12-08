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
			int z�hler=0;
			while(mitglieder[z�hler]!=null){
				 z�hler++;
			}
			 mitglieder[z�hler]=mensch;
			 mensch.setStamm(this);
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
					if(dino.getStamm()==null && dinos[9]==null){
						System.out.println("Mitglied Hinzuf�gen");
						int z�hler=0;
						while(dinos[z�hler]!=null){
							 z�hler++;
						}
						 dinos[z�hler]=dino;
						 dino.setStamm(this);
				
				} 
					}
	}
	
	/**
	 * 
	 */
	void verwalteRessourcen(){
		//??? Nutzen ?????
	Ressource[] ressourcen=new Ressource[10];
	
	ressourcen[0]=new Ressource("Stein",0);
	ressourcen[1]=new Ressource("Metall",0);
	ressourcen[2]=new Ressource("Holz",0);
	ressourcen[3]=new Ressource("Obsidian",0);
	ressourcen[4]=new Ressource("Kristall",0);
	ressourcen[5]=new Ressource("Fleisch",0);
	ressourcen[6]=new Ressource("Chitin",0);
	ressourcen[7]=new Ressource("oel",0);
	ressourcen[8]=new Ressource("Perlen",0);
	ressourcen[9]=new Ressource("Pelze",0);
	ressourcen[10]=new Ressource("Weizen",0);
	
	}
	
}
