/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

/**
 * @author alemayehu
 *
 */
public class Triangle extends GeometricShape {
	private float base;
	private float height;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mahder.spring.study.codingtointerfaces.Shape#calculateArea()
	 */
	@Override
	public float calculateArea() {
		//area of a triangle is calculated as 1/2 * base * height
		return (getBase() * getHeight()) * 0.5f;
	}

	public Triangle() {

	}

	public Triangle(int x, int y, float base, float height, String name) {
		super(x, y, name);
		this.base = base;
		this.height = height;
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
