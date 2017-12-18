# language: fr
Fonctionnalité: S'identifier
    En tant que internaute
    Je souhaite rentrer mes identifiants
    Afin de m'identifier sur cDiscount

@tag
Scénario: S'identifier - Success
    Soit un internaute sur la page d'identification de cDiscount
    Lorsque il rentre les identifiants "bouissou.cyprien@gmail.com" et "testMaintenance1$"
    Alors il est écrit "Bonjour wdtght" en haut de la page de compte

@tag
Scénario: S'identifier - Fail
    Soit un internaute sur la page d'identification de cDiscount
    Lorsque il rentre les identifiants "bouissou.cyprien@gmail.com" et "blabla"
    Alors le message d'erreur "Veuillez entrer un E-mail ou mot de passe valide" est affiche