import java.util.Random;


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class JumpingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //SpiralBug alice = new SpiralBug(6);
        //alice.setColor(Color.ORANGE);

        JumpingBug bob = new JumpingBug();
        //world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}