package computerPioneers;

public class Main {

	public static void main(String[] args) {
		Device babbageMachine = new Device("Babbage Analytical Machine",1837);
		ComputerPioneer adaLovelace = new ComputerPioneer("Ada","Lovelace",babbageMachine);
		System.out.println(babbageMachine);
		System.out.println(adaLovelace.toString());
		
		
		Device turingEngine = new Device("Turing Engine",1936);
		ComputerPioneer alanTuring = new ComputerPioneer("Alan", "Turing" , turingEngine);
		System.out.println(turingEngine);
		System.out.println(alanTuring);
		
		System.out.println("Test case 3:");
		System.out.println(line());
		System.out.println(adaLovelace.workson(babbageMachine));
		System.out.println(adaLovelace.workson(turingEngine));
		System.out.println(alanTuring.workson(babbageMachine));
		System.out.println(alanTuring.workson(turingEngine));
		System.out.println(line());
		
		System.out.println("Test case 4:");
		System.out.println(line());
		Device babbage = new Device("Babbage Analytical Machine",1837);
		Device turing = new Device("Turing Engine",1936);
		System.out.println(adaLovelace.workson(babbage));
		System.out.println(adaLovelace.workson(turing));
		System.out.println(alanTuring.workson(babbage));
		System.out.println(alanTuring.workson(turing));
		System.out.println(line());
		
		System.out.println(babbageMachine.equals(babbage));
		System.out.println(babbageMachine.equals(turing));
		System.out.println(turingEngine.equals(babbage));
		System.out.println(turingEngine.equals(turing));
		System.out.println(line());
	}
	
	public static String line() {
		return "----------------------";
	}

}
