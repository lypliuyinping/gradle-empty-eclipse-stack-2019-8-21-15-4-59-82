
public class SportsCar extends Car{
	private	String lights;
	
	public SportsCar(String lights,String enginer, String wheels) {
		super(enginer, wheels);
		this.lights=lights;
		// TODO Auto-generated constructor stub
		
	}
	
	public void start() {
		System.out.println(lights +" are shining " + getEnginer() + " is on and " + getWheels()+ " are running!");
	}
	
	
}
