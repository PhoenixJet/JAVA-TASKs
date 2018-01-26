public class Pojo {
	private float Radius;

	public Pojo(float radius) {
		Radius = radius;
	}

	public float getRadius() {
		return Radius;
	}

	public void setRadius(float radius) {
		Radius = radius;
	}

	public void area() {
		double area = 3.14 * Radius * Radius;
		System.out.println("Area : "+area);
	}

	public float diameter() {
		float diam = 2 * Radius;
		return diam;
	}

	public double Circumference() {
		double Circum = 2 * Radius * 3.14;
		return Circum;

	}
}
