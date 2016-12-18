import java.util.Scanner;

public class Sess1_Assigmnt1 {
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the 2 numbers :");
		a = inputReader.nextInt();
		b = inputReader.nextInt();
		c = add1(a, b);
		System.out.println("Sum of a & b by method 1 is : " + c);
		c = add2(a, b);
		System.out.println("Sum of a & b by method 2 is : " + c);
	}

	private static int add1(int a, int b) {
		// TODO Auto-generated method stub
		int sum;
		sum = a - ~b - 1;//~b=-b+1
		return sum;
	}

	private static int add2(int a, int b) {
		// TODO Auto-generated method stub
		int carry;
		while (b != 0) {//Half adder logic
			carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
}
/*
******************************************************************************
Enter the 2 numbers :
5
9
Sum of a & b by method 1 is : 14
Sum of a & b by method 2 is : 14
******************************************************************************
*/