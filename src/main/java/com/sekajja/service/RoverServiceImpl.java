package com.sekajja.service;

import org.springframework.stereotype.Service;

import com.sekajja.domain.Rover;

@Service
public class RoverServiceImpl implements RoverService {

	@Override
	public Rover move(Rover rover, char[] commands) {
		
		return null;
	}
	
	@Override
	public Rover move(Rover rover, String commands) {
		
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
