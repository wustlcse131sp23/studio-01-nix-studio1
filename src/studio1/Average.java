package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
System.out.println("Enter two integers");
		int n1=in.nextInt();
		int n2=in.nextInt();
		double avg = (n1+n2)/2.0;
		System.out.println(avg);
	}

}
