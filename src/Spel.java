import java.util.ArrayList;
import java.util.Scanner;

public class Spel {
	Hand dobbelen = new Hand();
	Dobbelsteen steen = new Dobbelsteen();

	int[] blokkeerArray = { 0, 0, 0, 0, 0 };
	
	ArrayList<Dobbelsteen> dice = new ArrayList<Dobbelsteen>();

	Scanner input = new Scanner(System.in);

	void handWerpen() {
		for (int i = 0; i < 5; i++) {
			Dobbelsteen dobbelsteen = new Dobbelsteen();
			steen.worp.add(dobbelsteen);
			System.out.print(dobbelsteen.gooi());
		}
		System.out.print("\n");
		System.out.print(steen.worp);
		System.out.print("\n");
	}

	void vastHouden() {
		//String invoer = input.nextLine();

		// 5. Maak een losse methode vasthouden().
		// Via een Scanner vraagt het programma om invoer.
		// De invoer wordt via Integer.parseInt() omgezet tot een blokkeerarray van 0 en
		// 1 bijvoorbeeld 11001.
		// Dit blokkeerarray is een field van het YahtzeeSpel.

		// Welke posities wilt u vasthouden? 0 voor geen anders bv 124
		// INVOER: 34 ENTER
	}

	/*
	 * Spel(){ for(int i =0; i<5; i++) { Dobbelsteen dobbelsteen = new
	 * Dobbelsteen(); steen.worp.add(dobbelsteen); } System.out.print("\n");
	 * System.out.print(steen.worp); }
	 */

	void spelen() {
		int worp = 1;
		boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Gooien (enter), Stoppen (q)");
			String invoer = input.nextLine();

			switch (invoer) {
			case "":
				System.out.println("WORP" + worp);
				handWerpen();
				//vastHouden();
				worp++;
				if (worp > 3) {
					System.out.println("Je hebt 3 keer gegooid, volgende beurt");
					spelen();
				}
				break;
			case "q":
				System.out.println("U stopt het spel");
				doorgaan = false;
				break;
			default:
				System.out.println("Voer (enter) of (q) in");
				break;	
			}
		}
	}
}
