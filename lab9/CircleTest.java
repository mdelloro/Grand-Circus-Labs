package lab9;

import junit.framework.Assert;
import org.junit.Test;

public class CircleTest {

	@Test
	public void whenRadius1ExpectCircumference6_28() {
	Circle circle = new Circle(1);
	String myCircumference = circle.getFormattedCircumference();
	Assert.assertEquals("6.28", myCircumference);
	}
	@Test
	public void whenRadius0ExpectCircumference0() {
	Circle circle = new Circle(0);
	String myCircumference = circle.getFormattedCircumference();
	Assert.assertEquals("0", myCircumference);
	}
	
	
	@Test
	public void whenRadius1ExpectCircumference6_28_dos() {
		Circle circle = new Circle (1);
		double myCircumference = circle.getCircumference();
		Assert.assertEquals(6.28,  myCircumference); 0.01);
	}
	
}
