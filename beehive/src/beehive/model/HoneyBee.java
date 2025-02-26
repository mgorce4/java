package beehive.model;



public abstract class HoneyBee {
	Espece espece;
	
	protected HoneyBee(Espece espece) {
		this.espece = espece;
	}
	
	public String doYourJob() {
		return this.espece.name() + " I'm a honeybee!";
	}
	public String fly() {
		return "I believe, I can fly!";
	}

	public String getName() {
		return espece.name();
	}
	
}

