package Calculator;
import java.util.Scanner;
public class Calculator {
	public static int add(int x,int y) {
		int s = x+y;
		return s;
	}
	public static int sub(int x,int y) {
		int su = x-y;
		return su;
	}
	public static int mult(int x,int y) {
		int m = x*y;
		return m;
	}
	public static int div(int x, int y) {
		int d = x/y;
		return d;
	}

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		 	a = sc.nextInt();
	        b = sc.nextInt();
        System.out.println("Simple Calculator");

        System.out.println("\nHere are your results:");
        System.out.println("\n1. Addition of two numbers is:  "+add(a,b));
        System.out.println("2. Subtraction of two numbers:  "+sub(a,b));
        System.out.println("3. Division of two numbers:  "+div(a,b));
        System.out.println("4. Multiplication of two numbers:  "+mult(a,b));     
	}

}
