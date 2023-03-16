import com.project.spe.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
