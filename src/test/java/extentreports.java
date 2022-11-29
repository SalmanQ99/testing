
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;
public class extentreports {


    @Test
    public void test() {

        ExtentReports rep= new ExtentReports();
        //report all
        ExtentSparkReporter report = new ExtentSparkReporter("sparkall.html");
        //report only fail
        ExtentSparkReporter report2 = new ExtentSparkReporter("spark_fail.html").filter().statusFilter().as(new Status[]{Status.FAIL}).apply();

        rep.attachReporter(report,report2);

        ExtentTest test1 = rep.createTest("mytest","description");
        test1.log(Status.PASS,"pass");
        test1.pass("pass");
        ExtentTest test2 = rep.createTest("mytest","description");
        test2.log(Status.INFO,"info");

        ExtentTest test3 = rep.createTest("mytest","description");
        test3.log(Status.FAIL,"fail");
        test3.fail("pass");
        ExtentTest test4 = rep.createTest("mytest","description");
        test4.log(Status.SKIP,"skip");
        test4.skip("pass");
        Throwable t = new RuntimeException("A runtime exception");
        ExtentTest test23 = rep.createTest("MyFirstTest");
        test23.fail(t);
        test23.log(Status.FAIL, t);


        rep.flush();


    }

}
