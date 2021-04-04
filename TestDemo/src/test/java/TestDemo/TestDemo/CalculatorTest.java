package TestDemo.TestDemo;

import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void setUp() throws Exception{
		calc = new Calculator();
	}
	
}
