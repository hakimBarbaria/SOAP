package com.example.service;

import java.util.*;
import com.example.model.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "BanqueService", serviceName = "BanqueWSSOAP")
public class BanqueService {

    private final List<Compte> comptes = new ArrayList<>(List.of(
        new Compte(1, 1500.0, new Date()),
        new Compte(2, 3200.5, new Date()),
        new Compte(3, 870.0,  new Date())
    ));

    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 0.30;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code) {
        return comptes.stream()
                .filter(c -> c.getCode() == code)
                .findFirst()
                .orElse(null);
    }

    @WebMethod(operationName = "listComptes")
    public List<Compte> getComptes() {
        return comptes;
    }
}