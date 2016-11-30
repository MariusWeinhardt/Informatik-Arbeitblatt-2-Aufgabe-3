package Zivilisation;

import Dinosaurier.Dinosaurier;

public class Stamm {

	String namen;

	Mensch[] mitglieder = new Mensch[10];
	Dinosaurier[] dinos = new Dinosaurier[10];

	public Stamm() {
		System.out.println("Stamm konstruktor");
	}

	public void mitgliedHinzufuegen(Mensch mensch) {
		System.out.println("Mitglied Hinzufügen");
		//array nicht voll und mensch in keinem stamm
		if(mensch.stamm==null && mitglieder[10]!=null){
			
			//über schleifen und if verzweigungen ???
			mitglieder[]=mensch;
		}
	}

	public void verwildern(Dinosaurier dino) {
		System.out.println("verwildern");
		dinos[]=dino;
		dino.stamm=null;
		
	}

	void ausStammEntlassen(Mensch mensch){
		System.out.println("Entlassen");
		mensch[] mensch;
		
		mensch.stamm=null;
	}
	
	public void zaehmen(Dinosaurier dino) {
		System.out.println("zaehmen");
		//array voll
				if(dino.stamm==null&& dinos[10]!=null){
					dinos[]=dino;
				}
	
		
	
				
	}
	//Ressourcen auf eine klasse ressourcen zufreifen ???
	void verwalteRessourcen(){
		String[] ressourcen = new String[10];
		
		
	}
	
}
