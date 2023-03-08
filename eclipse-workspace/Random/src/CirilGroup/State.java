package CirilGroup;

public class State {

	private static final String GREEN = "alive";
	private static final String RED = "burning";
	private static final String GREY = "burnt";
	private String currentState;

	public State(String currentState) {
		this.currentState = currentState;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public static String getGreen() {
		return GREEN;
	}

	public static String getRed() {
		return RED;
	}

	public static String getGrey() {
		return GREY;
	}

}
