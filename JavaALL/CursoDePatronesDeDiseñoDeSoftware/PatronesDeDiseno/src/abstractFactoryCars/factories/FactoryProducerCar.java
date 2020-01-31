package abstractFactoryCars.factories;

import abstractFactoryCars.interfaces.Car;

public class FactoryProducerCar {

	public static Car factoryProducerCar (String carType) {
		if (carType.equalsIgnoreCase("DEPORTIVO")) {
			return new SportFactory().getCar(carType);
		}else if (carType.equalsIgnoreCase("FAMILIAR")) {
			return new FamilyFactoryCar().getCar(carType);
		}else {
			return new Car() {
				
				@Override
				public String showData() {
					// TODO Auto-generated method stub
					return "Imposible crear el carro de tipo "+carType;
				}
			};
		}
	}

}
