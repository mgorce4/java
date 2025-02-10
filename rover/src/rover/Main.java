package rover;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		Rover viper = new Rover();
		System.out.println("viper is actually : " + viper.getLocation());
		System.out.println(viper.getPosition());
		System.out.println(viper.getDirection());
		System.out.println(viper.toString());
		System.out.println(line());
		
		Rover python = new Rover("python",new Position(5,10),Direction.EAST);
		System.out.println("python is actually : " + python.getLocation());
		System.out.println(python.getPosition());
		System.out.println(python.getDirection());
		System.out.println(python);
		System.out.println(line());
		
		Rover anaconda = new Rover("anaconda",new Position(20,30),Direction.SOUTH);
		System.out.println("anaconda is actually : " +anaconda.getLocation());
		System.out.println(anaconda.getPosition());
		System.out.println(anaconda.getDirection());
		System.out.println(anaconda);
		System.out.println(line());
		
		System.out.println(line());
		System.out.println("Test cases about turning right");
		System.out.println(line());
		System.out.println("viper is actually : " + viper.getLocation());
		viper.turnRight();
		System.out.println("viper is turning right");
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning right again");
		viper.turnRight();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning right again");
		viper.turnRight();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning right again");
		viper.turnRight();
		System.out.println("now " + viper.getLocation());
		
		System.out.println(line());
		System.out.println("Test cases about turning left");
		System.out.println(line());
		System.out.println("viper is actually : " + viper.getLocation());
		viper.turnLeft();
		System.out.println("viper is turning left");
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning left again");
		viper.turnLeft();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning left again");
		viper.turnLeft();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning left again");
		viper.turnLeft();
		System.out.println("now " + viper.getLocation());
		
		System.out.println(line());
		System.out.println("Test cases about turning right and moving");
		System.out.println(line());
		System.out.println("viper is actually : " + viper.getLocation());
		viper.turnRight();
		System.out.println("viper is turning right");
		System.out.println("now " + viper.getLocation());
		viper.move();
		viper.move();
		System.out.println("viper is moving twice");
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning right again");
		viper.turnRight();
		System.out.println("now " + viper.getLocation());
		viper.move();
		System.out.println("viper is moving once");
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning right again");
		viper.turnRight();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning right again");
		viper.turnRight();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now " + viper.getLocation());
		
		System.out.println(line());
		System.out.println("Test cases about turning left and moving");
		System.out.println(line());
		System.out.println("viper is actually " + viper.getLocation());
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning left again");
		viper.turnLeft();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is turning left again");
		viper.turnLeft();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now " + viper.getLocation());
		System.out.println(("viper is turning left again"));
		viper.turnLeft();
		System.out.println("now " + viper.getLocation());
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now " + viper.getLocation());
		
		
		System.out.println(line());
		System.out.println("Test cases about moving multiple times");
		System.out.println(line());
		System.out.println("viper is actually " + viper.getLocation());
		System.out.println("enter the number of time you want to move: ");
		Integer nombreDeDeplacements = keyboard.nextInt();
		viper.moveASelectedNumberOfTimes(nombreDeDeplacements);
		System.out.println("now " + viper.getLocation());
	}
	public static String line() {
		return "----------------------";
	}
}
