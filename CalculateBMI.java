package Questions;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstName, LastName;
		float w, h, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Firstname : ");
		FirstName = sc.nextLine();
		System.out.println("Enter Lastname : ");
		LastName = sc.nextLine();
		System.out.println("Weight : ");
		w = sc.nextFloat();
		System.out.println("Weight : ");
		h = sc.nextFloat();
		t = w / (h * h);
		System.out.println(FirstName + " " + LastName + " : ");
		if (t < 18.5) {
			System.out.println("Underweight");
		} else if (w >= 18.5 && w < 25) {
			System.out.println("Normal (healthy weight)");
		} else if (w >= 25 && w < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

	}

}
