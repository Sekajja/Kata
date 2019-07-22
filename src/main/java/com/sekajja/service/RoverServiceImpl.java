package com.sekajja.service;

import org.springframework.stereotype.Service;

import com.sekajja.domain.Rover;

@Service
public class RoverServiceImpl implements RoverService {

	@Override
	public Rover move(Rover rover, char[] commands) {
		
		
		
		for(char command: commands) {
			
			switch(command) {
			
			case 'f':
				
				rover.moveFowardByDistance(1);
				
				break;
			case 'b':
				
				rover.moveBackwardByDistance(1);
				
				break;
			case 'l':
				
				rover.moveLeftByDistance(1);
				
				break;
			case 'r':
				
				rover.moveRightByDistance(1);
				
				break;
				
			default:
				//Don't move if command is unclear, we could lose a Rover
				break;
		}
		}
		
		return rover;
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
