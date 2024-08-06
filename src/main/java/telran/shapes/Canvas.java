package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
    Shape[] shapes;
    public Canvas() {
        shapes = new Shape[0];
    }
    public void addShape(Shape shape) {
        shapes = Arrays.add(shapes, shape);
    }

    @Override
    public int perimeter() {
        int res = 0;
        for (int i = 0; i < shapes.length; i++){
            res += shapes[i].perimeter();
        } 
        return res;
    }

    @Override
    public int square() {
        int res = 0;
        for (int i = 0; i < shapes.length; i++){
            res += shapes[i].square();
        } 
        return res;
    }

    public int count() {
        //returns number of all shapes in a canvas object
        //example: canvas has one rectangle, one square, one canvas containing two squares 
        //for this example the method should return 5
        int res = 0;
        for (int i = 0; i < shapes.length; i++){
            res ++;
            if(shapes[i] instanceof Canvas canvas) {
                res += canvas.count();
            }
        } 
        return res;
    }   
}
