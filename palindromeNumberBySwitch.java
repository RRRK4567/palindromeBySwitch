import java.util.*;
public class palindromeNumberBySwitch {

	private static int r;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option :");
		int option = sc.nextInt();
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		switch(option)
		{
		case 1:
			
			
		int a=n;
		int reverse,remainder;
		
		remainder = a%10;
		reverse = reverse*10 + 1;
		a=a/10;
		}
		
		if(reverse==n)
	
			System.out.println("number is palindrome");
			
			else
				System.out.println("not a palindrome");
			
		
		
		}

	}

