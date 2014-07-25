/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

/**
 * @author alemayehu
 *
 */
public class Rectangle extends GeometricShape {
	private float base;
	private float height;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mahder.spring.study.codingtointerfaces.Shape#calculateArea()
	 */
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Rectangle() {

	}

	public Rectangle(int x, int y, float base, float height, String name) {
		super(x, y, name);
		this.base = base;
		this.height = height;
	}

	public float calculatePerimeter() {
		return (2 * getBase()) + (2 * getHeight());
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}// end class
