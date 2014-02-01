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
    
