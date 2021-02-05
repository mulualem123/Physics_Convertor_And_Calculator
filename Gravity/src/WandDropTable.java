import java.util.Scanner;

/*Kidus G*
* Mulualem H
*Date 12/3/18
*This program calculates the distance an object travels when dropped from some high
*Asks for the Gravitation acceleration of the earth where the object is at */
public class WandDropTable {
	static Scanner input = new Scanner(System.in);
	static double gravity; 

	public static void main(String[] args) {
		System.out.println("What is the Gravitational acceleration of the planet?");
		System.out.println("Enter 9.81 for Earth \n");
		gravity = input.nextDouble();
		System.out.println("Time\tDistance");
		for (int time = 0; time <= 10; time++) {
			double distance;
			distance = 0.5 * gravity * time * time;
			System.out.println(time + " s" + "\t" + distance);
		}
	}

}
