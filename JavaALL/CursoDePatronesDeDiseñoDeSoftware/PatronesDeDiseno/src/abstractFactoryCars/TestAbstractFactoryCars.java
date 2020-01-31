package abstractFactoryCars;

import abstractFactoryCars.factories.FactoryProducerCompanie;

public class TestAbstractFactoryCars {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FactoryProducerCompanie.factoryProducerCompanie("Chevrolet").createCar("Familiar").showData());
		
	}
}
