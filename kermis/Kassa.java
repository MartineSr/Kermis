package kermis;

import java.util.ArrayList;

public class Kassa {  	
	double omzet;
	double prijs;

	ArrayList<Object> Attracties = new ArrayList<>();
	
	void Lijst() {
	Attracties.add(new Spookhuis().naam = "Spookhuis");
	Attracties.add(new Botsauto().naam = "Botsauto");
	Attracties.add(new Ladderklimmen().naam = "Ladderklimmen");
	Attracties.add(new Hawaii().naam = "Hawaii");
	Attracties.add(new Spin().naam = "Spin");
	Attracties.add(new Spiegelpaleis().naam = "Spiegelpaleis");
	System.out.println(Attracties.toString());
	}
	
	public void vragen() {
	System.out.println("In welke attractie wil je?");
	}	
		
	public void aanzettenAttractie(int userInput) {	
		System.out.println("De kassapersoon drukt op de knop!");		
		Attracties.get(userInput);
	}
	
	
	
	
	
	
	
}
