package Exceptions;

/**
 * Die Klasse NameZuKurzException.
 */
public class NameZuKurzException extends Exception{

/**
 * Instanziert eine neue Exception.
 */
public NameZuKurzException(){
		super("Der Name enth�lt weniger als 2 Zeichen !");
	}
}
