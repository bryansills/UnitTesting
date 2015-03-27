package ninja.bryansills.unittesting;

import android.test.InstrumentationTestCase;

public class MainActivityTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 5;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
