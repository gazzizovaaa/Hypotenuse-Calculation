import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);
		double a;
		double b;
		
		System.out.println("Enter side a: ");
		a = con.nextDouble();
		System.out.println("Enter side b: ");
		b = con.nextDouble();
		
		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("The hypotenuse is: " + c);
		con.close();
	}
}
