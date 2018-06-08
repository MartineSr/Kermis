package kermis;

import java.util.Scanner;

public class Kermisje {

	public static void main(String[] args) {

		Attractie attractie = new Attractie();		
		Kassa k = new Kassa();
		
		/*ArrayList<Object> Attracties = new ArrayList<>();
		
		Attracties.add(new Spookhuis().naam = "Spookhuis");
		Attracties.add(new Botsauto().naam = "Botsauto");
		Attracties.add(new Ladderklimmen().naam = "Ladderklimmen");
		Attracties.add(new Hawaii().naam = "Hawaii");
		Attracties.add(new Spin().naam = "Spin");
		Attracties.add(new Spiegelpaleis().naam = "Spiegelpaleis");
		
		System.out.println(Attracties.toString());*/

		// Het daadwerkelijk draaien van de kermis.
		k.Lijst();		
		k.vragen();			
		
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		
		k.aanzettenAttractie(userInput);
		
		attractie.draaien(k.Attracties.get(userInput));

}
}
