package zoo.model.visitor;

public abstract class Child extends Visitor{
	protected Integer age;
	
	public Child(Integer age) {
		this.age = age;
	}
	
	public String whoAmI() {
		return super.whoAmI() + " I am a child.";
	}
	

}
