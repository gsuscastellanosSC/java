package patronAbstractFactory.factoryMethod.products;
//implementación concreta del producto PRODUCT
public class ConcreteProduct implements Product{

	@Override
	public void operacion() {
		System.out.println("Operación Concreta del producto");
	}

}
