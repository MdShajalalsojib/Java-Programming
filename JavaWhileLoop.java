-------------------The syntax of the while loop is:-----------------------

while (testExpression) {
    // body of loop
}
-----------------------------------------------------------------------
import java.util.Scanner;
public class JavaWhileLoop {
  public static void main(String[] args) {
      
    int sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = input.nextInt();
	   
    while (number >= 0) {
      sum += number;
      System.out.println("Enter a number");
      number = input.nextInt();
    }   
    System.out.println("Sum = " + sum);
    input.close();
  }
}
---------------------------------Output------------------------------------


Enter a number
23
Enter a number
1
Enter a number
9
Enter a number
7
Enter a number
-7
Sum = 40
