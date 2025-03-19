package zoo.model.visitor;

public class Adult extends Visitor {
	
	
	public String whoAmI() {
		return super.whoAmI() + " I am an adult.";
	}
	
	public Integer ticketPrice() {
		return super.ticketPrice();
	}
}
