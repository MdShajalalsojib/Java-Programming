if (condition1) {
  // codes
}
else if(condition2) {
  // codes
}
else if (condition3) {
  // codes
}
.
.
else {
  // codes
}

--------------if.....else if Example---------------
public class JavaIfSta {
    public static void main(String[] args) {
        int number = 20;
        if (number<0){
            System.out.println("The number is negative");

        }
        else if (number>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("Thes number");
        }
        System.out.println("The not number");
    }

}   

---------------------codes output---------------------

 The number is positive
 The not number
