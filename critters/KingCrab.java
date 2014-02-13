import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.*;

import java.awt.Color;
import java.util.ArrayList;


public class KingCrab extends CrabCritter {




  public void processActors(ArrayList<Actor> actors) {
    for (Actor a : actors) {
      if(a instanceof Rock || a instanceof Flower) {
        a.removeSelfFromGrid();
      } else {
          Grid g = getGrid();
          Location loc = a.getLocation().getAdjacentLocation(a.getLocation().getDirectionToward(getLocation()) - 180);
            if(loc == null && g.isValid(loc)) {
              if(!g.getOccupiedLocations().contains(loc)) {
                a.moveTo(loc);
              } else {
                a.removeSelfFromGrid();
              }
           } else {
             a.removeSelfFromGrid();
        }
      }
    }
  }
}
    
