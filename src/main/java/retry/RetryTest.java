package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer{
    private int recount=0;
    private static final int maxRetrycount = 3;
    public boolean retry(ITestResult iTestResult) {

        if (recount<maxRetrycount){
            recount++;
            return true;
        }

        return false;
    }
}

