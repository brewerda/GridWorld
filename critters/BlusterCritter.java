import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;





public class BlusterCritter extends Critter {
	private double DARKENING_FACTOR;
	private int c;
	private int courage;
	public BlusterCritter(int c) {
		super();
		this.c = c;
		courage = 3;



		if( c <= courage) {
			lighten();
		} else if( c > courage) {
			darken();
		}
	}

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();

		Location loc = getLocation();
		for (int column = loc.getCol() - 2; column <= (loc.getCol() + 2) ; column++) {
			for (int row = loc.getRow() - 2; row<= (loc.getRow() + 2) ; row++ ) {
				Location test = new Location(row,column);
				if(getGrid().isValid(test)) {
					if(getGrid().get(test) instanceof Critter) {
						c++;
					}
				}			
			}
		}
		return getGrid().getNeighbors(getLocation());	
	}

	public void processActors() {
		if( c <= courage) {
			lighten();
		} else if( c > courage) {
			darken();
		}
	}






	public void darken() {
		DARKENING_FACTOR = 0.10;
		Color c = getColor();
		int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
		int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
		int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

		setColor(new Color(red, green, blue));
	}
	public void lighten() {
		DARKENING_FACTOR = 0.10;
		Color c = getColor();
		int red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
		int green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
		int blue = (int) (c.getBlue() * 1.1);

		setColor(new Color(red, green, blue));
	}
}