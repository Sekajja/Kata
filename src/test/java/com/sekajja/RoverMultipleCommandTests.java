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
public class RoverMultipleCommandTests {
	
	@Autowired
	RoverService service;
	
	@Test
	public void moveTest() {
		
		/* Given: 
		 * Rover at position (2,2) and facing North
		 */
		Coordinate position = new Coordinate(2,2);
		Rover rover = new Rover("Mars Rover", position, Direction.North);
		
		/* When: 
		 * Rover moves forward 5 units
		 */
		service.move(rover, new char[]{'f', 'f', 'f'});
		
		/* Then: 
		 * Rover goes to position (2,7)
		 */
		assertThat(rover.getCurrentPoint().getY()).isEqualTo(5);
		
		
	}
	

}