package kermis;

public class Attractie {
	
	public String naam;
	public double prijs;
	public int oppervlakte;	


	// Method om iedere attractie te draaien.
		
	public void draaien(Object a) {
		this.naam = (String) a;
		System.out.println("Nu is "+ this.naam +" aan het draaien.");	
	}
	

}

