package arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaxArraySubLengthTest {

    @Test
    public void testMaxArraySubLenght(){
        int [] arr = {1,1,-1,5,-2,3};

        int k = 3;

        MaxArraySubLength masl = new MaxArraySubLength();
        int max = masl.maxArraySubLen(arr, k);

        Assert.assertEquals(max, 4);
    }
}
