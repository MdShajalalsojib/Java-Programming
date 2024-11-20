Java Math has many math methods ------------- 
such as---------
--Java Math.abs()
--Java Math.acos()
--Java Math.addExact()
--Java Math.asin()
--Java Math.cos()
--Java Math.tan()
--Java Math.sinh()
--Java Math.exp()
--Java Math.loglp()
--Java Math.log()--------and ETC
----------------------------------------The Example-----------------------------------------------------------

----Example the math.abs()---------
class Main {
  public static void main(String[] args) {
    int a = -35;
    long b = -141224423L;
    double c = -9.6777777d;
    float d = -7.7f;

    System.out.println(Math.abs(a));   
    System.out.println(Math.abs(b));   
    System.out.println(Math.abs(c));   
    System.out.println(Math.abs(d));  
  }
}
----------Example the math.acos()----------

import java.lang.Math;

class Main {
  public static void main(String[] args) {

    // create variable
    double a = 0.5;
    double b = 0.79;
    double c = 0.0;

    // print the arc cosine value
    System.out.println(Math.acos(a));  // 1.0471975511965979
    System.out.println(Math.acos(b));  // 0.6599873293874984
    System.out.println(Math.acos(c));  // 1.5707963267948966
  }
}
------------Example the math.log()-------------

class Main {
  public static void main(String[] args) {

    // compute log() for double value
    System.out.println(Math.log(9.0));       // 2.1972245773362196

    // compute log() for zero
    System.out.println(Math.log(0.0));       // -Infinity


    // compute log() for NaN
    double nanValue = Math.sqrt(-5.0);
    System.out.println(Math.log(nanValue));  // NaN


    // compute log() for infinity
    double infinity = Double.POSITIVE_INFINITY;
    System.out.println(Math.log(infinity));  // Infinity


    // compute log() for negative numbers
    System.out.println(Math.log(-9.0));      // NaN


  }
}

----------And the ETC---------------
