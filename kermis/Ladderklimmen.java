package kermis;

public class Ladderklimmen extends Attractie implements GokAttractie{
	public double gokBelasting = 0;
	@Override
	public double kansSpelBelastingBetalen(double omzetLadderklimmen) {
		gokBelasting = 0.3*omzetLadderklimmen;
		omzetLadderklimmen -= gokBelasting;
		System.out.println("Er is " +gokBelasting+ " euro gereserveerd voor gokBelasting door ladderklimmen.");
		System.out.println("De totale omzet van ladderklimmen na reservering voor belasting is: " +omzetLadderklimmen);
		return gokBelasting;
	}

}
