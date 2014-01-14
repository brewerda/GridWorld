
import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
	private int sideLength;
	private int steps;
	public SpiralBug(int length)
	{
	    steps = 0;
	    sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act()
	{
	    if (steps < sideLength && canMove())
	    {
	        move();
	        steps++;
	    }
	    else
	    {
	        turn();
	        turn();
	        sideLength++;
	        steps = 0;
	    }
	}
}