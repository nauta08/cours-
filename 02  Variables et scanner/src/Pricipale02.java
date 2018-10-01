import java.util.Scanner;

public class Pricipale02 {

	public static void main(String[] args) {
		//  Déclaration des variables 
		int  diviseur;
		double dividende, quotient;
		
		//enregistre les valeurs tapées par l'utilisateur
		Scanner clavier = new Scanner (System.in);
		System.out.println("entrer le dividende : ");
		dividende = clavier.nextDouble();
		System.out.println("entrer le diviseur : ");
		diviseur = clavier.nextInt();
		
	
		
		// Calcul du quotient
		quotient = dividende / diviseur;
		
		//Aficher le resultat dans la console
		System.out.print("le quotient de la division est "  +   quotient);
		
		clavier.close();
		

	}

}
