package abstractFactoryCars.factories;

import abstractFactoryCars.concreteClass.FamilyCar;
import abstractFactoryCars.interfaces.Car;



public class FamilyFactoryCar extends AbstractFactoryCar{

	@Override
	public Car getCar(String typeCar) {
		// TODO Auto-generated method stub
		System.out.println("Se creo un auto Familiar");
		return new FamilyCar("Familiar","80 km/h");
	}

}
