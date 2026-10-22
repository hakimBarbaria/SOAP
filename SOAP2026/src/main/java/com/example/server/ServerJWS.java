package com.example.server;

import com.example.service.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8088/BanqueWS";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Service published at " + url + "?wsdl");
    }
}