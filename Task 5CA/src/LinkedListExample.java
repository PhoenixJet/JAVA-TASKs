import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// Creating list of Books
		List<Collection_Items> list = new LinkedList<Collection_Items>();
		// Creating Books
		Collection_Items b1 = new Collection_Items(101, "Let us C", 8);
		Collection_Items b2 = new Collection_Items(102, "Data Communications & Networking", 4);
		Collection_Items b3 = new Collection_Items(103, "Operating System",  6);
		Collection_Items b4 = new Collection_Items(104, "Windows operating system",  9);
		Collection_Items b5 = new Collection_Items(105, "Shell Scripting",  5);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		// Traversing list
		for (Collection_Items b : list) {
			System.out.println(b.id + " " + b.name + " " + b.price + " ");
		}
		List<Collection_Items> list1=new LinkedList<Collection_Items>();  
	    //Creating Books  
		Collection_Items b11=new Collection_Items(111,"Lord of Rings",8);  
		Collection_Items b21=new Collection_Items(112,"van helsing",4);  
		Collection_Items b31=new Collection_Items(113,"Hound at Blue Sky",6);  
	    //Adding Books to list  
	    list1.add(b11);  
	    list1.add(b21);  
	    list1.add(b31);  
	    //Traversing list  
	    for(Collection_Items b:list1){  
	    System.out.println(b.id + " " + b.name + " " + b.price + " ");  
	    }  
	}
}
