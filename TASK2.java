import java.util.Scanner;
public class TASK2 {
	

	public static void main(String[] args) {
		int b;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number");
		b= a.nextInt();
		if(b<0)
			System.out.println("The number is negative");
		else if(b>0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is neither positive nor negative");
			
	}

}
