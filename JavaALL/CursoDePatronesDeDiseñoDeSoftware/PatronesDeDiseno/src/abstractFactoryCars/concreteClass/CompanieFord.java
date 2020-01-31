package abstractFactoryCars.concreteClass;

import abstractFactoryCars.factories.FactoryProducerCar;
import abstractFactoryCars.interfaces.Car;
import abstractFactoryCars.interfaces.Companie;

public class CompanieFord implements Companie{
	String name;
	

	public CompanieFord(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String showData() {
		// TODO Auto-generated method stub
		return "CompanieChevorlet [name=" + name + "]";
	}


	@Override
	public Car createCar(String typeCar) {
		// TODO Auto-generated method stub
		return FactoryProducerCar.factoryProducerCar(typeCar);
	}

}
