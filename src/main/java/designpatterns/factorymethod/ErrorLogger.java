package designpatterns.factorymethod;

public class ErrorLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("ErrorLogger");
    }
}
