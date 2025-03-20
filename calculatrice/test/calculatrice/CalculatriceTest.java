package calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatriceTest {
	
	private Calculatrice calculatrice;

    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice();
    }
	
	@Test
	void doitAdditionnerDeuxEntiers() {
		//Arrange
		int a = 2;
		int b = 3;
		//Act
		int resultat = calculatrice.additionner(a, b);
		//Assert
		assertEquals(5, resultat);
	}
	@Test
	void doitSoustraireDeuxEntiers() {
		// Arrange
		int a = 5;
		int b = 3;
		// Act
		int resultat = calculatrice.soustraire(a, b);
		// Assert
		assertEquals(2, resultat);
	}
	
	@Test
	void doitDiviserDeuxEntiers() {
		
		int division = calculatrice.diviser(42, 5);
		
		assertEquals(8, division);
	}
	@Test
    void doitLeverUneArithmeticExceptionSiDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
            calculatrice.diviser(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
	
	@Test
	void doitMuliplierDeuxEntiers() {
		// Arrange
		int a = 5;
		int b = 3;
		// Act
		int resultat = calculatrice.multiplier(a, b);
		// Assert
		assertEquals(15, resultat);
	}

}
