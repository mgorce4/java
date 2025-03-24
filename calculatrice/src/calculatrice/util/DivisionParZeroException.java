package calculatrice.util;

public class DivisionParZeroException extends Exception { // Correction ici !
    
    public DivisionParZeroException(String message) {
        super(message);
    }
}