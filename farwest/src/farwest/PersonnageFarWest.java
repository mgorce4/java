package farwest;

public class PersonnageFarWest {
	protected String prenom;
	protected final String nom;
	
	public PersonnageFarWest(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public void tirerAuPistolet() {
		//TODO
	}
	
	public String decrire() {
		return "Je suis " + this.prenom + " " + this.nom + "!";
	}

}
