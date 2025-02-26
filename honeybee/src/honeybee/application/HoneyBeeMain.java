package honeybee.application;

import java.util.Collection;
import java.util.LinkedHashSet;

import honeybee.model.Drone;
import honeybee.model.HoneyBee;
import honeybee.model.Queen;
import honeybee.model.Worker;

public class HoneyBeeMain {
	
	private static void message(String text) {
		System.out.println(text);
	}

	private static void line() {
        message("--------------------------------");
        }
	public static void main(String[] args) {
		someHoneyBees();
		line();
		arrayOfHoneyBees();
		line();
		collectionOfHoneyBees();
		
	}
	private static void arrayOfHoneyBees() {
		HoneyBee[] honeyBees = {new Queen("Mellifera"), new Worker("Maya"), new Worker("Marguerite"), new Worker("Propolis"), new Drone("Willy"), new Drone("Didier")};
		line();
		message("Array of honeybees");
		line();
		for(int i = 0; i<honeyBees.length;i++) {
			message(honeyBees[i].doYourJob());
		}
		line();
		for (HoneyBee honeyBee : honeyBees) {
			message(honeyBee.fly());
		}
		line();
	}
	private static void someHoneyBees() {
		line();
		message(" Some honeybees ");
		line();
		
		HoneyBee queen = new Queen("Mellifera");
		HoneyBee firstWorker = new Worker("Maya");
		HoneyBee secondWorker = new Worker("Marguerite");
		HoneyBee thirdWorker = new Worker("Propolis");
		HoneyBee firstDrone = new Drone("Willy");
		HoneyBee secondDrone = new Drone("Didier");

		message(queen.doYourJob());
		message(firstWorker.doYourJob());
		message(secondWorker.doYourJob());
		message(thirdWorker.doYourJob());
		message(firstDrone.doYourJob());
		message(secondDrone.doYourJob());

        line();
        
        message(queen.fly());
        message(firstWorker.fly());
        message(secondWorker.fly());
        message(thirdWorker.fly());
        message(firstDrone.fly());
        message(secondDrone.fly());
	}
	private static void collectionOfHoneyBees() {
		int nbQueens = 0;
		int nbWorkers = 0;
		int nbDrones = 0;
		
		Collection<HoneyBee> honeyBees = new LinkedHashSet<>(); 

	    honeyBees.add(new Queen("Mellifera"));
	    honeyBees.add(new Worker("Maya"));
	    honeyBees.add(new Drone("Willy"));
	    honeyBees.add(new Worker("Marguerite"));
	    honeyBees.add(new Worker("Propolis"));
	    honeyBees.add(new Drone("Didier"));
		
		line();
		message("Collection of honeybees");
		for (HoneyBee honeyBee : honeyBees) {
			line();
			message(honeyBee.doYourJob());
			message(honeyBee.fly());
		}
		line();
		
		for (HoneyBee honeyBee : honeyBees) {
			if (honeyBee instanceof Queen) {
				nbQueens++;
			}
			if (honeyBee instanceof Worker) {
				nbWorkers++;
			}
			if (honeyBee instanceof Drone) {
				nbDrones++;
			}
		}
		message("Number of queens: " + nbQueens);
		message("Number of workers: " + nbWorkers);
		message("Number of drones: " + nbDrones);
	}
}
