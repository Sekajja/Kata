package com.sekajja.service;

import com.sekajja.domain.Rover;

public class RoverServiceImpl implements RoverService {

	@Override
	public Rover move(Rover rover, String[] commands) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rover moveFoward(Rover rover) {
		
		rover.moveFoward();
		
		return rover;
	}

	@Override
	public Rover moveBackward(Rover rover) {
		
		rover.moveBackward();
		
		return rover;
	}

	@Override
	public Rover moveLeft(Rover rover) {
		
		rover.moveLeft();
		
		return rover;
	}

	@Override
	public Rover moveRight(Rover rover) {
		
		rover.moveRight();
		
		return rover;
	}

}
