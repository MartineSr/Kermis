package kermis;

public class Ladderklimmen extends Attractie implements GokAttractie{
	
	@Override
	public void kansSpelBelastingBetalen(double omzetLadderklimmen) {
		double gokBelasting = 0.3*omzetLadderklimmen;
		omzetLadderklimmen = omzetLadderklimmen - gokBelasting;
		System.out.println("Er is " +gokBelasting+ " euro betaald door ladderklimmen.");
	}

}
