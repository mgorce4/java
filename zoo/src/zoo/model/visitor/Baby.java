package zoo.model.visitor;

import zoo.model.Noisy;

public class Baby extends Child implements Noisy{
	
	public Baby(Integer age) {
		super(age);
	}

	public Baby() {
		super(0);
	}

	public String whoAmI() {
		return super.whoAmI() + " I'm under 1 years old : I am a baby!";
	}

	public String noise() {
		return "Waaaaaaaaaaaaaa";
	}

	public Integer ticketPrice() {
		return 0;
	}
	

}
