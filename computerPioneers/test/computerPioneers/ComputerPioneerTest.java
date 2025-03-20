package computerPioneers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComputerPioneerTest {
	private ComputerPioneer adaLovelace;
	private ComputerPioneer alanTuring;
	private Device babbageMachine;
	private Device turingEngine;
	
	@BeforeEach
	void setUp() {
		babbageMachine = new Device("Babbage Analytical Machine", 1837);
		adaLovelace = new ComputerPioneer("Ada", "Lovelace", babbageMachine);
		turingEngine = new Device("Turing Engine", 1936);
		alanTuring = new ComputerPioneer("Alan", "Turing", turingEngine);
	}

	
	@Test
	void create_computerPioneer_with_device() {
		assertEquals("Ada Lovelace is a pioneer in Computer Science who worked on it.", adaLovelace.toString());
	}
	@Test 
	void computerPioneer_should_worksOn_device(){
		assertEquals(true, adaLovelace.workson(babbageMachine));
		assertEquals(false, adaLovelace.workson(turingEngine));
		assertEquals(false, alanTuring.workson(babbageMachine));
		assertEquals(true, alanTuring.workson(turingEngine));
	}

}
