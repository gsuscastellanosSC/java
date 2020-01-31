package AbstractFactoryChape;

import AbstractFactoryChape.interfaces.Shape;
import AbstractFactoryChape.factories.AbstractFactory;
import AbstractFactoryChape.factories.FactoryProducer;

public class AbstractFactoryPatternDemo {
	   public static void main(String[] args) {
	      //get rounded shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      //get an object of Shape Rounded Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape1.draw();
	      //get an object of Shape Rounded Square 
	      Shape shape2 = shapeFactory.getShape("SQUARE");
	      //call draw method of Shape Square
	      shape2.draw();
	      //get rounded shape factory
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      //get an object of Shape Rectangle
	      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape3.draw();
	      //get an object of Shape Square 
	      Shape shape4 = shapeFactory1.getShape("SQUARE");
	      //call draw method of Shape Square
	      shape4.draw();
	      
	   }
	}
