package arrays;

import org.junit.Assert;
import org.junit.Test;

public class CompareVersionTest {

    @Test
    public void testCompareVersions(){
        String v1 = "0.1";
        String v2 = "0.0.1";

        CompareVersionNumbers cvn = new CompareVersionNumbers();
        int result = cvn.compareVersion(v1,v2);

        Assert.assertEquals(result, 1);
    }
}
