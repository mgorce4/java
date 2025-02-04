package computerPioneers;

import java.util.Objects;

public class Device {
	private final String name ;
	private final Integer inventionYear;
	
	public Device(String name,Integer inventionYear) {
		super();
		this.name=name;
		this.inventionYear = inventionYear;
	}
	@Override
	public String toString() {
		return "The " + this.name + " was invented in "+ this.inventionYear+"."; 
	}
	
	public String getname() {
		return name;
	}
	
	public Integer getyear() {
		return inventionYear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(inventionYear, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return Objects.equals(inventionYear, other.inventionYear) && Objects.equals(name, other.name);
	}

		
}
