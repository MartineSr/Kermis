package kermis;

public class Spin extends Attractie implements RisicoRijkeAttractie, GokAttractie{
	double gokBelasting = 0;
	int draaiLimiet = 5;
	@Override
	public boolean opstellingsKeuring() {
		System.out.println("De attractie moet gecontroleerd worden.");
		System.out.println("Het is weer veilig.");
		return false;
	}
	
	public double kansSpelBelastingBetalen(double omzetSpin) {
		gokBelasting = 0.3*omzetSpin;
		omzetSpin -= gokBelasting;
		System.out.println("Er is " +gokBelasting+ " euro gereserveerd voor gokBelasting door spin.");
		System.out.println("De totale omzet van spin na reservering voor belasting is: " +omzetSpin);
		return gokBelasting;		
	}
}
