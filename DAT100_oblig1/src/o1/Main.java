package o1;


import java.util.Scanner;

//Trinnskat:

public class Main {
	
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hva er din bruttolønn?");
		
		String bruttoLønnS = scanner.nextLine();
		int bruttoLønn = Integer.parseInt(bruttoLønnS);
		if(217400 >= bruttoLønn  ) {
			System.out.println("Du trenger ikke å betale skatt !");
		} else if (217400 < bruttoLønn  && bruttoLønn <= 306050) {
			double rest = 1.7/100*bruttoLønn;
			System.out.println("Du må skatte 1.7%, altså " + rest+ "kr " );
		} else if (306050 < bruttoLønn  && bruttoLønn <= 697150) {
			double rest = 4/100*bruttoLønn;
			System.out.println("Du må skatte 4.0%, altså " + rest+ "kr " );
		} else if (697150 < bruttoLønn  && bruttoLønn <= 942400) {
			double rest = 13.7/100*bruttoLønn;
			System.out.println("Du må skatte 13.7%, altså " + rest+ "kr " );
		} else if (697150 < bruttoLønn  && bruttoLønn <= 942400) {
			double rest = 13.7/100*bruttoLønn;
			System.out.println("Du må skatte 13.7%, altså " + rest+ "kr " );
		} else if (942400 < bruttoLønn  && bruttoLønn <= 1410750) {
			double rest = 16.7/100*bruttoLønn;
			System.out.println("Du må skatte 16.7%, altså " + rest+ "kr " );
		} else if (1410750 < bruttoLønn ) {
			double rest = 17.7/100*bruttoLønn;
			System.out.println("Du må skatte 17.7%, altså " + rest+ "kr " );
		} 

	}

}
