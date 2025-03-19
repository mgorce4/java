package farwest;

public class Bourgeois extends PersonnageFarWest {
	private String profession;
	
	public Bourgeois(String nom, String prenom, String profession) {
		super(nom, prenom);
		this.profession = profession;
	}
	
	public void faireDesAffaires() {
		//TODO
	}
	
	public String decrire() {
		String temp = super.decrire();
		temp = temp + " Je suis un " + this.profession;
		return temp;
	}
	
	public void tirerAuPistolet() {
		System.out.println("Je tire très mal au pistolet: ........Pan.....");
	}
}
