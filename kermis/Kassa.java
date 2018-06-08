package kermis;

import java.util.Scanner;
import java.util.ArrayList;

public class Kassa {  	
	double omzet;
	double prijs;
	boolean doorgaan;
	int TotaalKaartjes;	

	public ArrayList<Object> Attracties = new ArrayList<>();
	public ArrayList<Double> AttractiePrijs = new ArrayList<>();
	
	void Lijst() {
		Attracties.add(new Spookhuis().naam = "Tomb of Horrors");
		Attracties.add(new Botsauto().naam = "Botsauto");
		Attracties.add(new Ladderklimmen().naam = "Ladders without Snakes");
		Attracties.add(new Hawaii().naam = "Hawaii");
		Attracties.add(new Spin().naam = "Spin");
		Attracties.add(new Spiegelpaleis().naam = "Spiegelpaleis");
		System.out.println("Op de kermis staan de volgende attracties: " +Attracties.toString());
	}
	
	void Prijslijst() {
		AttractiePrijs.add(3.20);
		AttractiePrijs.add(2.50);
		AttractiePrijs.add(5.00);
		AttractiePrijs.add(2.90);
		AttractiePrijs.add(2.25);
		AttractiePrijs.add(2.75);
		System.out.println("Deze attracties kosten: " +AttractiePrijs.toString());
	}
		
	Scanner sc = new Scanner(System.in);
	
	public void vragen() {
		System.out.println("Wil je iets doen op de kermis?");
		doorgaan = sc.nextBoolean();
		if(doorgaan == true ) {
			System.out.println("In welke attractie wil je?");
		}
		else {
			System.out.println("Tot ziens!");
			System.exit(0);
		}
	}	
		
	public void aanzettenAttractie(int userInput) {	
		System.out.println("De kassapersoon drukt op de knop!");		
		Attracties.get(userInput);
	}
	
	public void Omzet(int userInput) {
		AttractiePrijs.get(userInput);
		System.out.println("Deze attractie heeft " +AttractiePrijs.get(userInput) +" opgeleverd.");
		omzet += AttractiePrijs.get(userInput);
		System.out.println("De omzet op de kermis is: "+omzet);
	}
	
	public void kaartVerkoop(int userInput) {
		TotaalKaartjes++;
		System.out.println("Het totaal aantal verkochte kaarten op de kermis is: " +TotaalKaartjes);
	}
	
	
	
	

	
	
	
	
	
	
	
	
}
