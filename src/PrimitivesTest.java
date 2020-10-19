import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static main.primitives.countBits;
import static main.primitives.shiftRight;
import static main.primitives.shiftLeft;
import static main.primitives.bitwiseAnd;
import static main.primitives.bitwiseOr;
import static main.primitives.bitwiseXOR;
import static main.primitives.bitwiseCompliment;
import static main.primitives.zeroFillRightShift;



public class PrimitivesTest {

    @Test
    public void testCountBits() {
        assertEquals(4, countBits(15));
    }

    @Test
    public void testShiftRight(){
        assertEquals(3, shiftRight(15));
    }

    @Test
    public void testShiftLeft(){
        assertEquals(60, shiftLeft(15));
    }

    @Test
    public void testBitwiseAnd(){
        assertEquals(2, bitwiseAnd(15, 2));
    }

    @Test
    public void testBitwiseOr(){
        assertEquals(31, bitwiseOr(15, 16));
    }

    @Test
    public void testBitwiseXor(){
        assertEquals(9, bitwiseXOR(8, 1));
    }

    @Test
    public void testbitwiseCompliment(){
        assertEquals(-61, bitwiseCompliment(60));
    }

    @Test
    public void testZeroFillRightShift(){
        assertEquals(4, zeroFillRightShift(16));
    }
}
