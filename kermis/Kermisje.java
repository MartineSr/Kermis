package kermis;

import java.util.ArrayList;
import java.util.Scanner;

public class Kermisje {

	public static void main(String[] args) {

		Attractie attractie = new Attractie();		
		Kassa k = new Kassa();

		// Het daadwerkelijk draaien van de kermis.
		k.vragen();		
		
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		
		k.aanzettenAttractie(userInput);

}
}
