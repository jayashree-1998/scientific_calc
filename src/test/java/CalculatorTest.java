import com.project.spe.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private Calculator objCalcUnderTest;
    private static final double DELTA = 1e-15;
    @Before
    public void setUp() {
        //Arrange
        objCalcUnderTest = new Calculator();
    }

    @Test
    public void FactorialTruePositive(){
        assertEquals("Finding factorial of a number", 120, objCalcUnderTest.factorial(5), DELTA);
        assertEquals("Finding factorial of a number", 720, objCalcUnderTest.factorial(6), DELTA);
    }

    @Test
    public void PowerTruePositive(){
        int a = 2, b = 3;
        double trueresult = 8.0;
        double result = objCalcUnderTest.power(a,b);
        assertEquals("Finding the power of a number raised to another (true positive)", trueresult, result, DELTA);
    }

    @Test
    public void SquareRootTruePositive() {
        assertEquals("Finding squareroot of a number (true positive)", 6, objCalcUnderTest.square_root(36), DELTA);
        assertEquals("Finding squareroot of a number (true positive)", 7, objCalcUnderTest.square_root(49), DELTA);
    }

    @Test
    public void SquareRootTrueNegative() {
        assertNotEquals("Finding the squareroot of a number (true negative)",4, objCalcUnderTest.square_root(25), DELTA);
        assertNotEquals("Finding the squareroot of a number (true negative)",5, objCalcUnderTest.square_root(36), DELTA);
    }

}
