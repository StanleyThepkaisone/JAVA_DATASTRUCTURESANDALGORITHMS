package main;

/**
 * Class Primitives
 * Refresher for primitive data types
 */
//import java.lang.*;

public class primitives{
/**
 * 
 * @param x takes input x and counts the number of bits.
 * @return the count
 */
public static short countBits(int x){
    short numBits = 0;
    while(x != 0){
        numBits += (x & 1);
        x >>>=1;
    }
    System.out.println("Bits Counted : " + numBits);
    return numBits;
}
/**
 * Shift bits right 2
 * @param x takes input x of type int.
 * @return an int x of the new value
 */
public static int shiftRight(int x) {
    x >>= 2;
    System.out.println("Binary " + x + " : " + Integer.toBinaryString(x));
    return x;
}

/**
 * Shift bits left 2
 * @param x takes input x of type int.
 * @return an int x of the new value
 */
public static int shiftLeft(int x){
    x <<= 2;
    System.out.println("Binary " + x + " : " + Integer.toBinaryString(x));
    return x;
}
 /**
  * takes 2 ints x, y. If bits exists in both they will be combined.
  * ex. 1100 & 0100 = 0100
  * @param x
  * @param y
  * @return int "and" of the new value
  */
public static int bitwiseAnd(int x, int y){
    int and = x & y;
    System.out.println("Binary " + and + " : " + Integer.toBinaryString(and));
    return and;
}
/**
 * takes 2 ints x, y. If bits exists in one or the other they will be combined.
 * ex. 1100 | 0101 = 1101
 * @param x
 * @param y
 * @return int "or" of the new value
 */
public static int bitwiseOr(int x, int y){
    int or = x | y;
    System.out.println("Binary " + or + " : " + Integer.toBinaryString(or));
    return or;
}
/**
 * takes 2 ints x, y. If bits exists in one and not the other they will be combined.
 * ex. 1100 ^ 0011 = 1111
 * @param x
 * @param y
 * @return int "xor" of the new value
 */
public static int bitwiseXOR(int x, int y){
    int xor = x ^ y;
    System.out.println("Binary " + xor + " : " + Integer.toBinaryString(xor));
    return xor;
}
/**
 * provides the compliment to the int also flips the sign
 * ex. ~1100 = 0011
 * @param x
 * @return int compliment
 */
public static int bitwiseCompliment(int x){
    int compliment = ~x;
    System.out.println("Binary " + compliment + " : " + Integer.toBinaryString(compliment));
    return compliment;
}
/**
 * shifts bits over to the right by 2
 * Fills shifted spots with 0's
 * @param x
 * @return zeroFill
 */
public static int zeroFillRightShift(int x){
    int zeroFill = x>>>2;
    System.out.println("Binary " + zeroFill + " : " + Integer.toBinaryString(zeroFill));
    return zeroFill; 
}


}
