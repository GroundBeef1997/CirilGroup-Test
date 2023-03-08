package CirilGroup;

public class Tree {

	private State state;
	private Position position;

	public Tree(State state, Position position) {
		this.state = state;
		this.position= position;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
}
