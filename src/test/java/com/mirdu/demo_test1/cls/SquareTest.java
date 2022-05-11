package com.mirdu.demo_test1.cls;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testArea() {
		assertEquals(25,new Square(5).area());
	}

	@Test
	public void testPerimeter() {
		assertEquals(20,new Square(5).perimeter());
	}

	@Test
	public void testToString()
	{
		assertEquals("Side=5",new Square(5).toString());
	}
}
