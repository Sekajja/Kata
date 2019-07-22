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
					eastForward++;
					currentPoint.setX(eastForward);
					
					break;
				case West:
					
					Integer westForward = currentPoint.getX();
					westForward--;
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
					northBackward--;
					currentPoint.setX(northBackward);
					
					break;
				case South:
					
					Integer point = currentPoint.getY();
					point++;
					
					break;
				case East:
					
					Integer point = currentPoint.getX();
					point--;
					
					break;
				case West:
					
					Integer point = currentPoint.getX();
					point++;
					
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
					
					Integer point = currentPoint.getX();
					point--;
					
					break;
				case South:
					
					Integer point = currentPoint.getX();
					point++;
					
					break;
				case East:
					
					Integer point = currentPoint.getY();
					point++;
					
					break;
				case West:
					
					Integer point = currentPoint.getY();
					point--;
					
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
					
					Integer point = currentPoint.getX();
					point--;
					
					break;
				case South:
					
					Integer point = currentPoint.getX();
					point++;
					
					break;
				case East:
					
					Integer point = currentPoint.getY();
					point++;
					
					break;
				case West:
					
					Integer point = currentPoint.getY();
					point--;
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
		}
	}


}
