import org.junit.Test;
import static org.junit.Assert.*;

public class STDCalculatorTest {

    @Test
    public void calcMeanTest() throws Exception {
    double [] input  = {4.0,6.0};
    assertEquals(5,STDCalculator.calcMean(input),.0001);
    }

    @Test
    public void calcSTDTest() throws Exception {
        double [] input = {4,6};
        double average =5;
        assertEquals(1 , STDCalculator.calcSTD(input,average),.00001);

    }

}