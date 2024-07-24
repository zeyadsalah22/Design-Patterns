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
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/singleton.png" width="400"/>

2. **Factory Method Pattern**
   - **Explanation**: Defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created.
   - **Main Points**:
      - Use it if you have no idea the exact types of the object your code will work with.
      - Makes it easy to extend the product construction code independently from the rest of the application.
      - Allow introducing new products without breaking existing code.
      - Centralizes the product creation code in one place in program.
   - **Components**:
      - Creator
      - Concrete Creator
      - Product
      - Concrete Product
   - [Factory Method Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Factory_method.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/factory.png" width="400"/>

3. **Abstract Factory Pattern**
   - **Explanation**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
   - **Main Points**:
      - Use it when your code needs to work with various families of related products.
      - Many designs start with the factory pattern and then evolve to the Abstract factory pattern.
      - Follows the open_closed and single responsibility principles.
      - Centralizes the product creation code in one place in the program.
   - **Components**:
      - Abstract Factory
      - Concrete Factories
      - Abstract Products
      - Concrete Products
      - Client
   - [Abstract Factory Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Abstract_Factory.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/abstractfactory.png" width="400"/>

4. **Builder Pattern**
   - **Explanation**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
   - **Main Points**:
      - Create builder class containing same fields of the object you need to be created.
      - Add several setters for these fields and a 'build' method responsible for creating the object.
      - Think about creating a director if the same creation code is used to create several objects.
   - **Components**:
      - Product
      - Builder
      - Concrete Builder
      - Director
      - Client
   - [Builder Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Builder.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/builder.png" width="400"/>

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
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/prototype.png" width="400"/>

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
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/chainofresponsibility.png" width="400"/>

2. **Command Pattern**
   - **Explanation**: Encapsulates a request as an object, thereby allowing users to parameterize clients with queues, requests, and operations.
   - **Main Points**:
      - Turns a request or behavior to a stand-alone object that contains everything about the request.
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
   - [Command Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Command_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/command.png" width="400"/>

3. **Interpreter Pattern**
   - **Explanation**: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
   - **Main Points**:
      - Defines a way to interpret and evaluate language grammar or expressions.
      - Provides mechanism for evaluating sentences by representing grammar as set of classes.
      - Involves defining hierarchies of expression classes, both terminal and non-terminal; tree structures are similar to composite pattern.
   - **Components**:
      - Abstract Expression
      - Terminal Expression
      - Non-terminal Expression
      - Context
      - Client
      - Interpreter
   - [Interpreter Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Interpreter_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/interpreter.png" width="400"/>

4. **Iterator Pattern**
   - **Explanation**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
   - **Main Points**:
      - Reduces traversal code duplication.
      - Applies single responsibility and open-closed principles; each iteration algorithm is extracted into a separate class and new iterators can be added without modifying existing ones.
      - Encapsulates the details of complex data structures by exposing simple methods to access the collection elements.
   - **Components**:
      - Iterator Interface
      - Concrete Iterator
      - Iterable Collection Interface
      - Concrete Collection
   - [Iterator Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Iterator_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/iterator.png" width="400"/>

5. **Observer Pattern**
   - **Explanation**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - **Main Points**:
      - Improves encapsulation and loosely couples the observer and subject.
      - Notifies multiple objects about changes in state or events.
      - Handles dynamic changes and notifications at runtime.
   - **Components**:
      - Observer Interface
      - Concrete Observer
      - Subject Interface
      - Concrete Subject
   - [Observer Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Observer_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/observer.png" width="400"/>

### Structural Patterns

Structural patterns deal with object composition or structure and are concerned with how objects and classes are composed to form larger structures.

1. **Adapter Pattern**
   - **Explanation**: Allows objects with incompatible interfaces to work together. It acts as a bridge between the interface of a class and the interface expected by the client.
   - **Main Points**:
      - Improves compatibility and flexibility between objects with incompatible interfaces.
      - Can convert interface methods from one form to another.
      - Use it when you want to use an existing class but its interface does not match the one you need.
   - **Components**:
      - Target
      - Adaptee
      - Adapter
   - [Adapter Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Adapter_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/adapter.png" width="400"/>

2. **Bridge Pattern**
   - **Explanation**: Separates an abstraction from its implementation so that the two can vary independently.
   - **Main Points**:
      - Allows you to change implementation details without affecting the abstraction.
      - Helps you develop a clean and clear abstraction and implementation hierarchy.
      - Improves code maintainability by focusing on abstraction and implementation.
   - **Components**:
      - Abstraction
      - Refined Abstraction
      - Implementor
      - Concrete Implementor
   - [Bridge Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Bridge_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/bridge.png" width="400"/>

3. **Composite Pattern**
   - **Explanation**: Composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.
   - **Main Points**:
      - Simplifies clients' use of tree structures and composites.
      - Treats individual objects and composites of objects uniformly.
      - Encourages a uniform interface across all objects.
   - **Components**:
      - Component
      - Leaf
      - Composite
      - Client
   - [Composite Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Composite_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/composite.png" width="400"/>

4. **Decorator Pattern**
   - **Explanation**: Attaches additional responsibilities to an object dynamically. Provides a flexible alternative to subclassing for extending functionality.
   - **Main Points**:
      - Allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects.
      - Provides an alternative to subclassing to extend functionality.
   - **Components**:
      - Component
      - Concrete Component
      - Decorator
      - Concrete Decorator
   - [Decorator Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Decorator_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/decorator.png" width="400"/>

5. **Facade Pattern**
   - **Explanation**: Provides a unified interface to a set of interfaces in a subsystem, making it easier to use a complex subsystem.
   - **Main Points**:
      - Reduces complexity and dependencies by providing a simple interface.
      - Helps to encapsulate the complexities of a subsystem.
   - **Components**:
      - Facade
      - Subsystem Classes
   - [Facade Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Facade_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/facade.png" width="400"/>

6. **Flyweight Pattern**
   - **Explanation**: Uses sharing to support large numbers of fine-grained objects efficiently. Provides a way to reduce the number of objects created and to decrease memory usage and increase performance.
   - **Main Points**:
      - Use it when you need to create a large number of objects, and they have a similar state.
      - Reduces the number of objects and saves memory.
      - Decreases overhead of managing objects.
   - **Components**:
      - Flyweight Interface
      - Concrete Flyweight
      - Flyweight Factory
   - [Flyweight Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Flyweight_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/flyweight.png" width="400"/>

7. **Proxy Pattern**
   - **Explanation**: Provides a surrogate or placeholder for another object to control access to it. The proxy can act as an intermediary, which can manage access, control operations, or perform lazy initialization.
   - **Main Points**:
      - Use it to control access to another object.
      - Can add additional functionality to the object without changing it.
      - Useful for lazy initialization, access control, and logging.
   - **Components**:
      - Subject
      - RealSubject
      - Proxy
   - [Proxy Pattern Code](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Proxy_pattern.java)
   - Class Diagram
     <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/proxy.png" width="400"/>
