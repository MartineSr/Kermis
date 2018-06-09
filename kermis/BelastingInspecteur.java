package kermis;

import java.util.ArrayList;
import java.util.Arrays;

public class BelastingInspecteur {
	double belasting;
	ArrayList<Object> confirmedGokAttracties = new ArrayList<>();
	
	public void innenBelasting(double gokbelasting) {
		belasting += gokbelasting;
		System.out.println("Er is "+belasting+ " euro aan belasting betaald.");
	}


	public void gokAttractieCheck(ArrayList<Object> AttractiesVanKassa, ArrayList<Object> Attracties) {
		for(int i = 0; i < AttractiesVanKassa.size(); i++) {		
			if(AttractiesVanKassa.get(i) instanceof GokAttractie) {
				confirmedGokAttracties.add(Attracties.get(i));
			}
		}
		System.out.println("De gokattracties zijn: " +confirmedGokAttracties.toString());
		System.out.println("De belasting inspecteur gaat belasting innen van de gokAttracties.");
	}
}