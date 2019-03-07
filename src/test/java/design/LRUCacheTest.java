package design;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void testCache(){
        LRUCache cache = new LRUCache(2);
        Assert.assertSame(cache.get(2), -1);
        cache.put(2,6);
        Assert.assertSame(cache.get(1), -1);
        cache.put(1,5);
        cache.put(1,2);
        Assert.assertSame(cache.get(1), 2);
        Assert.assertSame(cache.get(2), 6);
    }
}
