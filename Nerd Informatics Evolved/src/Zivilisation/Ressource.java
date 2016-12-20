package Zivilisation;

import Exceptions.AnzahlZuKlein;

// TODO: Auto-generated Javadoc
/**
 * The Class Ressource.
 */
public class Ressource {
	
	/** The name. */
	String name;
	
	/** The anzahl. */
	int anzahl;

	/**
	 * Instantiates a new ressource.
	 *
	 * @param name the name
	 * @param anzahl the anzahl
	 */
	public Ressource(String name, int anzahl)throws AnzahlZuKlein {
			this.name=name;
			if(anzahl >0)
			this.anzahl=anzahl;
			else
				throw new AnzahlZuKlein();
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
	 * Gets the anzahl.
	 *
	 * @return the anzahl
	 */
	public int getanzahl() {
		return anzahl;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getname() {
		return name;
	}

	/**
	 * Sets the anzahl.
	 *
	 * @param anzahl the new anzahl
	 */
	public void setanzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setname(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Ressource: "+name+" Anzahl: "+anzahl;
		
	}
	
	
}
