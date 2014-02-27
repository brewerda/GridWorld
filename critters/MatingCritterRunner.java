import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class MatingCritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        world.add(new Location(4, 4), new MatingCritter());
        world.add(new Location(5, 8), new MatingCritter());
        world.show();
    }
}