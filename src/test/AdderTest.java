package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Adder;

class AdderTest {

	@Test
	public void test() {
		Adder add = new Adder();
		int actual = add.add(1,2);
		int expected = 3;
		assertEquals(expected, actual);
	}

}
