package CirilGroup;

import java.util.ArrayList;
import java.util.List;

public class Forest {

	private int l;
	private int h;
	private List<Tree> forest = new ArrayList<>();

	public Forest(int l, int h) {
		this.h = h;
		this.l = l;
	}

	public List<Tree> getForest() {
		return forest;
	}

	public void setForest(List<Tree> forest) {
		this.forest = forest;
	}

	public int getL() {
		return l;
	}

	public int getH() {
		return h;
	}
	
	public void setL(int l) {
		this.l = l;
	}

	public void setH(int h) {
		this.h = h;
	}
	
}
