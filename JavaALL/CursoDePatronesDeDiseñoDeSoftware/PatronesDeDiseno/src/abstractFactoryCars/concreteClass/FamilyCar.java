package abstractFactoryCars.concreteClass;

import abstractFactoryCars.interfaces.Car;

public class FamilyCar implements Car{
	String name;
	String speed;
		
	public FamilyCar(String name, String speed) {
		this.name = name;
		this.speed = speed;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSpeed() {
		return speed;
	}



	public void setSpeed(String speed) {
		this.speed = speed;
	}



	@Override
	public String showData() {
		// TODO Auto-generated method stub
		return "SportCar [name=" + name + ", speed=" + speed + "]";
	}

}
