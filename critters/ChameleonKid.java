import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;


public class ChameleonKid extends ChameleonCritter{
	// public ArrayList<Actor> getActors() {
	// ArrayList<Actor> a = new ArrayList<Actor>();
	// int[] directions = {Location.AHEAD, (Location.AHEAD + 180)};

	// for (Location loc : getLocationsInDirections(directions)) {
	// 	Actor kid = getGrid().get(loc);
	// 	actors.add(kid);
	// }
	// return a;
	// }
	   
 // 	public ArrayList<Location> getLocationsInDirections(int[] directions) { 
 // 	ArrayList<Location> locs = new ArrayList<Location>(); 
 // 	Grid gr = getGrid(); 
 // 	Location loc = getLocation(); 
 
	//  	for (int d : directions) { 
 // 		Location neighborLoc = loc.getAdjacentLocation(getDirection() + d); 
	//  		if (gr.isValid(neighborLoc)) {
 // 			locs.add(neighborLoc); 
	// 		 }
 // 		} 
 // 	return locs; 
 // 	}
 // 	
 // 	 
 	public ArrayList<Actor> getActors() {
 		ArrayList<Actor> actors = new ArrayList<Actor>();
 		Location[] locs = new Location[2];
 		locs[0] = getLocation().getAdjacentLocation(getDirection());
 		locs[1] = getLocation().getAdjacentLocation(getDirection() + 180);

 		for (Location loc : locs) {
 			if(getGrid().isValid(loc)) {
 				Actor a = getGrid().get(loc);
 				if(a != null) {
 					actors.add(a);
 				}
 			}
 		}
 		return actors;
 	} 
} 
