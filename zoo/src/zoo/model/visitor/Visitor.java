package zoo.model.visitor;

public abstract class Visitor {
	protected Integer regularTicketPrice;
	
	public Visitor(Integer regularTicketPrice) {
		this.regularTicketPrice = regularTicketPrice;
	}

	public Visitor() {
		this.regularTicketPrice = 10;
	}
	
	public String sayHello() {
		return "Hello !";
	}
	
	public String whoAmI() {
		return "I am a visitor.";
	}
	
	public Integer ticketPrice() {
		return this.regularTicketPrice;
	}
}
