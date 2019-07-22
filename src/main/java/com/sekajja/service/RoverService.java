package com.sekajja.service;

import com.sekajja.domain.Rover;

public interface RoverService {
	
	public Rover move(Rover rover, String commands);
	
	public Rover move(Rover rover, char[] commands);
	
	public Rover moveFoward(Rover rover);
	
	public Rover moveBackward(Rover rover);
	
	public Rover moveLeft(Rover rover);
	
	public Rover moveRight(Rover rover);

	

}
