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
 * Die Klasse Stamm verwaltet Menschen und Dinosaurier und verwaltet au�erdem auch noch ressourcen
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
			int z�hler=0;
			if(mitglieder==null)
				throw new ArrayistLeerException();
			
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
 * @throws ArrayistVoll the arrayist voll
 */
	public void mitgliedHinzufuegen(Mensch mensch)  throws ArrayistVollException{
		if (mitglieder[mitglieder.length-1]!=null)
			throw new ArrayistVollException();
			
		
		
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
			int z�hler=0;
			if(dinos==null)
				throw new ArrayistLeerException();
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
	 * @throws ArrayistVoll the arrayist voll
	 */
	public void zaehmen(Dinosaurier dino) throws ArrayistVollException {
		
		if(dinos[dinos.length-1]!=null){
			throw new ArrayistVollException();
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
