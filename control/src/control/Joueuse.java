package control;

public class Joueuse {
	private final String prenom;
	private String nom;
	private Integer numero;
	private final Integer anneeNaissance;
	private Poste poste;
	private String photo;
	
	public Joueuse(String prenom, String nom, Integer numero, Integer anneeNaissance, Poste poste ,String photo) {
		this.prenom = prenom;
		this.nom = nom;
		this.numero = numero;
		this.anneeNaissance = anneeNaissance;
		this.poste = poste;
		this.photo = null;
		
	}
	
	public String décrire() {
		if (this.photo != null) {
			return "(Photo disponible) : " + this.prenom + " " + this.nom + "(n° " + this.numero + ") est " + this.poste +". Elle est née en " + this.anneeNaissance;
        } else {
			return "(Photo indisponible) : " + this.prenom + " " + this.nom + "(n° " + this.numero + ") est " + this.poste +". Elle est née en " + this.anneeNaissance;

		}
		
	}
	

}
