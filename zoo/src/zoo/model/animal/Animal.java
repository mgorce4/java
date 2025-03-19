package zoo.model.animal;

import zoo.model.Noisy;

public abstract class Animal implements Noisy{
	protected final String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String name() {
		return this.name;
	}
}
