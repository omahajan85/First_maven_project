package TestPackage;

import org.testng.annotations.Test;

public class Testclass {

    /*
    1.Setup
    2.Test case
    3.Tear down
     */
    @Test(priority=1)
    void setup()
    {
        System.out.println("Setup step");
    }

    @Test(priority=2)
    void login()
    {
        System.out.println("Login test case");
    }

    @Test(priority=3)
    void teardown()
    {
        System.out.println("Tear down step");
    }

}
