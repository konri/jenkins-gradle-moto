package app.test.com.jenkins_app;
/**
 * Created by PKB734 on 27-Jul-2015.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class FakeTest extends TestCase {

    @Test
    public void testThatSucceeds(){
        // all OK
        assert true;
    }

    @Test
    public void testThatFails(){
        // all NOK
        assert false;
    }
}
