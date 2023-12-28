import java.util.Scanner;

public class TASK3 {

	public static void main(String[] args) {
		int b,reverse=0,remainder;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number you want to reverse");
		b= a.nextInt();
		{for(;b>0;)
		{ remainder = b%10;
          reverse= reverse *10 + remainder;	
          b= b/10;
		
		}System.out.print(reverse);
	}

}
}