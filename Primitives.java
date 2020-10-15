/**
 * Class Primitives
 * Refresher for primitive data types
 */
class primitives{
    public static void main(String [] args){
        System.out.println(countBits(15));
        System.out.println(shiftRight(15));
        System.out.println(shiftLeft(15));
        System.out.println(bitwiseAnd(15, 2));
        System.out.println(bitwiseOr(15,16));
        System.out.println(bitwiseXOR(8, 1));
        System.out.println(bitwiseCompliment(60));
        System.out.println(zeroFillRightShift(16));
    }
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
    return numBits;
}
/**
 * Shift bits right 2
 * @param x takes input x of type int.
 * @return an int x of the new value
 */
public static int shiftRight(int x) {
    x >>= 2;
    return x;
}

/**
 * Shift bits left 2
 * @param x takes input x of type int.
 * @return an int x of the new value
 */
public static int shiftLeft(int x){
    x <<= 2;
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
    return zeroFill; 
}

}
