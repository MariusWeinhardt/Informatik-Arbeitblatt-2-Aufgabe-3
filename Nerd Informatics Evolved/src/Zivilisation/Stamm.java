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
 * mitglied Hinzufügen fügt in das bergebene objekte in das array ein
 * @param mensch das übergebende objekt wird in das array mitglieder aufgenommen
 */
	public void mitgliedHinzufuegen(Mensch mensch) {

		//array nicht voll und mensch in keinem stamm
		if(mensch.getStamm()==null && mitglieder[mitglieder.length-1]==null){
			System.out.println("Mitglied Hinzufügen");
			int zähler=0;
			while(mitglieder[zähler]!=null){
				 zähler++;
			}
			 mitglieder[zähler]=mensch;
			 mensch.setStamm(this);
		}
	}
/**
 * 
 * @param dino
 */
//exception wenn dino nicht im array vorkommt
	public void verwildern(Dinosaurier dino) {
		int zähler=0;
		try{
			System.out.println("verwildern");
		while(dinos[zähler]!=dino){
			zähler++;
		}
		dino.setStamm(null);
		for(; zähler<dinos.length-1;zähler++)
		dinos[zähler]=dinos[zähler+1];
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
		int zähler=0;
		try{
		System.out.println("Entlassen");
		while(mitglieder[zähler]!=mensch){
			zähler++;
		}
		mensch.setStamm(null);
		for(; zähler<mitglieder.length-1;zähler++)
		mitglieder[zähler]=mitglieder[zähler+1];
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
			System.out.println("Mitglied Hinzufügen");
			int zähler=0;
			while(dinos[zähler]!=null){
				 zähler++;
			}
			 dinos[zähler]=dino;
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
	int zähler=0;
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
	
	
	while(ressourcen[zähler].getname()!=ressource.getname()){
		zähler++;
	}
	
	ressourcen[zähler].setanzahl(ressourcen[zähler].getanzahl()+anzahl);	
	
	}
	
	
}
