# language: fr
Fonctionnalité: supprimer un produit de son panier
	En tant que internaute
	Je souhaite supprimer un produit de mon panier
	Afin de ne pas commander le produit

@tag
Scénario: supprimer le produit iphone X
	Soit un internaute dans son panier cDiscount
	Lorsque je clique sur l'icone corbeille a cote du produit "APPLE iPhone X 64Go Argent"
	Alors le produit "APPLE iPhone X 64Go Argent" est supprimé de mon panier