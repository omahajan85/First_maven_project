package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestClass {
    @Test(priority = 1)
    void add()
    {

            int a = 3;
            int b = 3;
            int c = a + b;
            System.out.println("Result is :" + c);
        Assert.assertEquals(a,b);
    }

    }


