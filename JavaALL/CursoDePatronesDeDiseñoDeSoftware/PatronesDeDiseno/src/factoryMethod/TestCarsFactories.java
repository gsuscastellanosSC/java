package factoryMethod;
import factoryMethod.Factory.FactoryCars;

public class TestCarsFactories {

	public TestCarsFactories() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FactoryCars.ensambleCarros("sports"));
		
		System.out.println(FactoryCars.ensambleCarros("family"));
		
		System.out.println(FactoryCars.ensambleCarros("otor"));
	}

}
