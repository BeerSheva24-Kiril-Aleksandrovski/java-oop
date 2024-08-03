package telran.shapes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SquareTests {
@Test()
void perimeterTest() {
    assertEquals(4, new Square(1).perimeter());
    assertEquals(64, new Square(16).perimeter());
}
@Test
void squareTest() {
    assertEquals(1, new Square(1).square());
    assertEquals(256, new Square(16).square());
}
}
