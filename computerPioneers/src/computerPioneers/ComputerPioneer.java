package computerPioneers;

public class ComputerPioneer {
	private final String firstname;
	private final String lastname;
	private final Device device;
	
	public ComputerPioneer(String firstname, String lastname, Device device) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.device = device;
	}

	@Override
	public String toString() {
		return this.firstname + " " + this.lastname + " is a pioneer in Computer Science who worked on it.";
	}
	
	public Boolean workson(Device device) {
		if (this.device.equals(device)) {
			return true;
		}
		return false;
		
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Device getDevice() {
		return device;
	}
	
	
}
