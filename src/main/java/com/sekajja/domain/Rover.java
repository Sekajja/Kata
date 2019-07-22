package com.sekajja.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Rover implements Serializable {

	/**
	 * Class Represents the Mars Rover
	 */
	private static final long serialVersionUID = 4560069426596993615L;
	
	private static boolean STOP = true;
	
	private String name;
	private Coordinate startPoint;		
	private Coordinate currentPoint;
	private Direction directionFaced;
	
	
	public Rover(String name, Coordinate startPoint, Direction directionFaced) {
		super();
		this.name = name;
		this.startPoint = startPoint;
		this.directionFaced = directionFaced;
		this.currentPoint = startPoint;
	}
	
	
	
	public Coordinate moveFoward() {		
		
		
		//TODO: Implement a stop
		while(true) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northForward = currentPoint.getY();
					++northForward;
					currentPoint.setY(northForward);
					
					break;
				case South:
					
					Integer southForward = currentPoint.getY();
					--southForward;
					currentPoint.setY(southForward);
					
					break;
				case East:
					
					Integer eastForward = currentPoint.getX();
					++eastForward;
					currentPoint.setX(eastForward);
					
					break;
				case West:
					
					Integer westForward = currentPoint.getX();
					--westForward;
					currentPoint.setX(westForward);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
		}
		
	}

	
	public void moveBackward() {
		
		//TODO: Implement a stop
		while(true) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northBackward = currentPoint.getY();
					--northBackward;
					currentPoint.setY(northBackward);
					
					break;
				case South:
					
					Integer southBackward = currentPoint.getY();
					++southBackward;
					currentPoint.setY(southBackward);
					
					break;
				case East:
					
					Integer eastBackward = currentPoint.getX();
					--eastBackward;
					currentPoint.setX(eastBackward);
					
					break;
				case West:
					
					Integer westBackward = currentPoint.getX();
					++westBackward;
					currentPoint.setX(westBackward);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
		}
	}

	public void moveLeft() {
		
		while(true) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northLeft = currentPoint.getX();
					--northLeft;
					currentPoint.setX(northLeft);
					
					break;
				case South:
					
					Integer southLeft = currentPoint.getX();
					++southLeft;
					currentPoint.setX(southLeft);
					
					break;
				case East:
					
					Integer eastLeft = currentPoint.getY();
					++eastLeft;
					currentPoint.setY(eastLeft);
					
					break;
				case West:
					
					Integer westLeft = currentPoint.getY();
					--westLeft;
					currentPoint.setY(westLeft);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
		}
		
	}

	public void moveRight() {
		
		while(true) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northRight = currentPoint.getX();
					--northRight;
					currentPoint.setX(northRight);
					
					break;
				case South:
					
					Integer southRight = currentPoint.getX();
					++southRight;
					currentPoint.setX(southRight);
					
					break;
				case East:
					
					Integer eastRight = currentPoint.getY();
					++eastRight;
					currentPoint.setY(eastRight);
					
					break;
				case West:
					
					Integer westRight = currentPoint.getY();
					--westRight;
					currentPoint.setY(westRight);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
		}
	}


}
