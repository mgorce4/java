package beehive.model;


public class Worker extends HoneyBee {

	public Worker(Espece espece) {
		super(espece);
	}

	@Override
	public String doYourJob() {
		return super.doYourJob() + "I'm a worker, I work all day!";
	}
}
