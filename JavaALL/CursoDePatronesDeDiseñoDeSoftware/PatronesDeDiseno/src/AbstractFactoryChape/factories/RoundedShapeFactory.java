package AbstractFactoryChape.factories;

import AbstractFactoryChape.concreteClases.RoundedRectangle;
import AbstractFactoryChape.concreteClases.RoundedSquare;
import AbstractFactoryChape.interfaces.Shape;

public class RoundedShapeFactory extends AbstractFactory{

	public RoundedShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new RoundedRectangle();         
	     }else if(shapeType.equalsIgnoreCase("SQUARE")){
	        return new RoundedSquare();
	     }
		return null;
	}
	
}
