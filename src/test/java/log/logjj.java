package log;

import org.apache.log4j.Logger;

public class  logjj{

    public  static void main(String arg[]){


        Logger log= Logger.getLogger(logjj.class);
        log.info("my message");
        log.warn("my message");


    }
}

