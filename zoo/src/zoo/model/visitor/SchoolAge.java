package zoo.model.visitor;

public class SchoolAge extends Child {

	public SchoolAge(Integer age) {
		super(age);
	}

	public String whoAmI() {
		return super.whoAmI() + " I am between 6 and 12 years old : I am a school age child!";
	}

	public Integer ticketPrice() {
		return 3;
	}

}
