# Design Patterns in Java

## Introduction

Design patterns are typical solutions to common problems in software design provided by object-oriented programming expert developers. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code. They are categorized into three groups:

1. **Creational Patterns**: Deal with object creation mechanisms. They help in making systems independent of how their objects are created or represented.
2. **Behavioral Patterns**: Deal with object interaction and responsibility. They define the patterns of communication between objects and act as control flow systems.
3. **Structural Patterns**: Deal with object composition or structure and are concerned with how objects and classes are composed to form larger structures.
****
By using design patterns, you can make your code more flexible, reusable, and easier to understand.

## Classification of Design Patterns

### Creational Patterns

Creational patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

1. **Singleton Pattern**
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
    - [Singleton Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Singleton.java)
  
2. **Factory Method Pattern**
    - **Explanation**: Defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created.
    - **Main Points**:
         - Use it if you have no idea the exact types of the object your code will work with.
         - Mkaes it easy to extend the poroduct construction code independently from the rest of the application.
         - Allow introducing new products without breaking existing code.
         - Cnetralizes the product creation code in one place in program.
    - **Components**:
         - Creator
         - Concrete Creator
         - Product
         - Concrete Product
    - [Factory Method Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Factory_method.java)

3. **Abstract Factory Pattern**
    - **Explanation**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
    - **Main Points**:
         - Use it when your code needs to work with various families of related products.
         - Many designs start with the factory pattern and then evolve to th ABstract factory pattern.
         - Follows the open_closed and single responsibility principles.
         - Centralizes the product creation code in one place in the program.
    - **Components**:
         - Abstract Factory
         - Concrete Factories
         - Abstract Products
         - Concrete Products
         - Client
    - [Abstract Factory Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Abstract_Factory.java)

4. **Builder Pattern**
    - **Explanation**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
    - **Main Points**:
         - Create builder class containning same fields of the object you need to be created.
         - Add several setters for theses fields and a 'build' method responsible for creating the object.
         - Think about creating a director if the same creation code is used to create several objects.
    - **Components**:
         - Product
         - Builder
         - Concrete Builder
         - Director
         - Client
    - [Builder Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Builder.java)

5. **Prototype Pattern**
    - **Explanation**: Specifies the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
    - **Main Points**:
         - When your code shouldn't depend on concrete classes of the objects you need to copy or duplicate.
         - Will clone objects without coupling them to their concrete classes.
         - Will get rid of repeated initialization code.
         - Will save resources and time.
    - **Components**:
         - Prototype Interface or Abstract Class
         - Concrete Product
         - Client
         - Clone Method
    - [Prototype Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Prototype.java)

### Behavioral Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

1. **Chain of Responsibility Pattern**
    - **Explanation**: Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
    - **Main Points**: 
      - Use when you encounter the need to execute several handlers in particular order.
      - Allows you to insert, remove or reorder handlers automatically.
      - Each handler must either process the request or pass it along the chain.
      - Client might trigger any handler in the chain, not only the first.
    - **Components**:
      - Handler Interface or abstract class
      - Concrete Handler
      - Client
    - [Chain of Responsibility Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Chain_responsibility.java)
    
2. **Command Pattern**
    - **Explanation**: Encapsulates a request as an object, thereby allowing users to parameterize clients with queues, requests, and operations.
    - **Main Points**:
      - Turns a request or behavior to a stand-alone object that contains everything about the request. 
      - Encapsulates all the relevant information needed to perform an action or trigger a request.
      - Interesting uses:
        - Passing commands as method arguments
        - Storing them inside other objects or even switching commands at runtime.
      - Commands can vbe serialized, making it easy to write it into or read it from a file.
    - **Components**:
      - Command Interface
      - Concrete Command
      - Invoker
      - Receiver
      
    - [Command Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Command_pattern.java)
    
3. **Interpreter Pattern**
    - **Explanation**: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
    - **Main Points**: 
    - **Components**:
    - [Interpreter Pattern Code](link-to-interpreter-pattern-code)
    
4. **Iterator Pattern**
    - **Explanation**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
    - **Main Points**: 
      - Reduces traversal code duplication
      - Applies single responsibility and open-closed principles, each iteration algorithm is extracted in separate class and new iterators can be added with modifying existing ones.
      - Encapsulates the details of complex data structures by exposing simple methods to access the collection elements.
    - **Components**:
      - Iterator Interface
      - Concrete Iterator
      - Iterable Collection Interface
      - Concrete Collection
      - Client
    - [Iterator Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Iterator_pattern.java)
    
5. **Mediator Pattern**
    - **Explanation**: Defines an object that encapsulates how a set of objects interact. This pattern promotes loose coupling by keeping objects from referring to each other explicitly.
    - **Main Points**: 
      - Extract all relationships between classes into a separate class.
      - Allows to reuse any component in a different app, making it easy to define new ways of communication between components by introducing new mediator class.
      - Classes will be decoupled from one another as they will communicate directly vie mediator.
    - **Components**:
      - Mediator
      - Concrete Mediator
      - Component
      - Concrete Component
    - [Mediator Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Mediator.java)
    
