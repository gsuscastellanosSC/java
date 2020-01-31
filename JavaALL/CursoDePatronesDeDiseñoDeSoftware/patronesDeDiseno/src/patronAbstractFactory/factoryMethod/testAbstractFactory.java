package patronAbstractFactory.factoryMethod;

import patronAbstractFactory.factoryMethod.factories.ConcreteCreator;
import patronAbstractFactory.factoryMethod.factories.Creator;
import patronAbstractFactory.factoryMethod.products.Product;

public class testAbstractFactory {

	public static void main(String[] args) {
		Creator aCreator = new ConcreteCreator();
		Product producto = aCreator.factoryMethod();
		producto.operacion();
	}

}
