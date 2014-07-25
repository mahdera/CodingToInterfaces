/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

/**
 * @author alemayehu
 *
 */
public abstract class GeometricShape implements Shape {
	private int x;
	private int y;
	private String geometricShapeName; 

	public GeometricShape() {

	}
	
	public GeometricShape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public GeometricShape(int x, int y, String geometricShapeName){
		this(x,y);
		this.geometricShapeName = geometricShapeName;
	}

	public String getGeometricShapeName() {
		return geometricShapeName;
	}



	public void setGeometricShapeName(String geometricShapeName) {
		this.geometricShapeName = geometricShapeName;
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}// end class
