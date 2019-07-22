package com.sekajja.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Coordinate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2816251140860741163L;
	
	private Integer x;
	private Integer y;
	
	
	
	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	}



	public Coordinate(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

}
