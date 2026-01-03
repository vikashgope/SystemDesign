package com.vikash.builder;

public abstract class DesktopBuilder {

    protected Desktop desktop;
    public void createNewDesktop() {
        desktop = new Desktop();
    }
    public abstract void setName();
    public abstract void setRam();
    public abstract void setProcessor();
    public abstract void setMonitor();

    public Desktop build() {

        return  desktop;
    }
}
