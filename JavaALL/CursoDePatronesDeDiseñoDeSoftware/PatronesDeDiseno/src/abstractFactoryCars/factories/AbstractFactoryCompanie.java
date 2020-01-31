package abstractFactoryCars.factories;

import abstractFactoryCars.interfaces.Companie;

public abstract class AbstractFactoryCompanie {

	public abstract Companie getCompanie(String companieType);

}
