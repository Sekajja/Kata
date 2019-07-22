package com.sekajja.domain;

public enum Direction {

	North, South, East, West;
	
	public static Direction getDefault(){
		return North;
	}
}
