package beehive.model;



public class Queen extends HoneyBee{
	
	public Queen(Espece espece) {
		super(espece);
		
	}

	@Override
	
	public String doYourJob() {
		return super.doYourJob() + "I'm the Queen, any questions?";
	}
}
