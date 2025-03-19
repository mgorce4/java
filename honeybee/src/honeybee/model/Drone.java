package honeybee.model;


public class Drone extends HoneyBee{
	
	
	public Drone(Espece espece) {
		super(espece);
	}

	@Override
	public String doYourJob() {
		return super.doYourJob() + "I'm a drone, I'm going to date our queen";
	}
	
	
}
