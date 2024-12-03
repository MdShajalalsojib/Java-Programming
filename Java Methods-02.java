-------------------------------------------------Java Methods------------------------------------------------------

*******there are two types of methods:

1.User-defined Methods: We can create our own method based on our requirements.
2.Standard Library Methods: These are built-in methods in Java that are available to use.
-----------------------------------User-defined Methods-----------------------------------------------------------
syntax........
 returnType methodName() {
  // method body
}

.......returnType - It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value.
If the method does not return a value, its return type is void.
.........methodName - It is an identifier that is used to refer to the particular method in a program.
.........method body - It includes the programming statements that are used to perform some tasks. The method body is enclosed inside the curly braces { }.

For the Examples:
int addNumbers() {
// code
}
In the above example, the name of the method is adddNumbers(). And, the return type is int. We will learn more about return types later in this tutorial.

.....................................Calling a Method in Java........................................
In the above example, we have declared a method named addNumbers(). Now, to use the method, we need to call it.


// calls the method
addNumbers();



The user- defined Methods three types 
.............sampl java methods
.............Java Return Type Methods
.............Java Parameters Methods


...................................sampl java methods...................................
public class simpleMethods {

    public  int addNumber(int a, int b){
        int sum = a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        simpleMethods s1 = new simpleMethods();
        int res=s1.addNumber(43, 65);
        System.out.println("the sum res "+res);
        
    }
    
}

    

    
............................................Java ReturnType Methods...................................................

public class simpleMethods {
      public static int square(int num) {
        // return statement
        return num * num;
      }
      public static void main(String[] args) {
        int result;
        result = square(10);
        System.out.println("Squared value of 10 is: " + result);
      }
    }

.............................................Java Parameters Methods.......................................

int addNumbers(int a, int b) {
  // code
}
int addNumbers(){
  // code
}


public class simpleMethods  {
    public void display1() {
      System.out.println("Method without parameter");
    }
    public void display2(int a) {
      System.out.println("Method with a single parameter: " + a);
    }
  
    public static void main(String[] args) {
      Main obj = new Main();
      obj.display1();
      obj.display2(24);
    }
  }




