class Operators {
  public static void main(String[] args) {

    int a = 10 + 20;
    //the value of a is now 30
    System.out.println("10 + 20 = " + a);

    int b;
    b = a - 5;
    // the value of b is now 25
    System.out.println(a + " - 5 = " + b);

    int c;
    c = b * 5;
    //the value of b is now 125
    System.out.println(b + " * 5 = " + c);

    c= b / 5;
        // the value of b is now 25
    System.out.println(b + " / 5 = " + c);

    c = b%2;
    // the value of b  is now 1
    System.out.println(b + " % 2 = " + c);


    int a1 = 10;
    int a2 = 20;

    a2 += a1;   // a2 = a2+a1
    System.out.println("The result for += is: "+a2);

    a2 -= a1;     //a2=a2-a1
    System.out.println("The result for -= is: "+a2);

    a2 *= a1;     //a2=a2*a1
    System.out.println("The result for *= is: "+a2);

    a2 /= a1;   //a2=a2/a1
    System.out.println("The result for /= is: "+a2);

    a2 %= a1;     //a2=a2%a1
    System.out.println("The result for %= is: "+a2);

    int b1 = 10;  /* 10 = 00001010 */
    int b2 = 20;  /* 20 = 00010100 */
    int result = 0;

    result = b1 & b2;
    System.out.println("The result of bitwise AND of "+ b1 + " and "+b2+": "+result);

    result = b1 | b2;
    System.out.println("The result of bitwise OR of "+ b1 + " and "+b2+": "+result);

    result = b1 ^ b2;
    System.out.println("The result of bitwise XOR of "+ b1 + " and "+b2+": "+result);

    result = ~b2;
    System.out.println("The result of bitwise Negation of "+ b2 + ": "+result);

    result = b1 << 2;
    // left shift 10 by 2 positions
    System.out.println("The result of left shift operator of "+b1+" and 2: "+result);

    result = b2 >> 2;
    //right shift 20 by 2 positions
    System.out.println("The result of right shift operator of "+b2+" and 2: "+result);

    int i = 5;
    System.out.println("Postfix increment of "+i+": "+ i++);// outputs 5

    int j = 2;
    System.out.println("Prefix increment of "+j+": "+ ++j);// outputs 3

    int c1;
    c1 = 75;

    result = (c1 == 25) ? 500: 250;
    //returns the value after ‘:’ because a1 is not equal to 75
    System.out.println( "The result of ("+c1+" == 25) ? 500: 250 is: "+result);

    result = (c1 == 75) ? 500: 250;
    //returns the value before ‘:’ because a1 equals 75
    System.out.println( "The result ("+c1+" == 75) ? 500: 250 is: "+result);

    int x = 5;
    int y = 6;
    int resultValue = (x > y) ? y : x; // Calculates the minimum of 2 numbers, resultValue will be 5.

  }
}
