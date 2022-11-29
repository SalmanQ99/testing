import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class test {

    //public  static void main(String arg[]){

@Test
        public void testing(){
        Logger log= Logger.getLogger(test.class);
        log.info("my message");
        log.warn("my message");


    }
}
