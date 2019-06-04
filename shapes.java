import java.util.Scanner;

/* A simple program that asks a user for a shape in which they want to know the area and
 *  perimeter of.
*/

public class shapes{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		int userChoice;
		double side1, side2, area, perimeter, radius, circumference;
		System.out.println("\nWhat shape would you like to find the area and perimeter of?");
		System.out.println("1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n5. Exit");

		userChoice = sc.nextInt();
		
		switch(userChoice){
		case 1:
			System.out.println("What is the length of 1 side of the square");
			side1 = sc.nextDouble();
			area = side1 * side1;
			perimeter = side1 * 4;
			System.out.println("Square area: " + area + "\nPerimeter: " + perimeter);
			break;
		case 2:
			System.out.println("What is the length of one side of the rectangle?");
			side1 = sc.nextDouble();
			System.out.println("What is the length of the other side of the rectangle?");
			side2 = sc.nextDouble();
			area = side1 * side2;
			perimeter = (side1 * 2) + (side2 * 2);
			System.out.println("Square area: " + area + "\nPerimeter: " + perimeter);
			break;
		case 3:
			System.out.println("What is the radius of the circle?");
			radius = sc.nextDouble();
			area = Math.PI * (radius * radius);
			circumference = Math.PI * 2*radius;
			System.out.println("Circle area: " + area + "\nCircumference: " + circumference);
			break;
		case 4: 
			System.out.println("Triangle stuff...");
			break;
		case 5:
			System.out.println("Laterzzz!!!");
			break;
		default:
			System.out.println("Next time, try better...");
			break;
		}
	}
}
