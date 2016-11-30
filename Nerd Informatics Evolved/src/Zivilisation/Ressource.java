package Zivilisation;

public class Ressource {
	String name;
	int anzahl;

	/**
	 * 
	 */
	Ressource() {

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

}
