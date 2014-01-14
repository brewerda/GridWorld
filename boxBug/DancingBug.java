import info.gridworld.actor.Bug;
	
public class DancingBug extends Bug {
	private int[] array;
	private int steps;
	private int turns;
	private int turnIndex;

	public DancingBug(int[] array) {
		steps = 0;
		this.array = array;
		turns = 0;
		turnIndex = -1;

	}
	public void act() {
		if(turnIndex < array.length - 1) {
			turnIndex++;
		} else {
			turnIndex = 0;
		}

		for (int i=0; i < array[turnIndex]; i++) {
			turn();
		}
		super.act();
	}
}