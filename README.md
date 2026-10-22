# SOAP – Application bancaire CRUD

Une application bancaire simple qui utilise les **services web SOAP**. Elle permet de gérer des comptes bancaires (créer, consulter, modifier, supprimer) grâce à un service SOAP et à une application cliente séparée.

---

## Fonctionnalités

- **Créer** un compte bancaire
- **Consulter** un compte (un seul ou la liste complète)
- **Modifier** les informations d'un compte
- **Supprimer** un compte

---

## Technologies utilisées

| Élément | Technologie |
|---|---|
| Langage | Java |
| Type de service | SOAP (services web) |
| Contrat du service | WSDL |
| Format des messages | XML |
| Base de données | *(à compléter, ex. MySQL)* |

---

## Structure du projet

```
SOAP/
├── SOAP2026/          → Le service SOAP (le serveur)
└── ClientSOAP2026/    → L'application cliente qui utilise le service
```

- **SOAP2026** : contient le service et ses opérations (création, consultation, modification, suppression).
- **ClientSOAP2026** : appelle le service SOAP pour effectuer les opérations.

---

## Prérequis

Avant de commencer, installez :

- Java JDK *(version à préciser, ex. 17)*
- Un IDE (Eclipse, IntelliJ IDEA ou NetBeans)
- Un serveur d'applications *(si nécessaire, ex. Tomcat ou GlassFish)*
- Une base de données *(si nécessaire)*

---

## Lancer le projet

### 1. Cloner le dépôt

```bash
git clone https://github.com/hakimBarbaria/SOAP.git
cd SOAP
```

### 2. Démarrer le service SOAP

1. Ouvrez le dossier `SOAP2026` dans votre IDE.
2. Configurez la base de données si besoin.
3. Lancez le service.
4. Vérifiez que le WSDL est accessible, par exemple :
   `http://localhost:8080/NomDuService?wsdl` *(à adapter selon votre projet)*

### 3. Lancer l'application cliente

1. Ouvrez le dossier `ClientSOAP2026` dans votre IDE.
2. Vérifiez que l'adresse du service est correcte.
3. Lancez le client.

---

## Exemple de requête SOAP

Voici un exemple simple de requête pour créer un compte *(à adapter selon votre WSDL)* :

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
  <soapenv:Body>
    <creerCompte>
      <titulaire>Hakim barbaria</titulaire>
      <solde>1500.0</solde>
    </creerCompte>
  </soapenv:Body>
</soapenv:Envelope>
```

---

## Ce que j'ai appris

- Comprendre et utiliser un **contrat WSDL**
- Échanger des messages **XML** entre un client et un serveur
- Séparer le projet en deux parties : **service** et **client**
- Mettre en place les opérations **CRUD** avec SOAP

---

## Remarque

Ce projet est réalisé à but d'apprentissage. Les données utilisées sont **fictives**.

---

## Auteur

**Hakim Barbaria**
GitHub : [hakimBarbaria](https://github.com/hakimBarbaria)

N'hésitez pas à donner une étoile au projet si vous l'aimez, et vos retours sont les bienvenus !
