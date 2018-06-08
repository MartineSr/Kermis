package kermis;

import java.lang.reflect.Array;

public class Attractie {
	
	public String naam;
	public double prijs;
	public int oppervlakte;	
	public double omzetAttractie;
	public int kaartje;
	
	double[] OmzetPerAttractie = new double[6];

	// Method om iedere attractie te draaien.
		
	public void draaien(Object a) {
		this.naam = (String) a;
		System.out.println("Nu is "+ this.naam +" aan het draaien.");	
	}
		
	public void attractieOmzet(int a, double b) {
		this.prijs = b;	
		
		switch(a) {
		case 0: OmzetPerAttractie[0] += b;
				System.out.println("De omzet van " +this.naam+ " is: " + OmzetPerAttractie[0]);
			break;
		case 1: OmzetPerAttractie[1] += b;
				System.out.println("De omzet van " +this.naam+ " is: " + OmzetPerAttractie[1]);
			break;
		case 2: OmzetPerAttractie[2] += b;
				System.out.println("De omzet van " +this.naam+ " is: " + OmzetPerAttractie[2]);
			break;
		case 3: OmzetPerAttractie[3] += b;
				System.out.println("De omzet van " +this.naam+ " is: " + OmzetPerAttractie[3]);
			break;
		case 4: OmzetPerAttractie[4] += b; 
				System.out.println("De omzet van " +this.naam+ " is: " + OmzetPerAttractie[4]);
			break;
		case 5: OmzetPerAttractie[5] += b;
				System.out.println("De omzet van " +this.naam+ " is: " + OmzetPerAttractie[5]);
			break;		
		}			
	}



}

