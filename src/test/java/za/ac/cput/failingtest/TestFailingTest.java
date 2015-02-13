package za.ac.cput.failingtest;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestFailingTest extends TestCase {
    public void testFailure() throws Exception{
        FailingTest ft = new FailingTest();

        Assert.assertEquals(2, ft.myInt());

        fail();
    }
}
