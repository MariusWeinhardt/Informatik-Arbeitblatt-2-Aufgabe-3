package Zivilisation;

import Dinosaurier.Dinosaurier;
import Karnivoren.Fleischfresser;

public class Jaeger extends Mensch {

	/**
	 * 
	 */
	public Jaeger() {
		super();
	}

	/* (non-Javadoc)
	 * @see Zivilisation.Mensch#reiten(Dinosaurier.Dinosaurier)
	 */
	@Override
	public void reiten(Dinosaurier dino) {
		// TODO Auto-generated method stub
		if(dino instanceof Fleischfresser){
			this.reittier=dino;
			System.out.println("Reitet "+reittier);
		}
		else{
			System.out.println("Nicht möglich");
		}
	}

}
