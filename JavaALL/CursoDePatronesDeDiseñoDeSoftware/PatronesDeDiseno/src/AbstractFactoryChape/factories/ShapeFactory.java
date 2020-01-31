package AbstractFactoryChape.factories;

import AbstractFactoryChape.concreteClases.Rectangle;
import AbstractFactoryChape.concreteClases.Square;
import AbstractFactoryChape.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		 if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
		return null;
	}

}
