package com.designpatterns.adapter;

//adapter

import org.json.JSONObject;
import org.json.XML;
public class  XmlToJsonAdapter implements  JsonData{

    private XmlService xmlService;

    // Constructor Injection
    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getJsonData() {
        String xml = xmlService.getXmlData();
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString(4);
    }


}
