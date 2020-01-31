package abstractFactory;

public class TestCarsFactories {

	public TestCarsFactories() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AbstractFactoryCars.getFactory("Chevrolet"));
		System.out.println(AbstractFactoryCars.getFactory("Chevrolet").createCar("sports"));
		System.out.println(AbstractFactoryCars.getFactory("Chevrolet").createCar("family"));
		System.out.println(AbstractFactoryCars.getFactory("Chevrolet").createCar("otro"));
	}

}
