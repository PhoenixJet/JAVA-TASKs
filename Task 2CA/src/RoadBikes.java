
public class RoadBikes extends Bicycle{

	public void dropHandlebars(){
		System.out.println("These Handles are conjucated two bended 'J' Hollow SS-Pipes");
		} 
	
	public static void main(String args[]) {
	      int a = 30;
	      RoadBikes demo = new RoadBikes();
	      demo.currentSpeed(a);
	      demo.currentPedalCadence(a);
	      demo.currentGear(a);
	      demo.dropHandlebars();
	      
	   }

}
