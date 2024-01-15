package task11;

import java.util.Scanner;

public class Que4 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of A: ");
        int A = sc.nextInt();
        
        System.out.print("Enter the value of B: ");
        int B = sc.nextInt();
		
        System.out.print(A / B);
   }
}
---------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter the value of A: 45
Enter the value of B: 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at guvitask11/task11.Que4.main(Que4.java:17)
