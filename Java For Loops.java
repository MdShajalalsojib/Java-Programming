for (statement 1; statement 2; statement 3) {
  // code 
}
------------- Java for loops Ex-----------------------
import java.util.Scanner;

public class ForLoops {
    

    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.print("Enter the any number: ");
        int i=1;
         int  n = ac.nextInt();
            for(i=1;i<=n;i++)
            System.out.println(i);
    }
}

--------------------------Code Output--------------------------
Enter the any number: 5
1
2
3
4
5
