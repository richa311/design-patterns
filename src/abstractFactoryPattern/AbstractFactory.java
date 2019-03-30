package abstractFactoryPattern;

public abstract class AbstractFactory {
	abstract Colour getColour(String Colour);
	abstract Shape getShape(String Shape);
}
