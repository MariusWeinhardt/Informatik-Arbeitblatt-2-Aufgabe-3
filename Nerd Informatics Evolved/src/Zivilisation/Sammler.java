package Zivilisation;

import Dinosaurier.Dinosaurier;
import Herbivoren.Pflanzenfresser;

public class Sammler extends Mensch {

	/**
	 * 
	 */
	public Sammler() {
		super();
	}

	/* (non-Javadoc)
	 * @see Zivilisation.Mensch#reiten(Dinosaurier.Dinosaurier)
	 */
	@Override
	public void reiten(Dinosaurier dino) {
		// TODO Auto-generated method stub
		if(dino instanceof Pflanzenfresser){
			this.reittier=dino;
			System.out.println("Reitet "+reittier);
		}
		else{
			System.out.println("Nicht möglich");
		}
	}

}
