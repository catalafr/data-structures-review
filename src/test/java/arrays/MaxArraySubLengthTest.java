package arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaxArraySubLengthTest {

    @Test
    public void testMaxArraySubLenght(){
        int [] arr = {50,1,-1,5,-2,3};

        int k = 3;

        MaxArraySubLength masl = new MaxArraySubLength();
        int max = masl.maxSubArrayLen(arr, k);

        Assert.assertEquals(max, 4);
    }
}
