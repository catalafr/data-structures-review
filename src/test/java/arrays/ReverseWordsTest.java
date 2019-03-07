package arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void reverseWords(){

        ReverseWordsInString2 rv = new ReverseWordsInString2();
        char [] word = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        rv.reverseWords(word);

        char [] reversed = {'b','l','u','e',' ','i','s',' ','s','k','e',' ','t','h','e'};
        Assert.assertSame(word, reversed);
    }
}
