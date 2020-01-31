package abstractFactoryCars.factories;

import abstractFactoryCars.concreteClass.CompanieChevorlet;
import abstractFactoryCars.interfaces.Companie;

public class ChevoletFactorie extends AbstractFactoryCompanie{

	@Override
	public Companie getCompanie(String CompanieType) {
		// TODO Auto-generated method stub
		System.out.println("Se creo una fabrica de Chevrolet");
		return new CompanieChevorlet("Chevrolet");
	}

}
