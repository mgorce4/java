package farwest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class Main {

	
	public static void line() {
		System.out.println("----------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		Collection<Bandit> bandits = new ArrayList<>();
		
		Cheval jollyJumper = new Cheval("Jolly Jumper", "appaloosa");
		System.out.println(jollyJumper.decrire());
		
		Heros luckyLuke = new Heros("Lucky", "Luke", "cow-boy", jollyJumper);
		System.out.println(luckyLuke.decrire());
		
		Bandit joeDalton = new Bandit(150, false, "Joe", "Dalton");
		System.out.println(joeDalton.decrire());
		joeDalton.mettreEnPrison();
		System.out.println(joeDalton.decrire());
		joeDalton.libererDePrison();
		System.out.println(joeDalton.decrire());
		
		bandits.add(joeDalton);
		bandits.add(new Bandit(100, true, "William", "Dalton"));
		bandits.add(new Bandit(120, false, "Jack", "Dalton"));
		bandits.add(new Bandit(130, true, "Averell", "Dalton"));
		
		Collections.sort((ArrayList<Bandit>) bandits, new ComparateurTaille());
		line();
		System.out.println("Liste des bandits :");
		line();
		for (Bandit bandit : bandits) {
			System.out.println(bandit.decrire());
		}
		
		line();
		System.out.println("liste des bandits triés par taille décroissante :");
		line();
		Collections.sort((ArrayList<Bandit>) bandits, new ComparateurTaille());
		for (int i = bandits.size() - 1; i >= 0; i--) {
			System.out.println(((ArrayList<Bandit>) bandits).get(i).decrire());
		}

	}

}
