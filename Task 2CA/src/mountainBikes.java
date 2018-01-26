
public class mountainBikes extends Bicycle{

	public void description(){
		System.out.println("mountain bikes have an additional chain ring, giving them a lower gear ratio.");
		} 
	
	public static void main(String args[]) {
	      int a = 30;
	      mountainBikes demo = new mountainBikes();
	      demo.currentSpeed(a);
	      demo.currentPedalCadence(a);
	      demo.currentGear(a+1);
	      demo.description();
	      
	   }


}
