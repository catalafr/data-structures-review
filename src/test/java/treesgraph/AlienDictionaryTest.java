package treesgraph;

import org.junit.Assert;
import org.junit.Test;

public class AlienDictionaryTest {

    @Test
    public void TestAlienDictionary(){
        String [] grammar =  {  "wrt", "wrf", "er", "ett", "rftt"};
        AlienDictionnary ad = new AlienDictionnary();
        String order = ad.alienOrder(grammar);
        Assert.assertEquals("wertf",order);
    }
}
