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

	public String getNamen() {
		return namen;
	}
	public void setNamen(String namen) {
		this.namen = namen;
	}

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
		if(mensch.getStamm()==null && mitglieder[mitglieder.length-1]==null){
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
//exception wenn dino nicht im array vorkommt
	public void verwildern(Dinosaurier dino) {
		int z�hler=0;
		try{
			System.out.println("verwildern");
		while(dinos[z�hler]!=dino){
			z�hler++;
		}
		dino.setStamm(null);
		for(; z�hler<dinos.length-1;z�hler++)
		dinos[z�hler]=dinos[z�hler+1];
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Dino ist nicht in diesem Stamm");
		
		}
	
	}
/**
 * 
 * @param mensch
 */
	//try catch wenn mensch nicht im array vorkommt
	public void ausStammEntlassen(Mensch mensch){
		int z�hler=0;
		try{
		System.out.println("Entlassen");
		while(mitglieder[z�hler]!=mensch){
			z�hler++;
		}
		mensch.setStamm(null);
		for(; z�hler<mitglieder.length-1;z�hler++)
		mitglieder[z�hler]=mitglieder[z�hler+1];
		}catch(IndexOutOfBoundsException e){
			System.out.println("Mensch ist nicht in diesem Stamm");
		}
		
	}
	/**
	 * 
	 * @param dino
	 */
	public void zaehmen(Dinosaurier dino) {
		if(dino.getStamm()==null && dinos[dinos.length-1]==null){
			System.out.println("Mitglied Hinzuf�gen");
			int z�hler=0;
			while(dinos[z�hler]!=null){
				 z�hler++;
			}
			 dinos[z�hler]=dino;
			 dino.setStamm(this);
		}
					}
	
	
	
	
	@Override
	public boolean equals(Object ziel) {
		if (ziel.getClass() != getClass()) {
			return false;
		}

		return true;

	}
	@Override
	public String toString(){
		return "Name: "+getNamen()+" Mitglieder: "+" Dinos: ";
	}
	
	/**
	 * 
	 */
	public void verwalteRessourcen(Ressource ressource,int anzahl){
	int z�hler=0;
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
	
	
	while(ressourcen[z�hler].getname()!=ressource.getname()){
		z�hler++;
	}
	
	ressourcen[z�hler].setanzahl(ressourcen[z�hler].getanzahl()+anzahl);	
	
	}
	
	
}
