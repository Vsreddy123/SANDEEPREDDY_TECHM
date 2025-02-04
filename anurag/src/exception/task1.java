package exception;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		try {
			int j=10;
			j=j%i;
			System.out.println(j);
		}
		catch(Exception e){
			System.out.println("exception occured");
		}
		finally {
			System.out.println("executed ");
		}

	}

}