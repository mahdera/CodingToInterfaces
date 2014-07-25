/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

/**
 * @author alemayehu
 *
 */
public class Circle extends Point {
	private float radius;
	
	public Circle(){
		
	}
	
	public Circle(int x, int y, float radius){
		super(x,y);
		this.radius = radius;
	}
	
	public Circle(int x, int y, float radius, String name){
		super(x,y,name);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float calculateArea(){
		//area of a Circle is Pi * radius * radius
		return (float) (Math.PI * Math.pow(getRadius() , 2));
	}
	
	public float calculateCircumfrance(){
		//circumfrance of a circle is calcualted as ...2 * Pi * radius
		return (float) (2 * Math.PI * getRadius());
	}
	
}//end class
