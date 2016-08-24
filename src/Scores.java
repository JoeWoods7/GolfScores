import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Scores {
	//private int count;
	//private int p1 ,p2 ,p3 ,p4 ,par,parsum, hole, p1sum , p2sum ,p3sum ,p4sum;
	public Scores() {
		// TODO Auto-generated constructor stub
	}

	public void generateScoreSheet(){
		Random rand = new Random();
		FileWriter print;
		try {
			print = new FileWriter(new File("ScoreSheet"));
			PrintWriter pw = new PrintWriter(print);
			//String sc = rand.nextInt(4)+3+" "+ (rand.nextInt(9)+1) +" "+ (rand.nextInt(9)+1) +" "+ (rand.nextInt(9)+1) +" "+ (rand.nextInt(9)+1);

			for(int i = 0; i < 18 ; i ++){
				pw.println(rand.nextInt(4)+3+" "+ (rand.nextInt(9)+1) +" "+ (rand.nextInt(9)+1) +" "+ (rand.nextInt(9)+1) +" "+ (rand.nextInt(9)+1));
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("file not found");
		}
		
	}
	/**
	 * Would be better with printf for clarity
	 * @throws FileNotFoundException
	 */
	public void readScoreSheet() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("ScoreSheet"));
		int count = 1;
		int p1 = 0,p2 = 0,p3 = 0,p4 = 0,par,parsum=0, hole, p1sum = 0, p2sum = 0,p3sum = 0,p4sum = 0;
		System.out.println("hole#\tP1 \tP2 \tP3 \tP4 ");
		while(scan.hasNext()){
			hole =count;
			par =scan.nextInt();
			p1 =scan.nextInt();
			p2 =scan.nextInt();
			p3 =scan.nextInt();
			p4 =scan.nextInt();
			p1sum+=p1;
			p2sum+=p2;
			p3sum+=p3;
			p4sum+=p4;
			parsum+=par;
			System.out.println("#"+count+"\tpar: "+par+"\t"+p1+" \t"+p2+" \t"+p3+" \t"+p4+" \t");
			count++;
		}
		System.out.println(" " +"\tpar: "+parsum+"\t"+p1sum+" \t"+p2sum+" \t"+p3sum+" \t"+p4sum+" \t");
		System.out.println();
		int winner = Math.min(Math.min(p1sum, p2sum),Math.min(p3sum, p4sum));
		if (winner == p1sum) System.out.println("P1 wins with "+p1sum+"!");
		else if (winner == p2sum) System.out.println("P2 wins with "+p2sum+"!");
		else if (winner == p3sum) System.out.println("P3 wins with "+p3sum+"!");
		else if (winner == p4sum) System.out.println("P4 wins with "+p4sum+"!");
		//System.out.println("that is ");
		scan.close();
	}
}
