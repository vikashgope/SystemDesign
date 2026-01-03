package com.vikash.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {

        DellDesktopBuilder dellBuilder = new DellDesktopBuilder();
        DesktopDirector director = new DesktopDirector(dellBuilder);

        Desktop dell = director.buildDesktop();

        System.out.println("Desktop Name: " + dell.getName());
        System.out.println("Processor: " + dell.getProcessor());
        System.out.println("RAM: " + dell.getRam());
        System.out.println("Monitor: " + dell.getMonitor());
    }

}
