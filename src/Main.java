import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		Scores s1 = new Scores();
		s1.generateScoreSheet();
		s1.readScoreSheet();
		
	}

}
