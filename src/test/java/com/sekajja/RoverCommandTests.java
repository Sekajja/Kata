package com.sekajja;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sekajja.domain.Coordinate;
import com.sekajja.domain.Direction;
import com.sekajja.domain.Rover;
import com.sekajja.service.RoverService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoverCommandTests {
	
	@Autowired
	RoverService service;
	
	@Test
	public void moveForwardTest() {
		
		/* Given: 
		 * Rover at position (2,2) and facing North
		 */
		Coordinate position = new Coordinate(2,2);
		Rover rover = new Rover("Mars Rover", position, Direction.North);
		
		/* When: 
		 * Rover moves forward 5 units
		 */
		rover.moveFowardByDistance(5);
		
		/* Then: 
		 * Rover goes to position (2,7)
		 */
		assertThat(rover.getCurrentPoint().getY()).isEqualTo(7);
		
		
	}
	
	@Test
	public void moveBackardTest() {
		
		/* Given: 
		 * Rover at position (2,7) and facing North
		 */
		Coordinate position = new Coordinate(2,7);
		Rover rover = new Rover("Mars Rover", position, Direction.North);
		
		/* When: 
		 * Rover moves backward 5 units
		 */
		rover.moveBackwardByDistance(5);
		
		/* Then: 
		 * Rover goes to position (2,2)
		 */
		assertThat(rover.getCurrentPoint().getY()).isEqualTo(2);		
		
	}
	
	
	@Test
	public void moveLeftTest() {
		
		/* Given: 
		 * Rover at position (7, 2) and facing North
		 */
		Coordinate position = new Coordinate(7,2);
		Rover rover = new Rover("Mars Rover", position, Direction.North);
		
		/* When: 
		 * Rover moves left 5 units
		 */
		rover.moveLeftByDistance(5);
		
		/* Then: 
		 * Rover goes to position (2,2)
		 */
		assertThat(rover.getCurrentPoint().getX()).isEqualTo(2);		
		
	}
	
	

}
