package beehive.application;

import java.util.Scanner;

import beehive.model.Beehive;
import beehive.model.Drone;
import beehive.model.Espece;
import beehive.model.HoneyBee;
import beehive.model.Queen;
import beehive.model.Worker;

public class BeehiveMain {
	private static void message(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

        // 1. Get Beehive Information
        System.out.print("Enter beehive name: ");
        String beehiveName = scanner.nextLine();
        
		Beehive beehive1 = new Beehive(new java.util.ArrayList<>(), beehiveName);
		int choice = 0; // Declare choice once
        String espece ;

        try {
        	
            while (choice != 4) {
            	if (beehive1.nbOfQueens() == 0) {
                choice = menuWithNoQueen(scanner, beehive1);
                }
            	else {
            		choice = menuWithQueen(scanner, beehive1);
            	}
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
		
	}

	private static int menuWithNoQueen(Scanner scanner, Beehive beehive1) {
		int choice;
		int choix;
		int nbAbeilles;
		message(beehive1.presentationHive());
		questionWhenNoQueen();
		choice = scanner.nextInt(); // Assign value to the existing choice variable
		scanner.nextLine(); // Consume newline
		switch (choice) {
		    case 1:
		        message("Entrer l'espece de la reine: ");
		        message("1. Abeille Noire");
		        message("2. Abeille Italienne");
		        message("3. Abeille Caucasienne");
		        choix = scanner.nextInt();
		        scanner.nextLine();
		        switch (choix) {
			        case 1:
                		addQueen(beehive1, Espece.Noire);
                		break;
			        case 2 :
						addQueen(beehive1, Espece.Italienne);
						break;
			        case 3:
			        	addQueen(beehive1, Espece.Caucasienne);
			        	break;
		        }
		        break;
		    case 2:
		    	choice = 4;
		        message("Au revoir");
		        break;
		    default:
		        message("Choix invalide.");
		}
		return choice;
	}
	
	public static void questionWhenNoQueen() {
		message("1. Ajouter une reine");
		message("2. Quitter");
	}
	public static void questionWhenQueen() {
		message("1. Ajouter un groupe d'ouvrières");
		message("2. Ajouter un  groupe de faux-bourdons");
		message("3. Quitter");
	}
	
	public static void addQueen(Beehive beehive, Espece espece) {
		HoneyBee queen = new Queen(espece);
		beehive.addHoneyBee(queen);
	}
	
	public static void addWorker(Beehive beehive, Espece espece) {
		HoneyBee worker = new Worker(espece);
		beehive.addHoneyBee(worker);
	}

	public static void addDrone(Beehive beehive, Espece espece) {
		HoneyBee drone = new Drone(espece);
		beehive.addHoneyBee(drone);
	}
	
	
	private static int menuWithQueen(Scanner scanner, Beehive beehive1) {
		int choice;
		int choix;
		int nbAbeilles;
		message(beehive1.presentationHive());
		questionWhenQueen();
		choice = scanner.nextInt(); // Assign value to the existing choice variable
		scanner.nextLine();
		choice = choice + 1;
		switch (choice) {
		case 2:
			message("Entrer l'espece de l'ouvrière: ");
	        message("1. Abeille Noire");
	        message("2. Abeille Italienne");
	        message("3. Abeille Caucasienne");
	        choix = scanner.nextInt();
	        scanner.nextLine();
	        message("Entrer le nombre d'ouvrières: ");
	        nbAbeilles = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch (choix) {
		        case 1:
		        	for (int i = 0; i < nbAbeilles; i++) {
		        		addWorker(beehive1, Espece.Noire);
		        	}
            		break;
		        case 2 :
		        	for (int i = 0; i < nbAbeilles; i++) {
		        		addWorker(beehive1, Espece.Italienne);
		        	}
					break;
		        case 3:
					for (int i = 0; i < nbAbeilles; i++) {
						addWorker(beehive1, Espece.Caucasienne);
					}
		        	break;
		        default:
                	message("Choix invalide.");
                	
	        }
	        break;
		case 3:
			message("Entrer l'espece du faux-bourdon: ");
	        message("1. Abeille Noire");
	        message("2. Abeille Italienne");
	        message("3. Abeille Caucasienne");
	        choix = scanner.nextInt();
	        scanner.nextLine();
	        message("Entrer le nombre de faux-bourdons: ");
	        nbAbeilles = scanner.nextInt();
	        scanner.nextLine();
	        switch (choix) {
		        case 1:
					for (int i = 0; i < nbAbeilles; i++) {
						addDrone(beehive1, Espece.Noire);
					}
            		break;
		        case 2 :
					for (int i = 0; i < nbAbeilles; i++) {
						addDrone(beehive1, Espece.Italienne);
					}
					break;
		        case 3:
					for (int i = 0; i < nbAbeilles; i++) {
						addDrone(beehive1, Espece.Caucasienne);
					}
		        	break;
		        default:
                	message("Choix invalide.");
	        }
			break;
		case 4:
			message("Au revoir");
			break;
		default:
			message("Choix invalide.");
		}
		return choice;
	}
}
