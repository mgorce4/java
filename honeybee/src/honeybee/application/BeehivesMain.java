package honeybee.application;


import java.util.Scanner;

import honeybee.model.Beehive;
import honeybee.model.Drone;
import honeybee.model.Espece;
import honeybee.model.HoneyBee;
import honeybee.model.Queen;
import honeybee.model.Worker;

public class BeehivesMain {
	
	
	
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
		String name;
		message(beehive1.presentationHive());
		questionWhenQueen();
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
		    	message("Entrer l'espece de l'ouvrière: ");
		        message("1. Abeille Noire");
		        message("2. Abeille Italienne");
		        message("3. Abeille Caucasienne");
		        choix = scanner.nextInt();
		        scanner.nextLine();
		        switch (choix) {
			        case 1:
                		addWorker(beehive1, Espece.Noire);
                		break;
			        case 2 :
			        	addWorker(beehive1, Espece.Italienne);
						break;
			        case 3:
			        	addWorker(beehive1, Espece.Caucasienne);
			        	break;
		        }
		        break;
		    case 3:
		    	message("Entrer l'espece du faux-bourdon: ");
		        message("1. Abeille Noire");
		        message("2. Abeille Italienne");
		        message("3. Abeille Caucasienne");
		        choix = scanner.nextInt();
		        scanner.nextLine();
		        switch (choix) {
			        case 1:
                		addDrone(beehive1, Espece.Noire);
                		break;
			        case 2 :
			        	addDrone(beehive1, Espece.Italienne);
						break;
			        case 3:
			        	addWorker(beehive1, Espece.Caucasienne);
			        	break;
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
	
	public static void questionWhenQueen() {
		message("1. Ajouter une reine");
		message("2. Ajouter une ouvrière");
		message("3. Ajouter un faux-bourdon");
		message("4. Quitter");
	}
	public static void questionWhenNoQueen() {
		message("1. Ajouter une ouvrière");
		message("2. Ajouter un faux-bourdon");
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
		String name;
		message(beehive1.presentationHive());
		questionWhenNoQueen();
		choice = scanner.nextInt(); // Assign value to the existing choice variable
		scanner.nextLine();
		choice = choice + 1;
		switch (choice) {
		case 2:
			message("Entrer le nom de l'ouvrière: ");
			name = scanner.nextLine();
			addWorker(beehive1, name);
			break;
		case 3:
			message("Entrer le nom du faux-bourdon: ");
			name = scanner.nextLine();
			addDrone(beehive1, name);
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
