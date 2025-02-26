package honeybee.model;

import java.util.ArrayList;
import java.util.Objects;

public class Beehive {
	private ArrayList<HoneyBee> colony = new ArrayList<>();
	private String name;
	
	
	public Beehive(ArrayList<HoneyBee> colony, String name) {
		super();
		this.colony = colony;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<HoneyBee> getColony() {
		return colony;
	}

	public ArrayList<HoneyBee> addHoneyBee(HoneyBee honeyBee) {
		colony.add(honeyBee);
		return colony;
	}
	
	public String presentationHive() {
		int nbQueens = 0;
		int nbWorkers = 0;
		int nbDrones = 0;
		for (HoneyBee honeyBee : colony) {
			if (honeyBee instanceof Queen) {
				nbQueens++;
			}
			if (honeyBee instanceof Worker) {
				nbWorkers++;
			}
			if (honeyBee instanceof Drone) {
				nbDrones++;
			}
		}
		return "la colonie de la ruche" + this.name + "\ncontient actuellement " + colony.size() + " abeille(s) \n -> " + nbQueens + " reine(s) \n -> " + nbWorkers + " ouvrière(s) \n -> " + nbDrones + "faux-bourdon(s)";
	}
	
	public Integer nbOfQueens() {
		int nbQueens = 0;
		for (HoneyBee honeyBee : colony) {
			if (honeyBee instanceof Queen) {
				nbQueens++;
			}
		}
		return nbQueens;
	}


	@Override
	public int hashCode() {
		return Objects.hash(colony, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beehive other = (Beehive) obj;
		return Objects.equals(colony, other.colony) && Objects.equals(name, other.name);
	}
	
	
	

	
	
}
