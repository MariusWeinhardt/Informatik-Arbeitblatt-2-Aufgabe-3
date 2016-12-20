package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKlein;
import Exceptions.ArrayistLeer;
import Exceptions.ArrayistVoll;
import Exceptions.NameZuKurz;
// TODO: Auto-generated Javadoc

/**
 * The Class Stamm.
 *
 * @author Marius
 */

/**
 * Die Klasse Stamm verwaltet Menschen und Dinosaurier und verwaltet au�erdem auch noch ressourcen
 * 
 *
 */
public class Stamm {

	/** The namen. */
	String namen;
	Ressource[] ressourcen=new Ressource[10];
	/** The mitglieder. */
	private Mensch[] mitglieder = new Mensch[10];
	
	/** The dinos. */
	private Dinosaurier[] dinos = new Dinosaurier[10];

	/**
	 * Instantiates a new stamm.
	 *
	 * @param namen the namen
	 */
	public Stamm(String namen)throws NameZuKurz {
		if(namen.length() >=2)
		this.namen=namen;
		else
			throw new NameZuKurz();
	}
	
	/**
	 * Aus stamm entlassen.
	 *
	 * @param mensch the mensch
	 */
		//try catch wenn mensch nicht im array vorkommt
		public void ausStammEntlassen(Mensch mensch) throws ArrayistLeer{
			int z�hler=0;
			if(mitglieder==null)
				throw new ArrayistLeer();
			
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
 * mitglied Hinzuf�gen f�gt in das bergebene objekte in das array ein.
 *
 * @param mensch das �bergebende objekt wird in das array mitglieder aufgenommen
 */
	public void mitgliedHinzufuegen(Mensch mensch)  throws ArrayistVoll{
		if (mitglieder[mitglieder.length-1]!=null)
			throw new ArrayistVoll();
			
		
		
		//array nicht voll und mensch in keinem stamm
		if(mensch.getStamm()==null){
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
 * Sets the namen.
 *
 * @param namen the new namen
 */
private void setNamen(String namen) {

	this.namen = namen;

}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
//		int z�hler=0;
//	    String ressourcenstring= "" ,mitgliederstring= "" ,Dinosaurierstring ="";
//		while(ressourcen[z�hler]!=null){
//		ressourcenstring=ressourcenstring+" "+ressourcen[z�hler].getname()+" "+ressourcen[z�hler].getanzahl(); 
//		z�hler++;
//	    } 
//	    
//		ressourcenstring=ressourcenstring+" "+ressourcen[0].getname()+" "+ressourcen[0].getanzahl(); 
//		
//		return "Stamm: "+getNamen()+" Mitglieder "+mitgliederstring+" Dinosaurier "+Dinosaurierstring+" Ressourcen : "+ressourcenstring;
	return "Stamm : "+getNamen()+" Mitglieder : ";
	}
	
	
	
	
	/**
	 * Verwalte ressourcen.
	 *
	 * @param ressource the ressource
	 * @param anzahl the anzahl
	 * @throws AnzahlZuKlein 
	 */
	public void verwalteRessourcen(Ressource ressource,int anzahl) throws AnzahlZuKlein{
	int z�hler=0;
//null pointer exception da er auf getname der ressource zugreift die man noch nicht erstellt hat
	try{
		if(ressourcen[0]==null){
			 ressourcen[0]=new Ressource(ressource.getname(),anzahl);
		}	
		else{
			
		
	if(ressourcen != null){
	  while(ressourcen[z�hler].getname()!=ressource.getname()){
		z�hler++;
	  }
	
	ressourcen[z�hler].setanzahl(ressourcen[z�hler].getanzahl()+anzahl);	
	 }}
	
	 }catch(NullPointerException e){
		 z�hler=0;
		 while(ressourcen[z�hler]!=null){
			 z�hler++;
		 }
		 ressourcen[z�hler]=new Ressource(ressource.getname(),anzahl);
	 }
	
   }
	
	/**
	 * Verwildern.
	 *
	 * @param dino the dino
	 */
	//exception wenn dino nicht im array vorkommt
		public void verwildern(Dinosaurier dino) throws ArrayistLeer {
			int z�hler=0;
			if(dinos==null)
				throw new ArrayistLeer();
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
	 * Zaehmen.
	 *
	 * @param dino the dino
	 */
	public void zaehmen(Dinosaurier dino) throws ArrayistVoll {
		
		if(dinos[dinos.length-1]!=null){
			throw new ArrayistVoll();
		}
			
		if(dino.getStamm()==null){
			System.out.println("Dino Hinzuf�gen");
			int z�hler=0;
			while(dinos[z�hler]!=null){
				 z�hler++;
			}
			 dinos[z�hler]=dino;
			 dino.setStamm(this);
		}
	
		
	}
	
	
}
