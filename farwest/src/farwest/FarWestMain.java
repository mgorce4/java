package farwest;

import java.util.Arrays;
import java.util.Collection;

public class FarWestMain {
	private static final String LIGNE = "---------------------------------------------------";

	public static void main(String[] args) {

		Cheval jollyJumper = new Cheval("Jolly Jumper", "appaloosa");
		Heros luckyLuke = new Heros("Lucky", "Luke", "cow-boy", jollyJumper);

		Bandit joeDalton = new Bandit(150, false ,"Joe", "Dalton");
		Bandit averellDalton = new Bandit( 190, false, "Averell", "Dalton");

		Bourgeois zacharieMartins = new Bourgeois("Zacharie", "Martins", "inventeur");
		Enfant phineas = new Enfant("Phineas", "Luck" , 10);

		System.out.println(LIGNE);
		System.out.println("Les personnages de la caravanne sont : ");

		Collection<PersonnageFarWest> personnagesDansLaCaravane = Arrays.asList(luckyLuke, joeDalton, averellDalton,
				zacharieMartins, phineas);

		for (PersonnageFarWest personnage : personnagesDansLaCaravane) {
			System.out.println(personnage.decrire());
		}

		System.out.println(LIGNE);
		System.out.println("Les personnages capable de tirer au pistolet sont : ");

		Collection<PersonnageFarWest> personnagesCapableDeTirerAuPistolet = (Collection<PersonnageFarWest>) Arrays.asList(luckyLuke,joeDalton, averellDalton, zacharieMartins);

		for (PersonnageFarWest tireurAuPistolet : personnagesCapableDeTirerAuPistolet) {
			afficherPrenomEtNom((PersonnageFarWest) tireurAuPistolet);
			tireurAuPistolet.tirerAuPistolet();
		}

	}

	private static void afficherPrenomEtNom(PersonnageFarWest personnage) {
		System.out.print(personnage.prenom() + " " + personnage.nom() + " ! ");
	}
}
