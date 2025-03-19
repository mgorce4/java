package farwest;

public class Heros extends PersonnageFarWest implements EtreCapableDeTirerAvecUneArmeAFeu{
	private String profession;
	private Cheval cheval;
	
	public Heros(String prenom, String nom, String profession, Cheval cheval) {
		super(prenom, nom);
		this.profession = profession;
		this.cheval = cheval;
	}
	
	public Heros() {
		this("John", "Doe", "Cowboy", new Cheval("Silver", "Mustang"));
	}
	
	public String decrire() {
		String temp = super.decrire();
		temp = temp + " Je suis un " + this.profession + "et mon cheval est " + cheval.getNom() + " de race " + cheval.getRace();
		return temp;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void monterCheval() {
        this.cheval = cheval;
    }
	
	public void attrapper(Bandit bandit) {
		System.out.println("Le bandit " + bandit.getNom() + " a été attrapé par le héros " + this.getNom());
	}
	
	@Override
	public void tirerAuPistolet() {
		System.out.println("Je tire plus vite au pistolet / ..Pan..Pan..Pan");
	}
}
