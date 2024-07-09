# Design Patterns in Java

## Introduction

Design patterns are typical solutions to common problems in software design provided by object-oriented programming expert developers. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code. They are categorized into three groups:

1. **Creational Patterns**: Deal with object creation mechanisms. They help in making systemd independent of how its objects are created or represented.
2. **Behavioral Patterns**: Deal with object interaction and responsibility. They define the patterns of communication between objects and act as control flow system.
3. **Structural Patterns**: Deal with object composition or structure and concerened with how objects and classes are composed to form the larger structure.

By using design patterns, you can make your code more flexible, reusable, and easier to understand.

## Classification of Design Patterns

### Creational Patterns

Creational patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

1. **Singleton Pattern**
    - **Explanation**: Ensures that a class has only one instance and provides a global point of access to it.
    - **Main Points**:
         1- Should only be used when class must have single instance available.
         2- Disable all means of creating objects of class except for special static creation method and it returns the existing instance if it is already created.
         3- Its code need to be adapted to handle multiple threats
         4- Initalization types: Early initialization, Lazy initialization.
    - **Components**:
         1- Static member
         2- Private Constructor
         3- Static factory method.
    - [Singleton Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Singleton.java)
  
2. **Factory Method Pattern**
    - **Explanation**: Defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created.
    - [Factory Method Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Factory_method.java)

3. **Abstract Factory Pattern**
    - **Explanation**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
    - [Abstract Factory Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Abstract_Factory.java)

4. **Builder Pattern**
    - **Explanation**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
    - [Builder Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Builder.java)

5. **Prototype Pattern**
    - **Explanation**: Specifies the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
    - [Prototype Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Prototype.java)

### Behavioral Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

1. **Chain of Responsibility Pattern**
    - **Explanation**: Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
    - [Chain of Responsibility Pattern Code](link-to-chain-of-responsibility-pattern-code)
    
2. **Command Pattern**
    - **Explanation**: Encapsulates a request as an object, thereby allowing users to parameterize clients with queues, requests, and operations.
    - [Command Pattern Code](link-to-command-pattern-code)
    
3. **Interpreter Pattern**
    - **Explanation**: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
    - [Interpreter Pattern Code](link-to-interpreter-pattern-code)
    
4. **Iterator Pattern**
    - **Explanation**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
    - [Iterator Pattern Code](link-to-iterator-pattern-code)
    
5. **Mediator Pattern**
    - **Explanation**: Defines an object that encapsulates how a set of objects interact. This pattern promotes loose coupling by keeping objects from referring to each other explicitly.
    - [Mediator Pattern Code](link-to-mediator-pattern-code)
    
6. **Memento Pattern**
    - **Explanation**: Allows the state of an object to be captured and restored at a later time, without violating encapsulation.
    - [Memento Pattern Code](link-to-memento-pattern-code)
    
7. **Observer Pattern**
    - **Explanation**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    - [Observer Pattern Code](link-to-observer-pattern-code)
    
8. **State Pattern**
    - **Explanation**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
    - [State Pattern Code](link-to-state-pattern-code)
    
9. **Strategy Pattern**
    - **Explanation**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from the clients that use it.
    - [Strategy Pattern Code](link-to-strategy-pattern-code)
    
10. **Template Method Pattern**
    - **Explanation**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. This pattern lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
    - [Template Method Code](link-to-template-method-code)
    
11. **Visitor Pattern**
    - **Explanation**: Lets you define a new operation without changing the classes of the elements on which it operates.
    - [Visitor Pattern Code](link-to-visitor-pattern-code)

### Structural Patterns

Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

1. **Adapter Pattern**
    - **Explanation**: Allows objects with incompatible interfaces to collaborate.
    - [Adapter Pattern Code](link-to-adapter-pattern-code)
    
2. **Composite Pattern**
    - **Explanation**: Composes objects into tree structures to represent part-whole hierarchies. Allows individual objects and compositions to be treated uniformly.
    - [Composite Pattern Code](link-to-composite-pattern-code)
    
3. **Decorator Pattern**
    - **Explanation**: Allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.
    - [Decorator Pattern Code](link-to-decorator-pattern-code)
    
4. **Facade Pattern**
    - **Explanation**: Provides a simplified interface to a complex subsystem.
    - [Facade Pattern Code](link-to-facade-pattern-code)
    
5. **Flyweight Pattern**
    - **Explanation**: Reduces the cost of creating and manipulating a large number of similar objects.
    - [Flyweight Pattern Code](link-to-flyweight-pattern-code)
    
6. **Proxy Pattern**
    - **Explanation**: Provides a surrogate or placeholder for another object to control access to it.
    - [Proxy Pattern Code](link-to-proxy-pattern-code)

## References

1. [GeeksforGeeks - Software Design Patterns](https://www.geeksforgeeks.org/software-design-patterns/)
2. [YouTube Playlist - Design Patterns](https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=-O4aAbHaeI5LxWLA)
