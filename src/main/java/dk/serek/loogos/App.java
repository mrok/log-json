package dk.serek.loogos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;


public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            final LocalDateTime now = LocalDateTime.now();
            final String msg = "New message logged at " + now;
            System.out.println("Logging " + msg);
            logger.debug(msg);
            Thread.sleep(1000);
        }

    }

}
