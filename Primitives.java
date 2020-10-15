/**
 * Class Primitives
 */
class primitives{
    public static void main(String [] args){
        System.out.println(countBits(15));
        System.out.println(shiftRight(15));
        System.out.println(shiftLeft(15));
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
public static int bitwiseAnd(int x){
    
}
public static int bitwiseOr(int x){
    
}
public static int bitwiseXOR(int x){
    
}
public static int bitwiseCompliment(int x){
    
}
public static int zeroFillRightShift(int x){
    
}
*/
}