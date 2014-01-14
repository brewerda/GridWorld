import info.gridworld.actor.Bug;


public class CircleBug extends Bug {
	private int sideLength;
	private int steps;
	public CircleBug(int length)
	{
	    steps = 0;
	    sideLength = length;
	}
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
	        //turn();
	        steps = 0;
	    }
	}
}