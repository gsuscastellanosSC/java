package patronAbstractFactory.factoryMethod.factories;

import patronAbstractFactory.factoryMethod.products.ConcreteProduct;
import patronAbstractFactory.factoryMethod.products.Product;

public class ConcreteCreator extends Creator{
	//Ahora definimos el creador concreto
	public Product factoryMethod() {
	        return new ConcreteProduct();
	 }

}
