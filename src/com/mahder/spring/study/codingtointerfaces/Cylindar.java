/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

/**
 * @author alemayehu
 *
 */
public class Cylindar extends Circle {
	private float height;

	public Cylindar() {

	}

	public Cylindar(int x, int y, float radius, float height) {
		super(x, y, radius);
		this.height = height;
	}

	public Cylindar(int x, int y, float radius, float height, String name) {
		super(x, y, radius, name);
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public float calculateArea(){
		//area of a cylindar is calcualted as 
		//2*Pi*radius sq + base.height (circumfrance of circle * height)
		return (2 * super.calculateArea()) + (super.calculateCircumfrance() * getHeight());
	}

}// end class
