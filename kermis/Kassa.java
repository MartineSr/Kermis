package kermis;

import java.util.ArrayList;
import java.util.List;

public class Kassa {  	
	double omzet;
	double prijs;

	ArrayList<Object> Attracties = new ArrayList<>();
	
	List<Object> attractieInLijst() {

	Attracties.add(new Spookhuis().naam = "Tomb of Horrors");
	Attracties.add(new Botsauto().naam = "Bumpy Ride");
	Attracties.add(new Spiegelpaleis().naam = "Spiegelpaleis");
	Attracties.add(new Ladderklimmen().naam = "Snakes without Ladders");
	Attracties.add(new Hawaii().naam = "Hawaii");
	Attracties.add(new Spin().naam = "Spin");	
	return Attracties;	
	}
	
	public void vragen() {
		for(Object att : Attracties) {
			System.out.println(att);
			}
		System.out.println("In welke attractie wil je?");
	}	
		
	// Dus ik heb mijn spookhuis in mijn main. Daarbij is de naam ook niet in de kassa. Hoe gaan we die implementeren?
	
	public void aanzettenAttractie(int userInput) {	
		System.out.println("De kassapersoon drukt op de knop!");		
	//	k = Attracties.get(userInput);
	//	System.out.println();
	}
	
	
	
	
	
	
	
}
