import org.testng.Assert;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class failedTests {

//    @Test(retryAnalyzer = RetryTests.class)
//
//    public void Test1(){
//        System.out.println("Test 1");
//    }
    @Test(retryAnalyzer = retry.RetryTest.class)
    public void Test2(){
        System.out.println("Test 1");
        int num = 1/0;
    }
//    @Test
//    public void Test3(){
//        System.out.println("Test 1");
//        Assert.assertEquals(false,true);
//    }
}
