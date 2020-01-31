package abstractFactory;

public abstract class AbstractFactoryCars {
	String manufacturer;
	
	public AbstractFactoryCars() {
		
	}
	
	public abstract Carro createCar(String typeCar); 
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "AbstractFactory [manufacturer=" + manufacturer + "]";
	}
	
	public static FactoryCarsChevrolet getFactory(String manufacturer) {
		FactoryCarsChevrolet  factoryCarsChevrolet = null;
		if (manufacturer.equalsIgnoreCase("Chevrolet")) {
			factoryCarsChevrolet = new FactoryCarsChevrolet();
			
		}else if (manufacturer.equalsIgnoreCase("ford")) {
			factoryCarsChevrolet = new FactoryCarsChevrolet();
		}
		return factoryCarsChevrolet;
	}
}
