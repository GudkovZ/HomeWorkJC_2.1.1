import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator sut = new Calculator();

    @BeforeAll
    public static void startedAll() {
        System.out.println("All tests started!");
    }

    @BeforeEach
    public void started() {
        System.out.println("This test started!");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("All tests finished!");
    }

    @AfterEach
    public void finished() {
        System.out.println("This test finished!");
    }

    @Test
    public void additionTest() {
        double a = 37;
        double b = 11;
        double expected = 48;

        double result = sut.addition(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void subtractionTest() {
        double a = 37;
        double b = 11;
        double expected = 26;

        double result = sut.subtraction(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void multiplicationTest() {
        double a = 37;
        double b = 11;
        double expected = 407;

        double result = sut.multiplication(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void divisionTest() {
        int a = 37;
        int b = 11;
        int expected = 3;

        int result = sut.division(a, b);

        assertEquals(expected, result);
    }
}