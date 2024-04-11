
# GoF (Gangs of Four) Design Pattern Types
## GoF Design Patterns are divided into three categories:

- ***Creational***: The design patterns that deal with the creation of an object.
- ***Structural***: The design patterns in this category deals with the class structure such as Inheritance and Composition.
- ***Behavioral***: This type of design patterns provide solution for the better interaction between objects, how to provide lose coupling, and flexibility to extend easily in future.

## Patterns by type
- **Creational**

  - ***Abstract factory*** groups object factories that have a common theme.
  - ***Builder*** constructs complex objects by separating construction and representation.
  - ***Factory*** method creates objects without specifying the exact class to create.
  - ***Prototype*** creates objects by cloning an existing object.
  - ***Singleton*** restricts object creation for a class to only one instance.

- **Structural**

  - ***Adapter*** allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
  - ***Bridge*** decouples an abstraction from its implementation so that the two can vary independently.
  - ***Composite*** composes zero-or-more similar objects so that they can be manipulated as one object.
  - ***Decorator*** dynamically adds/overrides behavior in an existing method of an object.
  - ***Facade*** provides a simplified interface to a large body of code.
  - ***Flyweight*** reduces the cost of creating and manipulating a large number of similar objects.
  - ***Proxy*** provides a placeholder for another object to control access, reduce cost, and reduce complexity.

- **Behavioral**

  - ***Chain of responsibility*** delegates commands to a chain of processing objects.
  - ***Command*** creates objects that encapsulate actions and parameters.
  - ***Interpreter*** implements a specialized language.
  - ***Iterator*** accesses the elements of an object sequentially without exposing its underlying representation.
  - ***Mediator*** allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
  - ***Memento*** provides the ability to restore an object to its previous state (undo).
  - ***Observer*** is a publish/subscribe pattern, which allows a number of observer objects to see an event.
  - ***State*** allows an object to alter its behavior when its internal state changes.
  - ***Strategy*** allows one of a family of algorithms to be selected on-the-fly at runtime.
  - ***Template*** method defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
  - ***Visitor*** separates an algorithm from an object structure by moving the hierarchy of methods into one object.
