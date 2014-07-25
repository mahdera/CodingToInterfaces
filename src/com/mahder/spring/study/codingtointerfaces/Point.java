/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

/**
 * @author alemayehu
 *
 */
public class Point extends GeometricShape {	
	@Override
	public float calculateArea() {		
		return 0.0f;		
	}
	
	public Point(){
		
	}
	
	public Point(int x, int y){
		super(x,y);
	}
	
	public Point(int x, int y, String name){
		super(x,y,name);
	}

}//end class
