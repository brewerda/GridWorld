import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.ActorWorld;

public class MatingCritter extends Critter{
	public void processActors(ArrayList<Actor> actors) {
		//ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(critter);
		ActorWorld world = new ActorWorld();
		int dir = this.getDirection();
		Location critter = getLocation();
		dir += 180;
		Location next = critter.getAdjacentLocation(dir);
		Location twoAway = next.getAdjacentLocation(dir);
		Location origin = new Location(5,5);

		ArrayList<Actor> occupied = getGrid().getNeighbors(critter);
		for (Actor a : occupied) {
			if (getGrid().isValid(twoAway) && getGrid().get(twoAway) == null) {
				if (a instanceof Critter) {
					MatingCritter MatingCritter = new MatingCritter();
					MatingCritter.putSelfInGrid(getGrid(), twoAway);
				}
			}
		}

	}
}