package kermis;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Kassa {  	
	double omzet;
	double prijs;
	boolean doorgaan;
	int TotaalKaartjes;	

	public ArrayList<Object> Attracties = new ArrayList<>();
	public ArrayList<Object> AttractieObject = new ArrayList<>();
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
	
	void ObjectLijstVoorBelastingMan() {
		AttractieObject.add(new Spookhuis());
		AttractieObject.add(new Botsauto());
		AttractieObject.add(new Ladderklimmen());
		AttractieObject.add(new Hawaii());
		AttractieObject.add(new Spin());
		AttractieObject.add(new Spiegelpaleis());
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
		omzet += AttractiePrijs.get(userInput);
		System.out.println("De omzet op de kermis is: "+omzet);
	}
	
	public void kaartVerkoop(int userInput) {
		TotaalKaartjes++;
		System.out.println("Het totaal aantal verkochte kaarten op de kermis is: " +TotaalKaartjes);
	}
	
	public void ontvangenBelastingInspecteur(Object inspecteur, int dr, int[] aantalKaartjesVanAttractie, Attractie attractie, ArrayList<Object> Attracties) {
		Random r = new Random();
		int n = r.nextInt(14);
		if(n == 0) {
			System.out.println("BELASTING BETALEN!!!");
			int aantalBezoeken = 0;
			aantalBezoeken++;
			((BelastingInspecteur) inspecteur).gokAttractieCheck(AttractieObject, Attracties);
			geldNaarBelastingMan(inspecteur, aantalKaartjesVanAttractie,attractie,Attracties);
	
			System.out.println("De inspecteur is nu "+ aantalBezoeken +" langs geweest op " + dr+ " keer draaien.");
			float kans;
			kans = ((float) aantalBezoeken)/dr;
			System.out.println("De kans dat de belasting inspecteur langs komt is: "+kans);
		}	
	}

	public void geldNaarBelastingMan(Object klaas, int[] aantalKaartjesVanAttractie, Attractie attractie, ArrayList<Object> Attracties) {
		for(int i = 0; i < aantalKaartjesVanAttractie.length; i++) {
			switch(i) {
			case 2: if(!(aantalKaartjesVanAttractie[i] == 0)) {
				((BelastingInspecteur) klaas).innenBelasting(attractie.gokbelasting[0], Attracties.get(i));
				}
			case 4: if(!(aantalKaartjesVanAttractie[i] == 0)) {
				((BelastingInspecteur) klaas).innenBelasting(attractie.gokbelasting[1], Attracties.get(i));
				}
			}
		}		
	}
}
