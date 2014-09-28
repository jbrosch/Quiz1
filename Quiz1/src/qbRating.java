import java.util.Scanner;

public class qbRating {

	public static double a(double att, double comp){
		return ((comp/att)-.3)*5;
	}
	public static double b(double att, double yards){
		return ((yards/att)-3)*.25;
	}
	public static double c(double att, double TD){
		return ((TD/att))*20;
	}
	public static double d(double att, double interceptions){
		return 2.375 - ((interceptions/att)*25);
	}
	public static double mm(double i){
		return Math.max(0, Math.min(i,2.375));
	}
	public static double rating(double att, double compl, double yards, double TD, double interceptions){
		return ((mm(a(att,compl))+mm(b(att,yards))+mm(c(att,TD))+mm(d(att,interceptions)))/6)*100;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Enter in the number of attemps: ");
		int att = Integer.parseInt(input.next());
		System.out.print("Enter in the number of completions: ");
		int compl = Integer.parseInt(input.next());
		System.out.print("Enter in the number of yards: ");
		int yards = Integer.parseInt(input.next());
		System.out.print("Enter in the number of touchdowns: ");
		int TD = Integer.parseInt(input.next());
		System.out.print("Enter in the number of interceptions: ");
		int interceptions = Integer.parseInt(input.next());
		System.out.printf("The quarterbacks rating is %1$.2f",rating(att,compl,yards, TD, interceptions));

		

	}

}
