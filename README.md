# patrons

# Analyse du Patron par Joanne, le 14/12/2023

 ## Nom du patron: Methode frabrique

 ### Catégorie: C'est un patrons de création

 ### Utilité: Permet de créer un objet sans préciser exactement quel objet sera créé aussi d'encapsuler la création d'objets, avec une interface pour instancier différents types d'objets. 


## Concepts OOP :
   ### L'utilisation de l'héritage dans le patron :
    
Dans ce patron de conception, l'héritage est souvent utilisé pour créer des sous-classes de la classe abstraite MotorVehicleFactory dans l'implementation, pour chaque type de «produit» (CarFactory et MotorcycleFactory). Ces sous-classes héritent de la logique générale de la création qui vient de la classe de fabrique abstraite tout en permettant la création de types de vehicule spécifiques.

      
    
   ### L'utilisation d'interfaces dans le patron:
       
   Les interfaces définissent des règles que les classes concrètes doivent suivre. Dans le patron de conception Fabrique, l'interface MotorVehicle est un exemple. Les classes concrètes (comme Car et Motorcycle) respectent ces règles en implémentant l'interface, afin qu'elles fournissent une méthode build().


   ### L'utilisation du polymorphisme dans le patron:
   Tout abord le polymorphisme fait référence à la capacité d’appeler la même méthode sur des objets de types différents et d’obtenir des résultats différents.Ainsi,le polymorphisme est largement utilisé dans ce patron de conception Fabrique. Par exemple, le polymorphisme est utilisé lorsque qu'ont appele la méthode create() sur une instance de MotorVehicleFactory. Cette méthode retourne un objet de type MotorVehicle, qui peut être une instance de n'importe quelle classe implémentant l'interface MotorVehicle.

  ### L'utilisation de composition dans le patron:
      
   La composition ne pas utilisé dans l'implémentation de cette exemple du patron de conception Fabrique. Dans cette exemple j'utilise l'héritage, avec des classes abstraites et des sous-classes pour créer des objets spécifiques.





  ### Sources : 
  Baeldung (la source de mon implementation): https://www.baeldung.com/java-factory-pattern

  Refactoring Guru : https://refactoring.guru/fr/design-patterns/factory-method
 
  Le note des cours:https://physcrowley.github.io/ICS4U/u4-OOP2.html

  Derek Banas,Factory Design Pattern : https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07&index=5&t=627s


### Évaluation

4++ 4+

o CO - Les identifiants (variables et méthodes), les commentaires, les javadoc et l'indentation rendent le code facile à lire

o CO - Les informations dans le README sont bien structurées et faciles à lire. (excellent)

x MA - Le diagramme de classe UML est cohérent avec votre implémentation du patron. (manque les traits simples pour indiquer qu'une classe utilise une autre : entre MotorVehicleFactory et MotorVehicle et entre MotorVehicleFactory et App)

o MA - Votre analyse démontre votre capacité à reconnaître les concepts de l'OOP dans un contexte concret. (excellentes explications)

o MA - Le travail correspond entièrement aux spécifications du projet.
