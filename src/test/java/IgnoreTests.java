

import org.testng.annotations.Test;


public class IgnoreTests {


    @Test(enabled = false )
    public void IgnoreTest1(){

        System.out.println("ignore test practices 1");
    }

    @Test
    public void IgnoreTest2(){

        System.out.println("ignore test practices 2");
    }
}
