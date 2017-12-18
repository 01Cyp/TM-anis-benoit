# language: fr
Fonctionnalité: Rechercher un produit
    En tant que internaute
    Je souhaite pouvoir faire une recherche
    Afin de consulter un produit

@tag
Scénario: Rechercher le produit iphone X - Fail
    Soit un internaute sur cDiscount
    Lorsque il fait une recherche avec le mot cle "iphone X"
    Alors le texte "iphone X" est affiché
    
@tag
Scénario: Rechercher le produit iphone X - Success
    Soit un internaute sur cDiscount
    Lorsque il fait une recherche avec le mot cle "iphone X"
    Alors le texte "APPLE iPhone X 64Go Argent" est affiché
