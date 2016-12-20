package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;
import Exceptions.ArrayistLeerException;
import Exceptions.ArrayistVollException;
// TODO: Auto-generated Javadoc
import Exceptions.NameZuKurzException;

/**
 * The Class Stamm.
 *
 * @author Marius
 */

/**
 * Die Klasse Stamm verwaltet Menschen und Dinosaurier und verwaltet außerdem auch noch ressourcen
 * 
 *
 */
public class Stamm {

	/** The namen. */
	String namen;
	
	/** The ressourcen. */
	private Ressource[] ressourcen=new Ressource[10];
	/** The mitglieder. */
	private Mensch[] mitglieder = new Mensch[10];
	
	/** The dinos. */
	private Dinosaurier[] dinos = new Dinosaurier[10];

	/**
	 * Instantiates a new stamm.
	 *
	 * @param namen the namen
	 * @throws NameZuKurz the name zu kurz
	 */
	public Stamm(String namen)throws NameZuKurzException {
		if(namen.length() >=2)
		this.namen=namen;
		else
			throw new NameZuKurzException();
	}
	
	/**
	 * Aus stamm entlassen.
	 *
	 * @param mensch the mensch
	 * @throws ArrayistLeer the arrayist leer
	 */
		//try catch wenn mensch nicht im array vorkommt
		public void ausStammEntlassen(Mensch mensch) throws ArrayistLeerException{
			int zähler=0;
			if(mitglieder==null)
				throw new ArrayistLeerException();
			
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

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ziel) {
		if (ziel.getClass() != getClass()) {
			return false;
		}

		return true;

	}

/**
 * Gets the namen.
 *
 * @return the namen
 */
public String getNamen() {
	return namen;
}

/**
 * mitglied Hinzufügen fügt in das bergebene objekte in das array ein.
 *
 * @param mensch das übergebende objekt wird in das array mitglieder aufgenommen
 * @throws ArrayistVoll the arrayist voll
 */
	public void mitgliedHinzufuegen(Mensch mensch)  throws ArrayistVollException{
		if (mitglieder[mitglieder.length-1]!=null)
			throw new ArrayistVollException();
			
		
		
		//array nicht voll und mensch in keinem stamm
		if(mensch.getStamm()==null){
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
 * Setzt den namen.
 *
 * @param namen der neue name
 */
private void setNamen(String namen) {

	this.namen = namen;

}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
	
		return "Stamm : "+getNamen()+" Ressourcen: "+ressourcen[0];
	


	
}
	
	
	
	
	
	/**
	 * Verwalte ressourcen.
	 *
	 * @param ressource the ressource
	 * @param anzahl the anzahl
	 * @throws AnzahlZuKlein the anzahl zu klein
	 */
	public void verwalteRessourcen(Ressource ressource,int anzahl) throws AnzahlZuKleinException{
	int zähler=0;
//null pointer exception da er auf getname der ressource zugreift die man noch nicht erstellt hat
	try{
		if(ressourcen[0]==null){
			 ressourcen[0]=new Ressource(ressource.getname(),anzahl);
		}	
		else{
			
		
	if(ressourcen != null){
	  while(ressourcen[zähler].getname()!=ressource.getname()){
		zähler++;
	  }
	
	ressourcen[zähler].setanzahl(ressourcen[zähler].getanzahl()+anzahl);	
	 }}
	
	 }catch(NullPointerException e){
		 zähler=0;
		 while(ressourcen[zähler]!=null){
			 zähler++;
		 }
		 ressourcen[zähler]=new Ressource(ressource.getname(),anzahl);
	 }
		System.out.println(ressourcen[0]);
	
   }
	
	/**
	 * Verwildern.
	 *
	 * @param dino the dino
	 * @throws ArrayistLeer the arrayist leer
	 */
	//exception wenn dino nicht im array vorkommt
		public void verwildern(Dinosaurier dino) throws ArrayistLeerException {
			int zähler=0;
			if(dinos==null)
				throw new ArrayistLeerException();
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
	 * Zaehmen.
	 *
	 * @param dino the dino
	 * @throws ArrayistVoll the arrayist voll
	 */
	public void zaehmen(Dinosaurier dino) throws ArrayistVollException {
		
		if(dinos[dinos.length-1]!=null){
			throw new ArrayistVollException();
		}
			
		if(dino.getStamm()==null){
			System.out.println("Dino Hinzufügen");
			int zähler=0;
			while(dinos[zähler]!=null){
				 zähler++;
			}
			 dinos[zähler]=dino;
			 dino.setStamm(this);
		}
	
		
	}
	
	
}
