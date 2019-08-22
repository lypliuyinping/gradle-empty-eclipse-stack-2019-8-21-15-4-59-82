
public class Car {
	private String enginer;
	private String wheels;
	
	public Car(String enginer,String wheels) {
		this.enginer = enginer;
		this.wheels = wheels;
	}
	
	
	public String getEnginer() {
		return enginer;
	}


	public void setEnginer(String enginer) {
		this.enginer = enginer;
	}


	public String getWheels() {
		return wheels;
	}


	public void setWheels(String wheels) {
		this.wheels = wheels;
	}


	public void start() {
		System.out.println(enginer + " is on " + wheels+ " are running!");
	}

}
