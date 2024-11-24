Java Continue:
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  
  }
}
Break and Continue in While Loop
You can also use break and continue in while loops:

public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }  
  }
}
