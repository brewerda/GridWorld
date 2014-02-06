import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;


public class KingCrab extends CrabCritter {


  public boolean moveAway(Actor a) {
  
    ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(a.getLocation());
    
    
    for (int i=0; i<=locs.size(); i++) {
      if(distanceFrom(getLocation(), loc) > 1) {
        a.moveTo(loc);
        return true;
      }
    }
    return false;
  }
  
  
  public void processActors(ArrayList<Actor> actors) {
    
    for(int a=0; a<=actors.size(); a++) {
      if(moveAway(a) == false) {
        a.removeSelfFromGrid();
      }
    }
  }

  public int distanceFrom(int loc1, int loc2) {
    int x1 = loc1.getCol();
    int x2 = loc2.getCol();
    int y1 = loc1.getRow();
    int y2 = loc2.getRow();


    double result = Math.sqrt( ((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));  
    int finish = (int) result;
    return finish;
  }
}
    
