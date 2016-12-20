package Exceptions;

/**
 * Die Klasse AndereArtException diese Exception wird nur in der Methode paaren() des Dinosaurierrs aufgerufen 
 */
public class AndereArtException extends Exception{
	/**
	 * Instantiert eine neue Exception 
	 */
	public AndereArtException(){
		super("Dinosaurier können sich nicht Artenübergreifend Paaren !");
	}
	
}
