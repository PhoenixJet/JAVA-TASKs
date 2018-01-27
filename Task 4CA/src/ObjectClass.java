
public class ObjectClass {

	private int radius;

	ObjectClass(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public boolean equals(Object o) {
		if (o instanceof ObjectClass) {
			ObjectClass circle = (ObjectClass) o;
			return getRadius() == circle.getRadius();
		}
		return false;

	}
}
