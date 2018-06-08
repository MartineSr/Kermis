package kermis;

import java.util.Scanner;

public class Kermisje {

	public static void main(String[] args) {

		Attractie attractie = new Attractie();		
		Kassa k = new Kassa();

		k.Lijst();	
		k.Prijslijst();
		
		Scanner scan = new Scanner(System.in);
		do {
		k.vragen();		
		
		if(k.doorgaan == true) {
			int userInput = scan.nextInt();
				
			k.aanzettenAttractie(userInput);
			attractie.draaien(k.Attracties.get(userInput));
		
			k.Omzet(userInput);
			attractie.attractieOmzet(userInput, k.AttractiePrijs.get(userInput));	
			
			attractie.Kaartverkoop(userInput);
			k.kaartVerkoop(userInput);
			
		}		
		
		
		else {
			System.out.println("Tot ziens!");
			System.exit(0);
		}
		}while(k.doorgaan == true);

}
}
