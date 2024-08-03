package telran.shapes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class RectangleTests {
@Test
void perimeterTest() {
    Rectangle rectangle = new Rectangle(10,15);
    assertEquals(50, rectangle.perimeter());
    Rectangle rectangle1 = new Rectangle(1,2);
    assertEquals(6, rectangle1.perimeter());
}
@Test
void squareTest() {
    Rectangle rectangle = new Rectangle(10,15);
    assertEquals(150, rectangle.square());
    Rectangle rectangle1 = new Rectangle(1,2);
    assertEquals(2, rectangle1.square());
}
}
