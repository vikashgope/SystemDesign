package com.vikash.factorymethod;

import ch.qos.logback.core.net.SyslogOutputStream;

public class InfoLogger implements ILogger{

    @Override
    public void log()
    {
        System.out.println("InfoLogger");
    }
}
