package com.designpatterns.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

    public static void main(String[] args) {

        XmlService xmlService=new XmlService();
        System.out.println(xmlService.getXmlData());
        JsonData adapter=new XmlToJsonAdapter(xmlService);
        System.out.println(adapter.getJsonData());


    }

}
