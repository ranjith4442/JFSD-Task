import java.util.Scanner;

public class TASK5 {

	public static void main(String[] args) {
		double a=0;
		System.out.print("Enter the purchase amount :");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		if (a < 500)
		    {System.out.print("The purchase amount after discount = "+a);}
		else if (a>=500 && a<=1000)
		    {a=a+a*0.10;
		    System.out.print("The purchase amount after discount = "+a);
		    }
		else if (a>1000)
			{a=a+a*0.20;;
			System.out.print("The purchase amount after discount = "+a);
		    }
		else
			System.out.print("Invalid purchase amount");
			

	}

}
