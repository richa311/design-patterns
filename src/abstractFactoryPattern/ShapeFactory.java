package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Colour getColour(String Colour) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if(shapeType == null){
			return null;
		}		

		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();

		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();

		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}

		return null;
	}

}
