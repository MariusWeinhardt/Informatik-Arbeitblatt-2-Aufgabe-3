package Zivilisation;

public class Ressource {
	String name;
	int anzahl;

	/**
	 * @param i 
	 * @param string 
	 * 
	 */
	Ressource(String name, int anzahl) {
			this.name=name;
			this.anzahl=anzahl;
	}

	/**
	 * @return
	 */
	public int getanzahl() {
		return anzahl;
	}

	/**
	 * @return
	 */
	String getname() {
		return name;
	}

	/**
	 * @param anzahl
	 */
	public void setanzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	/**
	 * @param name
	 */
	void setname(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "Ressource: "+name+" Anzahl: "+anzahl;
		
	}
	

}
