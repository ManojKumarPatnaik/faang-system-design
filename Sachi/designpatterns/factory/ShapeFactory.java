package factory;

import factory.shapes.Circle;
import factory.shapes.Pentagon;
import factory.shapes.Rectangle;
import factory.shapes.Shape;

public class ShapeFactory {

    public Shape createShape(String shapeName) {

        Shape shape = null;
        if (shapeName == null) return null;

        switch (shapeName) {
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Pentagon":
                shape = new Pentagon();
                break;
        }
        return shape;
    }

}
