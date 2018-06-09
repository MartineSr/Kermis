package kermis;

import java.util.Arrays;

public class Attractie {
	
	public String naam;
	public double prijs;
	public int oppervlakte;	
	public double omzetAttractie;
	int aantalDraaien;
	double[] gokbelasting = new double[2];
	
	double[] OmzetPerAttractie = {0.0,0.0,0.0,0.0,0.0,0.0};
	int[] AantalKaartjes = {0,0,0,0,0,0};

	// Method om iedere attractie te draaien.
		
	public void draaien(Object a) {
		this.naam = (String) a;
		aantalDraaien++;
		System.out.println("Nu is "+ this.naam +" aan het draaien.");	
	}
		
	public void attractieOmzet(int a, double b) {
		this.prijs = b;	
		
		switch(a) {
		case 0: OmzetPerAttractie[0] += b;
			break;
		case 1: OmzetPerAttractie[1] += b;
			break;
		case 2: OmzetPerAttractie[2] += b;
			break;
		case 3: OmzetPerAttractie[3] += b;
			break;
		case 4: OmzetPerAttractie[4] += b; 
			break;
		case 5: OmzetPerAttractie[5] += b;
			break;		
		}		
		
		System.out.println("De totale omzet per attractie is: " +Arrays.toString(OmzetPerAttractie));
	}

	public void Kaartverkoop(int a) {
		switch(a) {
		case 0: AantalKaartjes[0]++;
			break;
		case 1: AantalKaartjes[1]++;
			break;
		case 2: AantalKaartjes[2]++;
				
				if(AantalKaartjes[2]%1 == 0) {
					Ladderklimmen lk = new Ladderklimmen();
					lk.kansSpelBelastingBetalen(OmzetPerAttractie[2]);
					gokbelasting[0] = lk.gokBelasting;
				}
			break;
		case 3: AantalKaartjes[3]++;
				if(AantalKaartjes[3]%(new Hawaii().draaiLimiet) == 0) {
					new Hawaii().opstellingsKeuring();
				}
			break;
		case 4: AantalKaartjes[4]++; 
				
				if(AantalKaartjes[4]%(new Spin().draaiLimiet) == 0) {
					new Spin().opstellingsKeuring();
				}
				else {}
				
				if(AantalKaartjes[2]%1 == 0) {
					Spin sp = new Spin();
					sp.kansSpelBelastingBetalen(OmzetPerAttractie[4]);
					gokbelasting[1] = sp.gokBelasting;
				}
			break;
		case 5: AantalKaartjes[5]++;
			break;		
		}
		System.out.println("Het totaal aantal verkochte kaartjes per attractie is: " +Arrays.toString(AantalKaartjes));
		
		
	}
	


}

