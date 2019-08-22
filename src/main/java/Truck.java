
public class Truck extends Car {
	private String payload;
	public Truck(String enginer, String wheels,String payload) {
		super(enginer, wheels);
		this.payload=payload;
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println("tips, " + getEnginer() + " is on and " + getWheels()+ " are running!");
	}
	public void load() {
		System.out.println(payload  + " is loading goods" );
	}
}
