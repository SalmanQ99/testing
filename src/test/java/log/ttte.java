package log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ttte {
    @Test
    public void tttte(){
        Logger log = LogManager.getLogger(ttte.class);
        log.fatal("meassage");

        log.info("info");
        log.warn("war");
    }
}
