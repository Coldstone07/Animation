

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS	
	public void walk(int dir) {
		// WALK!
		moveByAmount(dir,0);
	}

	public void jump() {
		// JUMP!
		moveToLocation(x, y -20);
	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
		y++;
		for(Shape shapes : obstacles) {
			
			if(shapes.getBounds().getY() != y) {
				
			}
			
		}
		
	}


}
