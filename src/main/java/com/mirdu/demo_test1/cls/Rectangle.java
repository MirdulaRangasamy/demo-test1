package com.mirdu.demo_test1.cls;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "len="+length+",bdh="+breadth;
	}
	
	public int area()
	{
		return length * breadth;
	}
	public int perimeter()
	{
		return 2 * (length + breadth);
	}
}
