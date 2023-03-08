package CirilGroup;

import java.util.ArrayList;
import java.util.List;
/**
 * classe principale - work in progress
 * **/
public class Launcher {

	List<Tree> foret = new ArrayList<>();

	//crée la foret
	public void creationForet(Forest forest, int h, int l) {
		forest.setH(h);
		forest.setL(l);
		for (int i = 0; i < forest.getH(); i++) {
			for (int j = 0; j < forest.getL(); j++) {
				foret.add(new Tree(new State(State.getGreen()), new Position(i, j)));
			}
		}
		forest.setForest(foret);
	}
	
	// affichage de la foret d'arbre
	public void navigationForet(Forest forest) {
		List<Tree> trees = forest.getForest();
		
		for (int i = 0; i < trees.size(); i++) {
			System.out.println("x: "+ trees.get(i).getPosition().getX() + " y: " + trees.get(i).getPosition().getY());
		}	
	}

	//propagation du feu sur un arbre aléatoire
	public Forest propagationFeux(Forest forest) {
		List<Tree> trees = forest.getForest();
		int indicePropagation = (int)(Math.random()*(forest.getForest().size() - 1)+1);
		trees.get(indicePropagation).setState(new State(State.getRed()));
		
		return forest;
	}
	
	public static void main(String[] args) {
		Launcher test = new Launcher();
		Forest forest = new Forest(3, 3);
		test.creationForet(forest, forest.getH(), forest.getL());
		test.navigationForet(forest);
	}

}
