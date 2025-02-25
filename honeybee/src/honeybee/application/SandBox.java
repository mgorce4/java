package honeybee.application;
import honeybee.model.Drone;
import honeybee.model.HoneyBee;
import honeybee.model.Queen;
import honeybee.model.Worker;

public class SandBox {
	private static void message(String text) {
        System.out.println(text);
    }

	public static void main(String[] args) {
		HoneyBee melli = new Queen("Mellifera");
		HoneyBee may = new Worker("Maya");
		HoneyBee will = new Drone("Willy");
		Queen firstQueen = (Queen) melli;
		Worker firstWorker = (Worker) may;
		
		message("Appel à getClass de la classe Object ");
		message("Classe de l'objet melli" + melli.getClass());
		message("Classe de l'objet may" + may.getClass());
		message("Classe de l'objet will" + will.getClass());
		
		message("Appel à getName de la classe via le mot clé class");
		message("Classe d'un objet class Queen.class" + (Queen.class).getName());
		message("Classe d'un objet class Worker.class" + (Worker.class).getName());
		message("Classe d'un objet class Drone.class" + (Drone.class).getName());
		
		message ("appel à getName de la classe via la méthode getClass()");
		message("Classe de l'objet melli" + melli.getName());
		message("Classe de l'objet may" + may.getName());
		message("Classe de l'objet will" + will.getName());
		
		message("operateur instanceof");
		if (melli instanceof HoneyBee) {
			message("melli est une instance de HoneyBee");
			}
		if (melli instanceof Queen) {
            message("melli est une instance de Queen");
            }
        if (melli instanceof Worker) {
            message("melli est une instance de Worker");
            }
        if (melli instanceof Drone) {
        	message("melli est une instance de Drone");
        
		}
	}

}
