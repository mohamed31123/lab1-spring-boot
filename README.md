
# 📌 TP Java – Injection dynamique avec réflexion

## 📝 Description
Ce projet est une application Java simple qui illustre l’utilisation des **interfaces** et de leurs **implémentations** pour effectuer un calcul.  
L’objectif est de montrer comment utiliser la **réflexion** pour charger dynamiquement les classes à partir d’un fichier de configuration (`config.txt`), permettant ainsi une flexibilité dans la gestion des dépendances.



## 📂 Structure du projet
## src/

## ├── dao/  Interfaces et implémentations DAO


## ├── metier/         Interfaces et implémentations métier


## ├── presentation/  Classes de présentation (main, affichage)


## └── config.txt     Fichier de configuration externe


## ⚙️ Configuration
Le fichier `config.txt` doit être placé à la racine du projet.  
Il contient les noms complets des classes à utiliser :


- La **première ligne** correspond à l’implémentation du DAO.  
- La **seconde ligne** correspond à l’implémentation de la couche métier.  

##  Exécution
La classe principale `Presentation2` :
1. Lit le fichier `config.txt`
2. Charge dynamiquement les classes DAO et Métier via la réflexion
3. Injecte le DAO dans le Métier
4. Exécute la méthode `calcul()` et affiche le résultat

## Video demo : 



https://github.com/user-attachments/assets/eff5be32-1729-498c-b58d-1ee09b4aff71




##   Conclusion
Ce TP capstone démontre la mise en place d’une application complète, robuste et performante.
Grâce à la configuration externe et à la réflexion, l’application est flexible et facilement extensible.
Elle est prête pour un déploiement en production avec des fonctionnalités solides de gestion des réservations et d’optimisation des performances


## Auteur : 
### EDDINARI MED




