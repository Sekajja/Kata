package com.sekajja.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Rover implements Serializable {

	/**
	 * Class Represents the Mars Rover
	 */
	private static final long serialVersionUID = 4560069426596993615L;
	
	
	
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
	
	
	public void moveFoward() {		
		
		while(true) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northForward = currentPoint.getY();
					++northForward;
					currentPoint.setY(northForward % 100);
					
					break;
				case South:
					
					Integer southForward = currentPoint.getY();
					--southForward;
					currentPoint.setY(southForward % -100);
					
					break;
				case East:
					
					Integer eastForward = currentPoint.getX();
					++eastForward;
					currentPoint.setX(eastForward % 100);
					
					break;
				case West:
					
					Integer westForward = currentPoint.getX();
					--westForward;
					currentPoint.setX(westForward % -100);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
			
		}
		
	}
	
	public void moveBackward() {
		
		while(true) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northBackward = currentPoint.getY();
					--northBackward;
					currentPoint.setY(northBackward % -100);
					
					break;
				case South:
					
					Integer southBackward = currentPoint.getY();
					++southBackward;
					currentPoint.setY(southBackward % 100);
					
					break;
				case East:
					
					Integer eastBackward = currentPoint.getX();
					--eastBackward;
					currentPoint.setX(eastBackward % -100);
					
					break;
				case West:
					
					Integer westBackward = currentPoint.getX();
					++westBackward;
					currentPoint.setX(westBackward % 100);
					
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
					currentPoint.setX(northLeft % -100);
					
					break;
				case South:
					
					Integer southLeft = currentPoint.getX();
					++southLeft;
					currentPoint.setX(southLeft % 100);
					
					break;
				case East:
					
					Integer eastLeft = currentPoint.getY();
					++eastLeft;
					currentPoint.setY(eastLeft % 100);
					
					break;
				case West:
					
					Integer westLeft = currentPoint.getY();
					--westLeft;
					currentPoint.setY(westLeft % -100);
					
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
					currentPoint.setX(northRight % -100);
					
					break;
				case South:
					
					Integer southRight = currentPoint.getX();
					++southRight;
					currentPoint.setX(southRight % 100);
					
					break;
				case East:
					
					Integer eastRight = currentPoint.getY();
					++eastRight;
					currentPoint.setY(eastRight % 100);
					
					break;
				case West:
					
					Integer westRight = currentPoint.getY();
					--westRight;
					currentPoint.setY(westRight % -100);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
		}
	}
	
	
	
	public void moveFowardByDistance(Integer distance) {		
		
		Integer i = 0;
		
		
		while(i < Math.abs(distance)) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northForward = currentPoint.getY();
					++northForward;
					currentPoint.setY(northForward % 100);
					
					break;
				case South:
					
					Integer southForward = currentPoint.getY();
					--southForward;
					currentPoint.setY(southForward % -100);
					
					break;
				case East:
					
					Integer eastForward = currentPoint.getX();
					++eastForward;
					currentPoint.setX(eastForward % 100);
					
					break;
				case West:
					
					Integer westForward = currentPoint.getX();
					--westForward;
					currentPoint.setX(westForward % 100);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
			i++;
			
		}
		
		this.startPoint = currentPoint;
		
	}
	
	public void moveBackwardByDistance(Integer distance) {
		
		
		Integer i = 0;
		
		while(i < Math.abs(distance)) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northBackward = currentPoint.getY();
					--northBackward;
					currentPoint.setY(northBackward % -100);
					
					break;
				case South:
					
					Integer southBackward = currentPoint.getY();
					++southBackward;
					currentPoint.setY(southBackward % 100);
					
					break;
				case East:
					
					Integer eastBackward = currentPoint.getX();
					--eastBackward;
					currentPoint.setX(eastBackward % -100);
					
					break;
				case West:
					
					Integer westBackward = currentPoint.getX();
					++westBackward;
					currentPoint.setX(westBackward % 100);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
			i++;
			
		}
		
		this.startPoint = currentPoint;
	}

	public void moveLeftByDistance(Integer distance) {
		
		Integer i = 0;
		
		while(i < Math.abs(distance)) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northLeft = currentPoint.getX();
					--northLeft;
					currentPoint.setX(northLeft % -100);
					
					break;
				case South:
					
					Integer southLeft = currentPoint.getX();
					++southLeft;
					currentPoint.setX(southLeft % 100);
					
					break;
				case East:
					
					Integer eastLeft = currentPoint.getY();
					++eastLeft;
					currentPoint.setY(eastLeft % 100);
					
					break;
				case West:
					
					Integer westLeft = currentPoint.getY();
					--westLeft;
					currentPoint.setY(westLeft % -100);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
			i++;
			
		}
		
		this.startPoint = currentPoint;
		
	}

	public void moveRightByDistance(Integer distance) {
		
		Integer i = 0;
		
		while(i < Math.abs(distance)) {
			
			switch(this.directionFaced) {
				
				case North:
					
					Integer northRight = currentPoint.getX();
					--northRight;
					currentPoint.setX(northRight % -100);
					
					break;
				case South:
					
					Integer southRight = currentPoint.getX();
					++southRight;
					currentPoint.setX(southRight % 100);
					
					break;
				case East:
					
					Integer eastRight = currentPoint.getY();
					++eastRight;
					currentPoint.setY(eastRight % 100);
					
					break;
				case West:
					
					Integer westRight = currentPoint.getY();
					--westRight;
					currentPoint.setY(westRight % -100);
					
					break;
					
				default:
					//Don't move if command is unclear, we could lose a Rover
					break;
			}
			
			i++;
			
		}
		
		this.startPoint = currentPoint;
	}


}
