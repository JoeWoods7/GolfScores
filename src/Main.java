import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scores s1 = new Scores();
		s1.generateRandomScoreSheet("ScoreSheet");
		s1.readScoreSheet("Scoresheet");
		
	}

}
