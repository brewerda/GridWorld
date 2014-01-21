import info.gridworld.actor.Bug;
import java.awt.Color;

import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
public class JumpingBug extends Bug {
	private Location destination;
	public JumpingBug() {
		setColor(Color.RED);
	}
	public JumpingBug(Color color){
		setColor(color);
	}
	public boolean canMove()
	{
	    Grid<Actor> gr = getGrid();
	    if (gr == null)
	        return false;
	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection());
	    this.destination = next.getAdjacentLocation(getDirection());
	    if(!gr.isValid(next)) {
	    	return false;
	    }
	    if (!gr.isValid(destination))
	        return false;
	    Actor neighbor = gr.get(destination);
	    return (neighbor == null) || (neighbor instanceof Flower);
	    // ok to move into empty location or onto flower
	    // not ok to move onto any other actor
	}
	public void act() {
		if(canMove()) {
			
			moveTo(destination);
		} else {
			turn();
			
		}
	}
}