package abstractFactoryCars.factories;

import abstractFactoryCars.concreteClass.CompanieFord;
import abstractFactoryCars.interfaces.Companie;

public class FordFactory extends AbstractFactoryCompanie{

	@Override
	public Companie getCompanie(String CompanieType) {
		System.out.println("Se creo una fabrica de Ford");
		return new CompanieFord("Ford");
	
	}

}
