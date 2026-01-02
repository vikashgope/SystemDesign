package com.vikash.factorymethod;

public class LoggerFactory {
    
    public static ILogger createLogger(String type) {
        switch (type.toLowerCase()) {
            case "debug":
                return new DebugLogger();
            case "info":
                return new InfoLogger();
            case "error":
                return new ErrorLogger();
            default:
                throw new IllegalArgumentException("Unknown logger type: " + type);
        }
    }
    ILogger a=new DebugLogger();

}

// return new DebugLogger how is it returning ILogger Interface ?


