import org.testng.annotations.Test;

public class retryingtests {
    @Test(retryAnalyzer = retry.RetryTest.class)
    public void Test2(){
        System.out.println("Test 1");
        int num = 1/0;
    }
}
