import java.util.Scanner;

public class CAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of the circle to find-out circle area, dia, circumference");
		float radius = sc.nextInt();
		Pojo demo = new Pojo(radius);
		demo.area();
		System.out.println("Diameter: " + demo.diameter());
		System.out.println("Circumference: " + demo.Circumference());
	}

}
