# CrackagePassword
Pour mettre en œuvre un patron de conception Factory dans le cadre de notre projet Java
pour le craquage de mot de passe en utilisant la méthode de bibliothèque et la méthode de force brute, 
nous avons suivi les étapes suivantes : 
  . Création de l'interface PasswordCracker qui déclare les méthodes trouverMdpSimple et trouverMdpHash.
  
  . Implémentation de la classe DictionnaryCracker Chargé de trouver un mot de passe en utilisant une approche de recherche dans un 
    dictionnaire (trouverMdpSimple ) et aussi Génére des hashes à partir des mots de passe du dictionnaire, 
    afin de les comparer avec un hash donné pour trouver un mot de passe correspondant(trouverMdpHash ) 

  . Implémentation de la classe BruteForceCracker qui génère toutes les combinaisons possibles de caractères, 
    les compare avec le mot de passe cible et retourne le mot de passe correspondant s'il est trouvé(trouverMdpSimple ) mais aussi 
    Comparer les mots de passe générés avec le mot de passe cible en convertissant les mots de passe en clair 
    en hachages et en les comparant entre eux(trouverMdpHash ) 

  . Implementation de la classe Application utilisée pour tester les fonctionnalités des classes DictionnaryCracker et BruteForceCracker. 
  
  . Implementaion de la Factory utili
