package control;

public class Main {

	public static void main(String[] args) {
		Joueuse marie = new Joueuse("Marie", "Dupont", 10, 1990, Poste.gardienne, "photo.jpg");
		
		System.out.println(marie.décrire());

	}

}
