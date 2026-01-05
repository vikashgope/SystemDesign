package designpatterns.factorymethod;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactorymethodApplication {

    public static void main(String[] args) {
        
        ILogger debugLogger = LoggerFactory.createLogger("debug");
        debugLogger.log();
        
        ILogger infoLogger = LoggerFactory.createLogger("info");
        infoLogger.log();
    }
}