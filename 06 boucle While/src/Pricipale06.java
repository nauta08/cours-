import java.util.Scanner;

public class Pricipale06 {

	public static void main(String[] args) {
		int nombreAnnees;
		double tauxInteret, capitalInitial, capitalFinal, gain;
		
		nombreAnnees = 0;
		tauxInteret = 0.; capitalInitial = 0.; capitalFinal = 0.; gain = 0.;
		
		
		Scanner clavier = new Scanner (System.in);
		
		System.out.print("Quel est le montant du capital à placer (en €) ? ");
		capitalInitial = clavier.nextDouble();
		System.out.print("Quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextDouble();
		System.out.println("Quel est le gain souhaité (en €) ?");
		gain = clavier.nextDouble(); // Le gain doit être strictement positif
		capitalFinal = capitalInitial;
		
		
		while (capitalFinal - capitalInitial < gain){
			nombreAnnees ++;
			
			capitalFinal = (1 + tauxInteret/100)* capitalFinal;
		}
			
			System.out.print("Le gain de ");
			System.out.printf("%6.0f", gain);
			System.out.print(" € sera atteint au bout de " + nombreAnnees + "an(s). ");
			clavier.close();
			
			
		}

	}


