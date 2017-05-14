
public class Ambassador extends NewCars implements Car {

	
	@Override
	public String model() {
		String s = "Ambassador basic model";
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewCars obj = new Ambassador();
		//Ambassador obj1 = new Ambassador();
		//Ambassador obj2 = new Ambassador();
		
		int speed = obj.carSpeed(Car.speed, 5);
		String model = obj.model();
		System.out.println("Speed  :  " + speed);
		System.out.println("Model  :  " + model);

		
	}

}
