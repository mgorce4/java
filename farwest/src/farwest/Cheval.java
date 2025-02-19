package farwest;

public class Cheval {
	private String nom;
	private final String race;
	
	public Cheval(String nom, String race) {
		this.nom = nom;
		this.race = race;
	}
	
	
	public String decrire() {
		return this.nom + " de race " + this.race;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getRace() {
		return race;
	}
	
	
}
