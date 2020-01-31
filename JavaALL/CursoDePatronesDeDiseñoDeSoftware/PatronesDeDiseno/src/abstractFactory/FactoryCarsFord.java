package abstractFactory;

public class FactoryCarsFord extends AbstractFactoryCars{
	
	public FactoryCarsFord() {
		setManufacturer("Chevrolet");
	}
	@Override
	public Carro createCar(String typeCar) {
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
