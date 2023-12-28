import java.util.Scanner;
public class TASK4 {

	public static void main(String[] args) {
		int a = 0,b=0,c=0;
		String name = "";
		
		System.out.print("Enter the numbers");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		name = s.nextLine();
		b=s.nextInt();
		c=s.nextInt();
		if (a<c && a<b)
			System.out.print("A is the smaller number");
		else if (b<c && b<a)
			System.out.print("B is the smaller number");
		else 
			System.out.print("C is the smaller number");
		
	}

}
