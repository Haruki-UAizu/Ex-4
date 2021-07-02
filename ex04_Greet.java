import java.util.Scanner;
import java.util.Random;

class ex04_Greet {
    public static void main(String[] args){
	int i = 0;
	int j = 0;
	String name;
	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);

	//Asking Username
	System.out.println("What is your name?");
	name = scanner.next();
	System.out.println("Hello, " + name + "!");

	//Rolling dice
	System.out.println("Rolling the dice...");
	i = rand.nextInt(6) + 1;
	j = rand.nextInt(6) + 1;
	
	System.out.println("Die 1: " + i);
	System.out.println("Die 2: " + j);
	System.out.println("Total value: " + (i + j));
    }
}
