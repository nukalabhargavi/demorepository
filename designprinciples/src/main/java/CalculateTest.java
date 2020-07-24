
 import static org.junit.Assert.*;
import org.junit.*;
public class CalculateTest{   
    Calculator calculator;
     @Before
     public void objectCreation()
     {
    	calculator=new Calculator();
     }
	@Test
	public void test() throws Exception {
		assertEquals(5,calculator.computeCalculation(2, 3, "Addition"));
	}
	@Test
	public void test1() throws Exception {
		assertEquals(6,calculator.computeCalculation(2, 3, "Multiplication"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals(-1,calculator.computeCalculation(2, 3, "Subtraction"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals(1,calculator.computeCalculation(3, 2, "Division"));
	}

}
