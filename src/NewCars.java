
public abstract class NewCars implements Car {
	public int  carSpeed(int distance, int time){
		int speed = distance*time;
		return speed;
	}
	abstract public String model();

}
