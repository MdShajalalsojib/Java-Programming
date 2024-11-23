--------------------------The syntax of the Java for-each loop is:--------------------------
             for(dataType item : array) {
    ...
}

---------------------------------------------------------------------------------------------------------------------------------
public class For-EachLoops {
    public static void main(String[] args) {
      // an array of numbers
      int[] numbers = {11, 78, 51, -5, 9, 12, 23};
      int sum = 0;
   
      // iterating through each element of the array 
      for (int number: numbers) {
        sum += number;
      }
     
      System.out.println("Sum = " + sum);
    }
   }
