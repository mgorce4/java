package farwest;



public class Bandit extends PersonnageFarWest implements  EtreCapableDeTirerAvecUneArmeAFeu,  Comparable<Bandit> {
	private Integer taille;
	private Boolean estEnPrison;
	
	public Bandit(Integer taille, Boolean estEnPrison, String prenom, String nom) {
		super(prenom,nom);
		this.taille = taille;
		this.estEnPrison = estEnPrison;
	}
	
	public Bandit() {
		this(0,false,"John","Doe");
	}

	public String decrire() {
		String temp = super.decrire();
		if (this.estEnPrison) {
			temp = temp + "Je mesure " + this.taille + " et je suis en prison";
		}
		else {
			temp = temp + "Je mesure " + this.taille + " et je suis libre";
		}
		return temp;
	}

	
	public void faireUnBraquage() {
		//TODO
	}
	
	public Boolean mettreEnPrison() {
		return this.estEnPrison = true;
	}
	
	public Boolean libererDePrison() {
		return this.estEnPrison = false;
	}

	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
        return this.prenom;
    }
	
	public Integer getTaille() {
		return this.taille;
	}
	
	@Override
	public void tirerAuPistolet() {
		System.out.println("Je tire au pistolet: .....Pan.....Pan.....Pan");
	}

	@Override
	public int compareTo(Bandit o) {
		return this.taille.compareTo(o.taille);
	}
}
