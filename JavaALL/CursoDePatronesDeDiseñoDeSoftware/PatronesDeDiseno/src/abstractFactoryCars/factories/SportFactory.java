package abstractFactoryCars.factories;

import abstractFactoryCars.concreteClass.SportCar;
import abstractFactoryCars.interfaces.Car;

public class SportFactory extends AbstractFactoryCar{

	@Override
	public Car getCar(String typeCar) {
		System.out.println("Se creo un auto "+typeCar);
		return new SportCar("Deportivo", "300 km/h");
	}


}
