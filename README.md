# Design Patterns in Java and C#

Welcome to my Design Patterns repository! This repository showcases various design patterns implemented in Java and C#. Each pattern is explained with a brief description and visualized with class diagrams. 

## Table of Contents
- [Introduction](#introduction)
- [Design Patterns Overview](#design-patterns-overview)
- [Classification of Design Patterns](#classification-of-design-patterns)
  - [Creational Patterns](#creational-patterns)
  - [Structural Patterns](#structural-patterns)
  - [Behavioral Patterns](#behavioral-patterns)
- [Resources](#resources)
- [Languages & Tools](#languages--tools)
- [Contact](#contact)


## Introduction

Design patterns are typical solutions to common problems in software design provided by object-oriented programming expert developers. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code. They are categorized into three groups:

1. **Creational Patterns**: Deal with object creation mechanisms. They help in making systems independent of how their objects are created or represented.
2. **Behavioral Patterns**: Deal with object interaction and responsibility. They define the patterns of communication between objects and act as control flow systems.
3. **Structural Patterns**: Deal with object composition or structure and are concerned with how objects and classes are composed to form larger structures.

By using design patterns, you can make your code more flexible, reusable, and easier to understand.

## Design Patterns Overview

| [Creational Design Patterns](#creational-design-patterns) | [Structural Design Patterns](#structural-design-patterns) | [Behavioral Design Patterns](#behavioral-design-patterns) |
|:-|:-|:-|
| [Singleton](#singleton-pattern) | [Adapter](#adapter-pattern) | [Chain of Responsibility](#chain-of-responsibility-pattern) |
| [Factory Method](#factory-method-pattern) | [Bridge](#bridge-pattern) | [Command](#command-pattern) |
| [Abstract Factory](#abstract-factory-pattern) | [Composite](#composite-pattern) | [Iterator](#iterator-pattern) |
| [Builder](#builder-pattern) | [Decorator](#decorator-pattern) | [Mediator](#mediator-pattern) |
| [Prototype](#prototype-pattern) | [Facade](#facade-pattern) | [Memento](#memento-pattern) |
| [Singleton](#singleton-pattern) | [Flyweight](#flyweight-pattern) | [Observer](#observer-pattern) |
| | [Proxy](#proxy-pattern) | [Visitor](#visitor-pattern) |
| | | [Interpreter](#interpreter-pattern) |
| | | [Strategy](#strategy-pattern) |
| | | [State](#state-pattern) |
| | | [Template](#template-method-pattern) |
## Classification of Design Patterns

### Creational Patterns

#### Singleton Pattern
- **Explanation**: Ensures that a class has only one instance and provides a global point of access to it.
- **Main Points**:
  - Should only be used when a class must have a single instance available.
  - Disable all means of creating objects of the class except for a special static creation method, and it returns the existing instance if it is already created.
  - Its code needs to be adapted to handle multiple threads.
  - Initialization types: Early initialization, Lazy initialization.
- **Components**:
  - Static member
  - Private constructor
  - Static factory method
- [Singleton Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Singleton.java)
- [Singleton Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/Singleton/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/singleton.png" width="400"/>

#### Factory Method Pattern
- **Explanation**: Defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created.
- **Main Points**:
  - Use it if you have no idea the exact types of the object your code will work with.
  - Makes it easy to extend the product construction code independently from the rest of the application.
  - Allows introducing new products without breaking existing code.
  - Centralizes the product creation code in one place in the program.
- **Components**:
  - Creator
  - Concrete Creator
  - Product
  - Concrete Product
- [Factory Method Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Factory_method.java)
- [Factory Method Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/FactoryMethod/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/factory.png" width="400"/>

#### Abstract Factory Pattern
- **Explanation**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Main Points**:
  - Use it when your code needs to work with various families of related products.
  - Many designs start with the factory pattern and then evolve to the Abstract Factory pattern.
  - Follows the open/closed and single responsibility principles.
  - Centralizes the product creation code in one place in the program.
- **Components**:
  - Abstract Factory
  - Concrete Factories
  - Abstract Products
  - Concrete Products
  - Client
- [Abstract Factory Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Abstract_Factory.java)
- [Abstract Factory Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/AbstractFactory/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/abstractfactory.png" width="400"/>

#### Builder Pattern
- **Explanation**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- **Main Points**:
  - Create a builder class containing the same fields of the object you need to be created.
  - Add several setters for these fields and a 'build' method responsible for creating the object.
  - Consider creating a director if the same creation code is used to create several objects.
- **Components**:
  - Product
  - Builder
  - Concrete Builder
  - Director
  - Client
- [Builder Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Builder.java)
- [Builder Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/Builder/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/builder.png" width="400"/>

#### Prototype Pattern
- **Explanation**: Specifies the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
- **Main Points**:
  - When your code shouldn't depend on concrete classes of the objects you need to copy or duplicate.
  - Clones objects without coupling them to their concrete classes.
  - Eliminates repeated initialization code.
  - Saves resources and time.
- **Components**:
  - Prototype Interface or Abstract Class
  - Concrete Product
  - Client
  - Clone Method
- [Prototype Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Prototype.java)
- [Prototype Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/ProtoType/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/prototype.png" width="400"/>

### Behavioral Patterns

#### Chain of Responsibility Pattern
- **Explanation**: Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
- **Main Points**:
  - Use when you need to execute several handlers in a particular order.
  - Allows you to insert, remove, or reorder handlers automatically.
  - Each handler must either process the request or pass it along the chain.
  - Client might trigger any handler in the chain, not only the first.
- **Components**:
  - Handler Interface or Abstract Class
  - Concrete Handler
  - Client
- [Chain of Responsibility Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Chain_responsibility.java)
- [Chain of Responsibility Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/ChainResponsibilityPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/chainofresponsibility.png" width="400"/>

#### Command Pattern
- **Explanation**: Encapsulates a request as an object, thereby allowing users to parameterize clients with queues, requests, and operations.
- **Main Points**:
  - Turns a request or behavior into a stand-alone object that contains everything about the request.
  - Encapsulates all the relevant information needed to perform an action or trigger a request.
  - Interesting uses:
    - Passing commands as method arguments
    - Storing them inside other objects or even switching commands at runtime.
  - Commands can be serialized, making it easy to write it into or read it from a file.
- **Components**:
  - Command Interface
  - Concrete Command
  - Invoker
  - Receiver
- [Command Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Command_pattern.java)
- [Command Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/CommandPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/command.png" width="400"/>

#### Interpreter Pattern
- **Explanation**: Defines a grammatical representation for a language and provides an interpreter to interpret the sentences of the language.
- **Main Points**:
  - Use when you need to evaluate sentences in a language.
  - Ideal for designing language interpreters.
  - Language syntax should be well-defined and concrete.
  - Can be optimized for performance by caching results or combining with other patterns.
- **Components**:
  - Abstract Expression
  - Terminal Expression
  - Non-terminal Expression
  - Context
  - Client
- [Interpreter Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Interpreter_pattern.java)
- [Interpreter Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/InterpreterPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/interpreter.png" width="400"/>

#### Iterator Pattern
- **Explanation**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- **Main Points**:
  - Useful for traversing complex data structures like lists, trees, etc.
  - Hides the complexity of the aggregate object from the client.
  - Each iterator provides a standard interface for accessing elements.
  - Allows multiple iterations over the same aggregate without exposing its internal structure.
- **Components**:
  - Iterator Interface
  - Concrete Iterator
  - Aggregate Interface
  - Concrete Aggregate
  - Client
- [Iterator Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Iterator_pattern.java)
- [Iterator Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/IteratorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/iterator.png" width="400"/>

#### Mediator Pattern
- **Explanation**: Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly.
- **Main Points**:
  - Provides a central point for handling communication between objects.
  - Reduces the number of connections between objects, simplifying maintenance.
  - Facilitates interaction between objects in a more controlled manner.
  - Useful in complex dialog scenarios where multiple objects need to interact.
- **Components**:
  - Mediator Interface
  - Concrete Mediator
  - Colleague Classes
- [Mediator Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Mediator_pattern.java)
- [Mediator Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/MediatorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/mediator.png" width="400"/>

#### Memento Pattern
- **Explanation**: Provides the ability to restore an object to its previous state without revealing the details of its implementation.
- **Main Points**:
  - Supports undo operations by restoring the state of an object.
  - Encapsulates the state of an object in a memento object and allows restoring it later.
  - Useful for implementing rollback features or saving the state of an object.
  - Adds a level of abstraction between the caretaker and the originator.
- **Components**:
  - Memento
  - Originator
  - Caretaker
- [Memento Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Memento_pattern.java)
- [Memento Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/MementoPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/memento.png" width="400"/>

#### Observer Pattern
- **Explanation**: Defines a dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **Main Points**:
  - Useful for creating a subscription mechanism where multiple observers need to be notified of changes.
  - Ensures that observers are updated automatically without having to poll or manually check.
  - Reduces tight coupling between the subject and its observers.
- **Components**:
  - Subject
  - Concrete Subject
  - Observer
  - Concrete Observer
- [Observer Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Observer_pattern.java)
- [Observer Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/ObserverPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/observer.png" width="400"/>

#### State Pattern
- **Explanation**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
- **Main Points**:
  - Useful when an object should change its behavior based on its state.
  - Encapsulates state-specific behavior in separate state classes.
  - Makes it easy to add new states without modifying existing code.
  - State transitions are managed by the context object.
- **Components**:
  - Context
  - State Interface
  - Concrete States
- [State Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/State_pattern.java)
- [State Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/StatePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/state.png" width="400"/>

#### Strategy Pattern
- **Explanation**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- **Main Points**:
  - Useful when you need to switch between different algorithms or strategies dynamically.
  - Allows algorithm changes without affecting the client code.
  - Encourages separation of concerns and promotes clean code principles.
  - Strategy objects can be created dynamically or injected at runtime.
- **Components**:
  - Context
  - Strategy Interface
  - Concrete Strategies
- [Strategy Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Strategy_pattern.java)
- [Strategy Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/StrategyPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/strategy.png" width="400"/>

#### Template Method Pattern
- **Explanation**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
- **Main Points**:
  - Provides a way to define a common algorithm structure with customizable steps.
  - Ensures that the overall algorithm structure remains consistent while allowing individual steps to vary.
  - Useful for code reuse and defining invariant parts of an algorithm.
- **Components**:
  - Abstract Class
  - Concrete Class
- [Template Method Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Template_method.java)
- [Template Method Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/TemplateMethodPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/template.png" width="400"/>

#### Visitor Pattern
- **Explanation**: Lets you separate algorithms from the objects on which they operate. By using the Visitor Pattern, you can add new operations to existing object structures without modifying those structures.
- **Main Points**:
  - Useful when you need to perform operations on a set of objects with different types.
  - Allows you to add new operations without modifying the objects’ classes.
  - Each object accepts a visitor object and provides an appropriate method for it.
- **Components**:
  - Visitor Interface
  - Concrete Visitor
  - Element Interface
  - Concrete Element
  - Object Structure
- [Visitor Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Visitor_pattern.java)
- [Visitor Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/VisitorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/visitor.png" width="400"/>

### Structural Patterns

#### Adapter Pattern
- **Explanation**: Converts the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
- **Main Points**:
  - Useful when integrating with legacy code or third-party libraries.
  - Provides a way to use existing classes with a new interface.
  - Adapts the interface of a class to match the expected interface.
- **Components**:
  - Target
  - Adapter
  - Adaptee
- [Adapter Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Adapter_pattern.java)
- [Adapter Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/AdapterPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/adapter.png" width="400"/>

#### Bridge Pattern
- **Explanation**: Decouples an abstraction from its implementation so that the two can vary independently. The Bridge Pattern allows you to change the implementation without changing the abstraction.
- **Main Points**:
  - Useful when you need to extend both abstractions and implementations independently.
  - Separates the interface from its implementation.
  - Allows new implementations to be added without modifying existing abstractions.
- **Components**:
  - Abstraction
  - Refined Abstraction
  - Implementor
  - Concrete Implementor
- [Bridge Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Bridge_pattern.java)
- [Bridge Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/BridgePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/bridge.png" width="400"/>

#### Composite Pattern
- **Explanation**: Composes objects into tree structures to represent part-whole hierarchies. Composite Pattern lets clients treat individual objects and compositions of objects uniformly.
- **Main Points**:
  - Useful when you need to represent part-whole hierarchies.
  - Allows you to treat individual objects and compositions of objects uniformly.
  - Simplifies client code by using a common interface.
- **Components**:
  - Component
  - Leaf
  - Composite
- [Composite Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Composite_pattern.java)
- [Composite Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/CompositePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/composite.png" width="400"/>

#### Decorator Pattern
- **Explanation**: Adds behavior to objects dynamically by placing them inside special wrapper objects that contain the behaviors.
- **Main Points**:
  - Useful when you need to add responsibilities to objects dynamically and transparently.
  - Allows you to extend the functionality of objects without altering their structure.
  - Decorators can be stacked to combine functionalities.
- **Components**:
  - Component
  - Concrete Component
  - Decorator
  - Concrete Decorators
- [Decorator Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Decorator_pattern.java)
- [Decorator Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/DecoratorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/decorator.png" width="400"/>

#### Facade Pattern
- **Explanation**: Provides a unified interface to a set of interfaces in a subsystem. The Facade Pattern defines a higher-level interface that makes the subsystem easier to use.
- **Main Points**:
  - Useful when you need to provide a simplified interface to a complex subsystem.
  - Hides the complexities of the subsystem and provides a clean interface.
  - Facilitates usage by reducing the number of interactions with the subsystem.
- **Components**:
  - Facade
  - Subsystems
- [Facade Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Facade_pattern.java)
- [Facade Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/FacadePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/facade.png" width="400"/>

#### Flyweight Pattern
- **Explanation**: Uses sharing to support large numbers of fine-grained objects efficiently. The Flyweight Pattern reduces the memory footprint of objects.
- **Main Points**:
  - Useful when you need to manage a large number of objects that share common state.
  - Stores intrinsic state shared across multiple objects and extrinsic state that varies between objects.
  - Reduces the number of objects created by sharing common parts.
- **Components**:
  - Flyweight
  - Concrete Flyweight
  - Flyweight Factory
- [Flyweight Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Flyweight_pattern.java)
- [Flyweight Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/FlyweightPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/flyweight.png" width="400"/>

#### Proxy Pattern
- **Explanation**: Provides a surrogate or placeholder for another object to control access to it. The Proxy Pattern allows you to control access, create, and manage an object indirectly.
- **Main Points**:
  - Useful when you need to control access to an object or add additional functionality without modifying the object itself.
  - Types of proxies:
    - Virtual Proxy
    - Protection Proxy
    - Remote Proxy
  - Implements different proxy types to add control layers.
- **Components**:
  - Subject
  - Proxy
  - Real Subject
- [Proxy Pattern Code (JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Proxy_pattern.java)
- [Proxy Pattern Code (C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/SDP(C%23)/ProxyPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <br>
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/proxy.png" width="400"/>
## Resources
1. [GeeksforGeeks - Software Design Patterns](https://www.geeksforgeeks.org/software-design-patterns/)
2. [YouTube Playlist - Design Patterns](https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=-O4aAbHaeI5LxWLA)
3. [GeeksforGeeks - Interview Questions](https://www.geeksforgeeks.org/top-design-patterns-interview-questions/)
4. [Interviewbit - Interview Questions](https://www.interviewbit.com/design-patterns-interview-questions/)
5. [Tutorialspoint - Interview Questions](https://www.tutorialspoint.com/design_pattern/design_pattern_questions_answers.htm)
6. [Scholarhat - Interview Questions(.Net)](https://www.scholarhat.com/tutorial/designpatterns/dotnet-design-patterns-interview-questions-and-answers)
7. [Bytehide - Interview Questions(C#)](https://www.bytehide.com/blog/csharp-design-patterns-interview-questions-experienced)
8. [Tutorialspoint - MCQ Quiz](https://www.tutorialspoint.com/design_pattern/design_pattern_online_quiz.htm)
8. [Sanfoundry - MCQ Questions](https://www.sanfoundry.com/software-engg-mcqs-software-design-pattern/)

## Languages & Tools
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)
![C#](https://img.shields.io/badge/C%23-239120?style=flat&logo=c-sharp&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat&logo=github-actions&logoColor=white)
![.NET](https://img.shields.io/badge/.NET-512BD4?style=flat&logo=dotnet&logoColor=white)

## Contact
For questions or suggestions, feel free to open an issue on the [GitHub repository](https://github.com/zeyadsalah22/Design-Patterns).

---

Feel free to contribute to this repository and make suggestions to improve the code and documentation. Happy coding!
