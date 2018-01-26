
public class Tandem extends Bicycle {
	public void seats(){
		System.out.println("No.of Seats: 2");
		} 
	public void Handles(){
		System.out.println("No.of Handles: 2");
		}
	public static void main(String args[]) {
	      int a = 20;
	      Tandem demo = new Tandem();
	      demo.currentSpeed(a);
	      demo.currentPedalCadence(a);
	      demo.currentGear(a);
	      demo.seats();
	      demo.Handles();
	   }

}
