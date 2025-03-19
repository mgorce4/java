package zoo.model.visitor;

public class Teenager extends Child {

	public Teenager(Integer age) {
		super(age);
	}

	public String whoAmI() {
		return super.whoAmI() + " I'm between 12 and 18 years old : I am a teenager!";
	}
	
	public Integer ticketPrice() {
		return 5;
	}

}
