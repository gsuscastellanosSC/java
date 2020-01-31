package abstractFactoryCars.factories;

import abstractFactoryCars.interfaces.Car;

public abstract class AbstractFactoryCar {

	public abstract Car getCar(String typeCar);
	
}
