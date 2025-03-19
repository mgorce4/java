package farwest;

public class Enfant extends PersonnageFarWest {
	
	private Integer age;
	
	public Enfant(String prenom, String nom, Integer age) {
		super(prenom, nom);
		this.age = age;
	}
	
	
	public void faireDesBêtises() {
		// TODO
	}
	
	public String decrire() {
		
		return super.decrire() + " J'ai " + this.age + " ans";
	}

}
