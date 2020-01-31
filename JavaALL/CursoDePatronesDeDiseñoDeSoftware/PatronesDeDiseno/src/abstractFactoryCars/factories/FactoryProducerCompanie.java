package abstractFactoryCars.factories;

import abstractFactoryCars.interfaces.Car;
import abstractFactoryCars.interfaces.Companie;

public class FactoryProducerCompanie {

	public static Companie factoryProducerCompanie (String companieType) {
		
		if(companieType.equalsIgnoreCase("FORD")) {
			return new FordFactory().getCompanie(companieType);
		}else if (companieType.equalsIgnoreCase("CHEVROLET")) {
			return new ChevoletFactorie().getCompanie(companieType);
		}else
			System.out.println("La empresa : "+companieType+" No puede ser creada");
			return new Companie() {
				
				@Override
				public String showData() {
					// TODO Auto-generated method stub
					return "Sin ningun dato para mostar";
				}
				
				@Override
				public Car createCar(String typeCar) {
					// TODO Auto-generated method stub
					System.out.println("No se ha creado ningún vehiculo");
					return null;
				}
			};
	}
}
