package com.mahder.spring.study.codingtointerfaces;

import java.util.Comparator;

public class GeometricShapeComp implements Comparator<GeometricShape> {

	@Override
	public int compare(GeometricShape arg0, GeometricShape arg1) {
		if(arg0.calculateArea() > arg1.calculateArea()){
			return 1;
		}else{
			return -1;
		}
	}

}//end class
