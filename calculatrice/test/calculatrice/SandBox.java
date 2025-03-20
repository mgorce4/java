package calculatrice;

public class SandBox {
	
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		int dividende = 42;
		int diviseur = 2;
		int quotient = calculatrice.diviser(dividende, diviseur);
		System.out.println("le résulatat de la division de " + dividende + " par " + diviseur + " est " + quotient);
		try {
			int resultat = calculatrice.diviser(42, 0);
		} catch(Exception e) {
            System.out.println("la division par zéro est impossible");
            System.out.println("L'exception capturée est : " + e.getMessage());
		}
	}
}
