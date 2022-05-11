package com.mirdu.demo_test1.cls;

public class Square {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Side=" + side;
	}
	public int area()
	{
		return side * side;
	}
	public int perimeter()
	{
		return 4 * side;
	}
}
