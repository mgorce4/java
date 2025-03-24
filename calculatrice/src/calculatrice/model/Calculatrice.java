package calculatrice.model;

import calculatrice.util.DivisionParZeroException;

public class Calculatrice {

    public int additionner(int a, int b) {
        return a + b;
    }

    public int soustraire(int a, int b) {
        return a - b;
    }

    public int diviser(int dividende, int diviseur) throws DivisionParZeroException {
        if (diviseur == 0) {
            throw new DivisionParZeroException("Division impossible car le diviseur est égal à 0 !");
        }
        return dividende / diviseur;
    }

    public int multiplier(int a, int b) {
        return a * b;
    }
}
