# patrons

# Analyse du Patron par Joanne, le 14/12/2023

 ## Nom du patron: Methode frabrique

 ### Catégorie: C'est un patrons de création

 ### Utilité: Permet de créer un objet sans préciser exactement quel objet sera créé aussi d'encapsuler la création d'objets, avec une interface pour instancier différents types d'objets. 


## Concepts OOP :
   ### L'utilisation de l'héritage dans le patron :
    
Dans le patron de conception Fabrique, l'héritage est souvent utilisé pour créer des sous-classes de la classe abstraite MotorVehicleFactory dans l'implementation, pour chaque type de «produit» (CarFactory et MotorcycleFactory). Ces sous-classes héritent de la logique générale de la création fournie par la classe de fabrique abstraite tout en permettant la création de types de produits spécifiques.

      
    
   ### L'utilisation d'interfaces dans le patron:
       
   Les interfaces définissent des règles que les classes concrètes doivent suivre. Dans le patron de conception Fabrique, l'interface MotorVehicle est un exemple. Les classes concrètes (comme Car et Motorcycle) respectent ces règles en implémentant l'interface, assurant ainsi qu'elles fournissent une méthode build().


   ### L'utilisation du polymorphisme dans le patron:
   Le polymorphisme fait référence à la capacité d’appeler la même méthode sur des objets de types différents et d’obtenir des résultats différents.Ainsi,le polymorphisme est largement utilisé dans ce patron de conception Fabrique. Par exemple, le polymorphisme est utilisé lorsque qu'ont appele la méthode create() sur une instance de MotorVehicleFactory. Cette méthode retourne un objet de type MotorVehicle, qui peut être une instance de n'importe quelle classe implémentant l'interface MotorVehicle.

  ### L'utilisation de composition dans le patron:




     


