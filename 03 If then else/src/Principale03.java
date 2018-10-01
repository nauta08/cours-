import java.util.Scanner;

public class Principale03 {

	public static void main(String[] args) {
		// Variables
		int codeSolde;
		double prixArticle, prixSolde;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entretr le prix de l'article non soldé :");
		prixArticle = clavier.nextDouble();
		System.out.println("Entrer le code solde, 1 pour -20%, 2 pour -50% ou 3 pour -70% : ");
		codeSolde = clavier.nextInt();
		
		// Calcule du prix soldé et affichage
		
		if (codeSolde == 1) {
			prixSolde = 0.8 * prixArticle;
			System.out.println("Le prix de l'article soldé à -20% est " + prixSolde + "€.");
		}  else if (codeSolde == 2) { 
			prixSolde = 0.5 * prixArticle;
		System.out.println("Le prix de l'article soldé à -50% est " + prixSolde + "€.");
			
		} else { 
			prixSolde = 0.3 * prixArticle;
		System.out.println("Le prix de l'article soldé à -70% est " + prixSolde + "€.");
			
		} 
		clavier.close();
		
		
		
		}

}
