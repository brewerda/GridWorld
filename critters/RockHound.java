import java.util.ArrayList;
import info.gridworld.actor.Actor;

public class RockHound extends Critter {
  public void processActors(ArrayList<Actor> actors) {
    for(Actor a: actors) {
      if(a instanceOf Rock) {
        a.removeSelfFromGrid();
      }
    }
  }
