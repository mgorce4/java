package canard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.Canard;
import canard.model.CanardEnPlastique;
import canard.model.Colvert;
import canard.model.Leurre;
import canard.model.Mandarin;
import canard.model.PrototypeCanard;

class CanardTest {

	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler !";
	private static final String PROPULSION_A_REACTION = "Je vole avec un réacteur";

	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "...Silence...";

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;
	Canard prototypeCanard;

	@BeforeEach
	private void extracted() {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
		prototypeCanard = new PrototypeCanard("PrototypeCanard");
	}

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.effectuerVol();
		assertEquals(VOLER, texteVolColvert);

		// on peut inliner les assert
		// car ici le code de test est simple à lire
		assertEquals(VOLER, mandarin.effectuerVol());
		assertEquals(NE_PAS_VOLER, prototypeCanard.effectuerVol());
		assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
		prototypeCanard.setComportementVol(() -> PROPULSION_A_REACTION);
		assertEquals(PROPULSION_A_REACTION, prototypeCanard.effectuerVol());
	}

	@Test
	public void test_effectuerCancan() {

		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());
		assertEquals(SILENCE, prototypeCanard.effectuerCancan());
		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(COINCOIN, canardPlastique.effectuerCancan());
	}

	@Test
	public void test_nager() {

		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());
		assertEquals(NAGER, prototypeCanard.nager());
		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.getNom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.getNom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.getNom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
		
		assertEquals("PrototypeCanard", prototypeCanard.getNom());
		assertEquals("Je suis un prototype de canard", prototypeCanard.afficher());
	}
	
	@Test
	public void changer_cancan() {
		colvert.setComportementCancan(() -> "Je fais un autre cancan");
		assertEquals("Je fais un autre cancan", colvert.effectuerCancan());
	}
	
	@Test
	public void changer_vol() {
		colvert.setComportementVol(() -> "Je vole différemment");
		assertEquals("Je vole différemment", colvert.effectuerVol());
	}

}
