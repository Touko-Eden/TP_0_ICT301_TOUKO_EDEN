# TP_0_ICT301_TOUKO_EDEN
devoir ICT301 - Principes SOLID

## Informations de l’étudiant
- Nom :  TOUKO TOMTA 
- Prénoms :  MAXIMIN EDEN
- Matricule :  23U2413

## Encadrement
- **Dr Valéry Monthe**  
  Email : valery.monthe@facsciences-uy1.cm
- **Mr Dave (Davephil)**


## Présentation du projet

Ce projet a été réalisé dans le cadre du cours **ICT301 : Architecture logicielle et conception**.  
Il a pour objectif d’illustrer les **cinq principes SOLID** à travers des exemples concrets de code Java, présentés **avant** et **après refactoring**, conformément au support de cours.

Les principes SOLID permettent d’améliorer :
- la maintenabilité du code,
- la lisibilité,
- la réutilisabilité,
- et la robustesse des applications logicielles.


## Les principes SOLID

### 1. SRP – Single Responsibility Principle
Une classe ne doit avoir **qu’une seule responsabilité** et **une seule raison de changer**.  
Dans ce projet, l’exemple montre qu’une classe qui gère à la fois les données, l’affichage, la persistance et la logique métier viole le SRP.  
Le refactoring consiste à séparer ces responsabilités dans des classes distinctes.


### 2. OCP – Open Closed Principle
Une entité logicielle doit être **ouverte à l’extension mais fermée à la modification**.  
L’utilisation des interfaces et du polymorphisme permet d’ajouter de nouvelles fonctionnalités sans modifier le code existant, ce qui réduit les risques d’erreurs.


### 3. LSP – Liskov Substitution Principle
Une sous-classe doit pouvoir remplacer sa classe mère **sans altérer le comportement attendu du programme**.  
Le projet montre qu’une mauvaise utilisation de l’héritage peut produire des résultats incorrects, et que l’utilisation d’interfaces permet de respecter ce principe.


### 4. ISP – Interface Segregation Principle
Une classe ne doit pas être forcée d’implémenter des méthodes qu’elle n’utilise pas.  
Ce principe recommande de créer des **interfaces petites et spécifiques**, adaptées aux besoins réels des classes clientes.


### 5. DIP – Dependency Inversion Principle
Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau, mais **d’abstractions**.  
Grâce aux interfaces et à l’injection de dépendances, le code devient plus flexible et facilement testable.


## Organisation du projet

Le dépôt est organisé comme suit :

- "SRP/" : Exemples du principe SRP (avant et après refactoring)
- "OCP/" : Exemples du principe OCP
- "LSP/" : Exemples du principe LSP
- "ISP/" : Exemples du principe ISP
- "DIP/" : Exemples du principe DIP
- "solid_diagrammes.pdf" : Diagrammes de classes avant et après refactoring
- "README.md" : Présentation et explication du projet


## Conclusion

Les principes SOLID constituent une base essentielle pour la conception de logiciels robustes et évolutifs.  
Leur application permet de réduire le couplage, d’augmenter la cohésion et de faciliter l’évolution des applications dans le temps.
