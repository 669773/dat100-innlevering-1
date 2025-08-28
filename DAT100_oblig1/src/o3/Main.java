package o3;

import java.util.Scanner;

public class Main {
	
	public static int fakultet(int tall) {
		int fakultet = 1;
		for(int i = 1; i<= tall; i++) {
			 fakultet *= i;
		}
		
		return fakultet;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv et heltall!");
		
		String tallS = scanner.nextLine();
		int tall = Integer.parseInt(tallS);
		
		if(tall >0) {
			System.out.println("Fakultet av "+tall + " er " + fakultet(tall));
		}

	}

}
