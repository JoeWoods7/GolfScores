import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scores s1 = new Scores();
		s1.generateRandomScoreSheet("ScoreSheet");
		s1.readScoreSheet("Scoresheet");
		Integer i = 1;
		System.out.println(i);
		System.out.println("I " + "Love" + "You");
		new Main();
	}

	public Main() {
		int well = 44;
		System.out.println(well + " that is all");
	}
}