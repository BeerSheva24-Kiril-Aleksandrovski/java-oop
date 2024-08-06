package telran.shapes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CanvasTests {
@Test
void perimeterTest() {
    Canvas canvas = new Canvas();
    assertEquals(0, canvas.perimeter());
    canvas.addShape(new Rectangle(10, 15));
    assertEquals(50, canvas.perimeter());
    canvas.addShape(new Square(10));
    assertEquals(90, canvas.perimeter());
}
@Test
void SquareTest () {
    Canvas canvas = new Canvas();
    assertEquals(0, canvas.square());
    canvas.addShape(new Rectangle(10, 15));
    assertEquals(150, canvas.square());
    canvas.addShape(new Square(10));
    assertEquals(250, canvas.square());
}
@Test
void countTest() {
    Canvas canvas1 = new Canvas();
    Canvas canvas2 = new Canvas();
    
    canvas1.addShape(new Rectangle(5, 5));
    canvas1.addShape(new Square(4));

    canvas2.addShape(new Square (3));
    canvas2.addShape(new Square(4));
    
    canvas1.addShape(canvas2);
    assertEquals(5, canvas1.count());
}
}
