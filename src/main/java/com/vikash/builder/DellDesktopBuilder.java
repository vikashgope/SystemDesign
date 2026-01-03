package com.vikash.builder;

public class DellDesktopBuilder extends DesktopBuilder{

    @Override
    public void setName()
    {
       desktop.setName("Dell desktop");
    }

    @Override
    public void setMonitor() {
       desktop.setMonitor("dell 24 inch monitor");
    }
    @Override
    public void setProcessor() {
     desktop.setProcessor("Intell i7 processor");
    }
    @Override
    public void setRam() {
       desktop.setRam("8gb ram");
    }

}
