public class QuickCrab extends CrabCritter {
  public void getMoveLocations() {
    ArrayList<Location> locs = new ArrayList<Location>();
    Grid grid = getGrid();
   int direction = getDirection();
   int Left = direction - 90;
   int Right = direction + 90;
   //Location temp = loc.getAdjacentLocation(Left);
   checkTwoAway(locs, Left);
   checkTwoAway(locs, Right);
     // if(g.isValid(temp) && g.get(temp) == null) {
     //Location temp2 = temp.getAjacentLocation(direction);
    // if(g.isValid(temp2) && g.get(temp2) == null) {
      // locs.add(temp2);
    // }
  // }
   return locs;
  }
}
   

   public void checkTwoAway(ArrayList<Location> locs, int direction) {
     
     
     Grid grid = getGrid();
     Location original = getLocation();
     Location temp = original.getAdjacentLocation(direction);
        if(g.isValid(temp) && g.get(temp) == null) {
     Location temp2 = temp.getAjacentLocation(direction);
     if(g.isValid(temp2) && g.get(temp2) == null) {
       locs.add(temp2);
     }
   }
   }
   
   
