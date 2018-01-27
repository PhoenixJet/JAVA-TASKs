
public class Mainclass {
	public static void main(String[] args) {
		ObjectClass obj1=new ObjectClass(5);
		ObjectClass obj2=new ObjectClass(5);
		ObjectClass obj3=new ObjectClass(10);
		if(obj1.equals(obj3)) {
			System.out.println("object 1 & 2 has same data ");
		}
		else {
			System.err.println("object 1 & 2 has different data ");
		}
	}

}
