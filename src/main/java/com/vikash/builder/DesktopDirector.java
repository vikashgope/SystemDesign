package com.vikash.builder;

public class DesktopDirector {

    private DesktopBuilder builder;  // abstract builder reference

    // Constructor receives builder
    public DesktopDirector(DesktopBuilder builder) {
        this.builder = builder;
    }

    // Orchestrates the building process
    public Desktop buildDesktop() {
        builder.createNewDesktop();  // Step 0: start fresh

        builder.setName();           // Step 1
        builder.setProcessor();      // Step 2
        builder.setRam();            // Step 3
        builder.setMonitor();        // Step 4

        return builder.build();      // Step 5: get finished Desktop
    }
}