6. **Memento Pattern**
    - **Explanation**: Allows the state of an object to be captured and restored at a later time, without violating encapsulation.
    - **Main Points**:
      - Lets you save and reuse the states of an object without revealing the details of its implementations, to do that this pattern makes full copies of object's states.
      - Makes the original object's data safe and secure.
      - Delegates the creation of object's state snapshot to the object itself.
    - **Components**:
      - Originator
      - Memento
      - Care Taker
      - Client
    - [Memento Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Memento.java)
    
7. **Observer Pattern**
    - **Explanation**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    - **Main Points**: 
      - Allows to change or take action on set of objects when the state of another object changes.
      - This can be done even if the modifiable set of objects are unknown beforehand ir changes dynamically.
      - You can introduce new subscriber classes without having to change the publisher code ,and vice versa if there is publisher interface.
      - Primarily deals with interaction and communication between objects, specifically focuses on how objects behave in response to changes in state of another object. 
    - **Components**:
      - Subject
      - Concrete Subject
      - Observer
      - Concrete Observer
    - [Observer Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Observer_pattern.java)
    
8. **State Pattern**
    - **Explanation**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
    - **Main Points**: 
      - Extract each logic to separate class and let the context delegate the behavior to the corresponding stata class
      - Applies single responsibility and open-closed principle where each state is organized in separate class and we can introduce new states.
      - Focuses on managing state transitions and coordinating state-specific behavior.
    - **Components**:
      - Context
      - State Interface or base class
      - Concrete States
    - [State Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/state_pattern.java)
    
9. **Strategy Pattern**
    - **Explanation**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from the clients that use it.
    - **Main Points**:
      - Strategies are easily replaceable and interchangeable by clients at runtime.
      - Applies single responsibility and open-closed principles, where each strategy is isolated in separate class and we can easily add new ones.
      - One of the gang of four(GOF).
      - Promotes object collaboration.
    - **Components**:
      - Context
      - Strategy Interface
      - Concrete Strategies
      - Client
    - [Strategy Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Strategy_pattern.java)

## State vs Strategy Patterns

| State Pattern                                                             | Strategy Pattern                                                       |
|---------------------------------------------------------------------------|------------------------------------------------------------------------|
| States can be dependant as you can easily jump from one state to another. | Strategies are completely independant and unaware of each other.       |
| About doing different things based on the state, hence result may vary.   | About having different implementations that accomplish the same thing. |

    
10. **Template Method Pattern**
    - **Explanation**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. This pattern lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
    - **Main Points**: 
      - Turns an algorithm into a series of individual methods.
      - Keep the structure of your base algorithm intact.
      - Eliminates code duplication by pulling up the steps with same implementations into the superclass housing the template method.
      - The code that varies is split between different implementations.
    - **Components**:
      - Abstract Class
      - Template Method
      - Abstract Methods
      - Concrete Subclasses
    - [Template Method Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Template_pattern.java)
    
11. **Visitor Pattern**
    - **Explanation**: Lets you define a new operation without changing the classes of the elements on which it operates.
    - **Main Points**: 
      - Isolates particular behaviors from the objects on which they operate, and places them in a single class.
      - Classes will be more focused on their main job hence enforcing single responsibility principle.
      - Applies open-closed principle as new visiting behaviors can be easily introduced without modifying the existing ones.
      - Visitors are easily interchangeable by clients at runtime.
    - **Components**:
      - Client
      - Visitor Interface
      - Concrete Visitors
      - Visitable Interface
      - Concrete Visitable
    - [Visitor Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Visitor_pattern.java)

### Structural Patterns

Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

1. **Adapter Pattern**
    - **Explanation**: Allows objects with incompatible interfaces to collaborate.
    - **Main Points**: 
    - **Components**:
    - [Adapter Pattern Code](link-to-adapter-pattern-code)
    
2. **Composite Pattern**
    - **Explanation**: Composes objects into tree structures to represent part-whole hierarchies. Allows individual objects and compositions to be treated uniformly.
    - **Main Points**: 
    - **Components**:
    - [Composite Pattern Code](link-to-composite-pattern-code)
    
3. **Decorator Pattern**
    - **Explanation**: Allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.
    - **Main Points**: 
    - **Components**:
    - [Decorator Pattern Code](link-to-decorator-pattern-code)
    
4. **Facade Pattern**
    - **Explanation**: Provides a simplified interface to a complex subsystem.
    - **Main Points**: 
    - **Components**:
    - [Facade Pattern Code](link-to-facade-pattern-code)
    
5. **Flyweight Pattern**
    - **Explanation**: Reduces the cost of creating and manipulating a large number of similar objects.
    - **Main Points**: 
    - **Components**:
    - [Flyweight Pattern Code](link-to-flyweight-pattern-code)
    
6. **Proxy Pattern**
    - **Explanation**: Provides a surrogate or placeholder for another object to control access to it.
    - **Main Points**: 
    - **Components**:
    - [Proxy Pattern Code](link-to-proxy-pattern-code)

## References

1. [GeeksforGeeks - Software Design Patterns](https://www.geeksforgeeks.org/software-design-patterns/)
2. [YouTube Playlist - Design Patterns](https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=-O4aAbHaeI5LxWLA)
