package jenkins_grovle_test.com.jenkins_android_grovle_testing;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by PKB734 on 27-Jul-2015.
 */
public class MainActivityTest extends TestCase {
    @Test
    public void testFake1() throws Exception {
        Assert.assertTrue(true);
    }
    @Test
    public void testFake2() throws Exception {
        Assert.assertFalse(true);
    }
    @Test
    public void testFake3() throws Exception {
        Assert.assertFalse("Should be false", true);
    }
}
