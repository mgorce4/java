package honeybee.model;

public abstract class HoneyBee {
	protected final String name ;
	
	protected HoneyBee(String name) {
		this.name = name;
	}
	
	public String doYourJob() {
		return this.name + " I'm a honeybee!";
	}
	public String fly() {
		return "I believe, I can fly!";
	}

	public String getName() {
		return name;
	}
	
}
