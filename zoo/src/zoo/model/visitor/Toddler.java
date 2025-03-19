package zoo.model.visitor;

public class Toddler extends Child {

	public Toddler(Integer age) {
		super(age);
	}

	public String whoAmI() {
		return super.whoAmI() + " I am between 1 and 6 years old : I am a toddler!";
	}

	public Integer ticketPrice() {
		return 2;
	}

}
