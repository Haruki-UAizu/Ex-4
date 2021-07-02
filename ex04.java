import java.util.Scanner;
import java.util.Random;

class ex04 {
    public static void main(String[] args){
	int i = 0;
	int j = 0;
	Random rand = new Random();
	//Scanner scanner = new Scanner(System.in);

	System.out.println("Rolling the dice...");
	i = rand.nextInt(6) + 1;
	j = rand.nextInt(6) + 1;
	
	System.out.println("Die 1: " + i);
	System.out.println("Die 2: " + j);
	System.out.println("Total value: " + (i + j));

	if(i + j > 7){
	    System.out.println("You won!");
	}
        else{
	    System.out.println("You lost.");
	}
    }
}
