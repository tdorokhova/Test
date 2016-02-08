package Tests;

import Methods.CommonMethods;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    protected CommonMethods met;

    @BeforeTest(alwaysRun = true)
    public void setUp() throws Exception {
        met = new CommonMethods();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() throws Exception {
        met.stop();
    }

}
