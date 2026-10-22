package com.example.client;

import com.example.proxy.BanqueService;
import com.example.proxy.BanqueWSSOAP;
import com.example.proxy.Compte;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService stub = new BanqueWSSOAP().getBanqueServicePort();

        System.out.println("Le montant converti est : " + stub.convert(4500));

        Compte c = stub.getCompte(3);
        System.out.println(c.getCode());
        System.out.println(c.getSolde());

        stub.listComptes().forEach(cp ->
            System.out.println(cp.getCode() + " = " + cp.getSolde()));
    }
}