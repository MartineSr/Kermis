package kermis;

public class Attractie {
	
	public String naam;
	public double prijs;
	public int oppervlakte;	
	public double omzetAttractie;
	int draaiLimiet;
	int aantalDraaien;
	
	double[] OmzetPerAttractie = new double[6];
	int[] AantalKaartjes = new int[6];

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

	public void Kaartverkoop(int a) {
		switch(a) {
		case 0: AantalKaartjes[0]++;
				System.out.println("Het aantal verkochte kaartjes van " +this.naam+ " is: " + AantalKaartjes[0]);
			break;
		case 1: AantalKaartjes[1]++;
				System.out.println("Het aantal verkochte kaartjes van " +this.naam+ " is: " + AantalKaartjes[1]);
			break;
		case 2: AantalKaartjes[2]++;
				System.out.println("Het aantal verkochte kaartjes van " +this.naam+ " is: " + AantalKaartjes[2]);
				if(AantalKaartjes[2]%1 == 0) {
				Ladderklimmen lk = new Ladderklimmen();
				lk.kansSpelBelastingBetalen(OmzetPerAttractie[2]);
				System.out.println(lk.gokBelasting);
				}
			break;
		case 3: AantalKaartjes[3]++;
				if(AantalKaartjes[3]%draaiLimiet == 0) {
					new Hawaii().opstellingsKeuring();
				}
				System.out.println("Het aantal verkochte kaartjes van " +this.naam+ " is: " + AantalKaartjes[3]);
			break;
		case 4: AantalKaartjes[4]++; 
				System.out.println("Het aantal verkochte kaartjes van " +this.naam+ " is: " + AantalKaartjes[4]);
				if(AantalKaartjes[4]%draaiLimiet == 0) {
					new Spin().opstellingsKeuring();
				}
			break;
		case 5: AantalKaartjes[5]++;
				System.out.println("Het aantal verkochte kaartjes van " +this.naam+ " is: " + AantalKaartjes[5]);
			break;		
		}	
		
	}
	


}

