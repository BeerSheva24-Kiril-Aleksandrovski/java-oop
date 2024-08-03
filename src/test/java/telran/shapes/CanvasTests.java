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
}
