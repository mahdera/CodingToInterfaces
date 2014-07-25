/**
 * 
 */
package com.mahder.spring.study.codingtointerfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author alemayehu
 *
 */
public class TestGeometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		//first lets create the abstract class bean
		List<GeometricShape> geometricShapeList = new ArrayList<GeometricShape>();
		Point point = (Point) applicationContext.getBean("point");
		geometricShapeList.add(point);
		Circle circle = (Circle) applicationContext.getBean("circle");
		//circle.setRadius(100);
		geometricShapeList.add(circle);
		Cylindar cylindar = (Cylindar) applicationContext.getBean("cylindar");
		geometricShapeList.add(cylindar);
		Rectangle rectangle = (Rectangle) applicationContext.getBean("rectangle");
		geometricShapeList.add(rectangle);
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		geometricShapeList.add(triangle);
		//now lets sort the list in ascending order...
		Collections.sort(geometricShapeList, new GeometricShapeComp());
		//now I've added all the sub classes to the superclass List object...its time
		//to polymorphically call the calculate method
		if(!geometricShapeList.isEmpty()){
			Iterator<GeometricShape> geometricShapeItr = geometricShapeList.iterator();
			while(geometricShapeItr.hasNext()){
				GeometricShape gShape = geometricShapeItr.next();
				System.out.println("Area of "+gShape.getGeometricShapeName()+" is : "+
				gShape.calculateArea());
			}//end while loop
		}
		
		//
		//Rectangle rectangle = (Rectangle) applicationContext.getBean("rectangle");
		System.out.println("done");
	}

}//end class
