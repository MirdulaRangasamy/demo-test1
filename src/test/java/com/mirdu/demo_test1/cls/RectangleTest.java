package com.mirdu.demo_test1.cls;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testArea1() {
		Rectangle r = new Rectangle(2,6);
		assertEquals(12,r.area());
	}

	@Test
	public void testArea2() {
		Rectangle r = new Rectangle(5,10);
		assertEquals(50,r.area());
	}
	@Test
	public void testPerimeter1() {
		Rectangle r = new Rectangle(2,6);
		assertEquals(16,r.perimeter());
	}
	@Test
	public void testPerimeter2() {
		Rectangle r = new Rectangle(5,10);
		assertEquals(30,r.perimeter());
	}
}
