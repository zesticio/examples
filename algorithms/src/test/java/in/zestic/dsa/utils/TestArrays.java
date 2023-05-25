package in.zestic.dsa.utils;


import org.junit.Assert;
import org.junit.Test;

public class TestArrays {

    @Test
    public void testShiftElementToEnd() {
        Integer[] array = {8, 0, 0, 3, 4, 0, 5, 6, 8, 0, 0, 3, 4, 0, 5, 6};
        Integer[] output = {8, 3, 4, 5, 6, 8, 3, 4, 5, 6, 0, 0, 0, 0, 0, 0};
        ArrayUtil.shiftElementToEnd(array, 0);
        Assert.assertArrayEquals(array, output);
    }
}
