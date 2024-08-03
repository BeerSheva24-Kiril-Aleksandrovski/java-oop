package telran.shapes;

public class Rectangle implements Shape {
    private int width;
    private int heigth;
    public Rectangle(int width, int heigth){
        this.width = width;
        this.heigth = heigth;
    }
    
    @Override
    public int perimeter() {
        return 2 * (width + heigth);
    }

    @Override
    public int square() {
        return width * heigth;
    }    
}
