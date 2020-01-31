package factoryMethod.Factory;

import factoryMethod.Product.Carro;
import factoryMethod.Product.FamilyCar;
import factoryMethod.Product.SportsCar;

public class FactoryCars {
	public static Carro ensambleCarros(String typeCar) {
		Carro carro = null;
		if(typeCar.equalsIgnoreCase("sports")) {
			carro = new SportsCar();
		}else if(typeCar.equalsIgnoreCase("family")) {
			carro = new FamilyCar();
		}else
			System.out.println(typeCar+" No esta definido");
		return carro;
	}
}
