package com.designpatterns.adapter;

//exitsing service
public class XmlService {

    public String getXmlData(){
        return "<user>\n" +
                "    <id>101</id>\n" +
                "    <name>Abhijeet</name>\n" +
                "    <email>abhijeet@example.com</email>\n" +
                "</user>";
    }
}

