# Design Patterns in Java

## Introduction

Design patterns are typical solutions to common problems in software design provided by object-oriented programming expert developers. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code. They are categorized into three groups:

1. **Creational Patterns**: Deal with object creation mechanisms. They help in making systems independent of how their objects are created or represented.
2. **Behavioral Patterns**: Deal with object interaction and responsibility. They define the patterns of communication between objects and act as control flow systems.
3. **Structural Patterns**: Deal with object composition or structure and are concerned with how objects and classes are composed to form larger structures.

By using design patterns, you can make your code more flexible, reusable, and easier to understand.

## Outline

### Creational Patterns
1. [Singleton Pattern](#singleton-pattern)
2. [Factory Method Pattern](#factory-method-pattern)
3. [Abstract Factory Pattern](#abstract-factory-pattern)
4. [Builder Pattern](#builder-pattern)
5. [Prototype Pattern](#prototype-pattern)

### Behavioral Patterns
1. [Chain of Responsibility Pattern](#chain-of-responsibility-pattern)
2. [Command Pattern](#command-pattern)
3. [Interpreter Pattern](#interpreter-pattern)
4. [Iterator Pattern](#iterator-pattern)
5. [Mediator Pattern](#mediator-pattern)
6. [Memento Pattern](#memento-pattern)
7. [Observer Pattern](#observer-pattern)
8. [State Pattern](#state-pattern)
9. [Strategy Pattern](#strategy-pattern)
10. [Template Method Pattern](#template-method-pattern)
11. [Visitor Pattern](#visitor-pattern)

### Structural Patterns
1. [Adapter Pattern](#adapter-pattern)
2. [Bridge Pattern](#bridge-pattern)
3. [Composite Pattern](#composite-pattern)
4. [Decorator Pattern](#decorator-pattern)
5. [Facade Pattern](#facade-pattern)
6. [Flyweight Pattern](#flyweight-pattern)
7. [Proxy Pattern](#proxy-pattern)

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
- [Singleton Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Singleton.java)
- [Singleton Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/Singleton/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/singleton.png" width="400"/>

#### Factory Method Pattern
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
- [Factory Method Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Factory_method.java)
- [Factory Method Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/FactoryMethod/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
<img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/factory.png" width="400"/>

#### Abstract Factory Pattern
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
- [Abstract Factory Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Abstract_Factory.java)
- [Abstract Factory Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/AbstractFactory/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/abstractfactory.png" width="400"/>

#### Builder Pattern
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
- [Builder Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Builder.java)
- [Builder Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/Builder/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/builder.png" width="400"/>

#### Prototype Pattern
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
- [Prototype Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns/src/Prototype.java)
- [Prototype Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Creational%20Design%20Patterns(C%23)/ProtoType/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/creational/prototype.png" width="400"/>

### Behavioral Patterns

#### Chain of Responsibility Pattern
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
- [Chain of Responsibility Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Chain_responsibility.java)
- [Chain of Responsibility Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/ChainResponsibilityPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/chainofresponsibility.png" width="400"/>

#### Command Pattern
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
- [Command Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Command_pattern.java)
- [Command Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/CommandPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/command.png" width="400"/>

#### Interpreter Pattern
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
- [Interpreter Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Interpreter_pattern.java)
- [Interpreter Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/InterpreterP/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/interpreter.png" width="400"/>

#### Iterator Pattern
- **Explanation**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- **Main Points**:
   - Makes it possible to traverse elements of a collection without exposing its implementation.
   - Encapsulates iteration logic, allowing you to change the way iteration is performed.
   - Ensures clients do not depend on collection's implementation.
   - Often uses multiple iterators.
- **Components**:
   - Iterator Interface
   - Concrete Iterator
   - Aggregate Interface
   - Concrete Aggregate
- [Iterator Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Iterator_pattern.java)
- [Iterator Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/IteratorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/iterator.png" width="400"/>

#### Mediator Pattern
- **Explanation**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.
- **Main Points**:
   - Mediates communication between classes that otherwise would be tightly coupled.
   - Makes it easier to modify, extend, and debug.
   - Useful in GUI applications and complex, interdependent systems.
- **Components**:
   - Mediator Interface
   - Concrete Mediator
   - Colleague Interface
   - Concrete Colleague
- [Mediator Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Mediator_pattern.java)
- [Mediator Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/MediatorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/mediator.png" width="400"/>

#### Memento Pattern
- **Explanation**: Without violating encapsulation, captures and externalizes an object’s internal state, so that the object can be restored to this state later.
- **Main Points**:
   - Provides a way to restore an object to its previous state.
   - Used in conjunction with command pattern.
   - Originator holds current state, caretaker keeps saved states, and memento holds state.
- **Components**:
   - Originator
   - Memento
   - Caretaker
- [Memento Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Memento_pattern.java)
- [Memento Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/MementoPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/memento.png" width="400"/>

#### Observer Pattern
- **Explanation**: Defines a one-to-many dependency between objects, where a state change in one object results in all its dependents being notified and updated automatically.
- **Main Points**:
   - Establishes a mechanism to allow multiple objects to receive updates when another object changes state.
   - Common in event handling and MVC (Model-View-Controller) architectures.
- **Components**:
   - Subject Interface
   - Concrete Subject
   - Observer Interface
   - Concrete Observer
- [Observer Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Observer_pattern.java)
- [Observer Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/ObserverPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/observer.png" width="400"/>

#### State Pattern
- **Explanation**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
- **Main Points**:
   - Facilitates state-specific behavior.
   - Makes state transitions explicit and easier to manage.
   - Involves context and state objects.
- **Components**:
   - Context
   - State Interface
   - Concrete State
- [State Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/State_pattern.java)
- [State Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/StatePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/state.png" width="400"/>

#### Strategy Pattern
- **Explanation**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Lets the algorithm vary independently from clients that use it.
- **Main Points**:
   - Extracts algorithms into separate classes.
   - Useful for algorithm families with interchangeable and extensible behavior.
   - Composes algorithms within context objects.
- **Components**:
   - Context
   - Strategy Interface
   - Concrete Strategy
- [Strategy Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Strategy_pattern.java)
- [Strategy Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/StrategyPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/strategy.png" width="400"/>

#### State vs Strategy Patterns

| State Pattern                                                             | Strategy Pattern                                                       |
|---------------------------------------------------------------------------|------------------------------------------------------------------------|
| States can be dependant as you can easily jump from one state to another. | Strategies are completely independent and unaware of each other.       |
| About doing different things based on the state, hence result may vary.   | About having different implementations that accomplish the same thing. |



#### Template Method Pattern
- **Explanation**: Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
- **Main Points**:
   - Outlines algorithm steps in a base class.
   - Allows subclasses to implement or override specific steps.
   - Promotes code reuse and consistency.
- **Components**:
   - Abstract Class
   - Concrete Class
   - Template Method
- [Template Method Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Template_method.java)
- [Template Method Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/BDP(C%23)/TemplatePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/template_method.png" width="400"/>

#### Visitor Pattern
- **Explanation**: Lets you define a new operation without changing the classes of the elements on which it operates.
- **Main Points**:
   - Allows adding operations to classes without modifying them.
   - Uses double-dispatch technique for type safety.
   - Facilitates operations across object structure.
- **Components**:
   - Visitor Interface
   - Concrete Visitor
   - Element Interface
   - Concrete Element
   - Client
- [Visitor Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Behavioral%20Design%20Patterns/src/Visitor_pattern.java)
- [Visitor Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/tree/main/BDP(C%23)/VisitorPattern)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/behavioral/visitor.png" width="400"/>

### Structural Patterns

#### Adapter Pattern
- **Explanation**: Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
- **Main Points**:
   - Translates interface for compatibility.
   - Promotes reuse of existing code.
   - Useful for legacy integration.
- **Components**:
   - Target Interface
   - Adapter Class
   - Adaptee Class
   - Client
- [Adapter Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Adapter.java)
- [Adapter Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/AdapterPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/adapter.png" width="400"/>

#### Bridge Pattern
- **Explanation**: Decouples an abstraction from its implementation so that the two can vary independently.
- **Main Points**:
   - Separates interface from implementation.
   - Enables extensibility and flexibility.
   - Useful for large-scale systems.
- **Components**:
   - Abstraction Interface
   - Implementor Interface
   - Concrete Implementor
   - Refined Abstraction
- [Bridge Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Bridge.java)
- [Bridge Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/BridgePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/bridge.png" width="400"/>

#### Composite Pattern
- **Explanation**: Composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
- **Main Points**:
   - Models tree structures.
   - Treats individual objects and compositions uniformly.
   - Simplifies client code for complex hierarchies.
- **Components**:
   - Component Interface
   - Composite Class
   - Leaf Class
- [Composite Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Composite.java)
- [Composite Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/CompositePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/composite.png" width="400"/>

#### Decorator Pattern
- **Explanation**: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- **Main Points**:
   - Extends functionality dynamically.
   - Promotes composition over inheritance.
   - Useful for adding features to objects.
- **Components**:
   - Component Interface
   - Concrete Component
   - Decorator Class
   - Concrete Decorator
- [Decorator Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Decorator.java)
- [Decorator Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/DecoratorPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/decorator.png" width="400"/>

#### Facade Pattern
- **Explanation**: Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
- **Main Points**:
   - Simplifies interactions with complex systems.
   - Promotes loose coupling.
   - Ideal for subsystems with many dependencies.
- **Components**:
   - Facade Class
   - Subsystem Classes
- [Facade Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Facade.java)
- [Facade Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/FacadePattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/facade.png" width="400"/>

#### Flyweight Pattern
- **Explanation**: Reduces the cost of creating and manipulating a large number of similar objects by sharing common parts of the state among multiple objects.
- **Main Points**:
   - Minimizes memory usage.
   - Shares intrinsic state, handles extrinsic state externally.
   - Suitable for large-scale object creation.
- **Components**:
   - Flyweight Interface
   - Concrete Flyweight
   - Flyweight Factory
   - Client
- [Flyweight Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Flyweight.java)
- [Flyweight Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/FlyWeightPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
  <img src="https://github.com/zeyadsalah22/Design-Patterns/blob/main/images/structural/flyweight.png" width="400"/>

#### Proxy Pattern
- **Explanation**: Provides a surrogate or placeholder for another object to control access to it.
- **Main Points**:
   - Controls access to an object.
   - Can provide additional functionality like caching or logging.
   - Useful for lazy initialization, access control, and distributed systems.
- **Components**:
   - Subject Interface
   - Real Subject
   - Proxy Class
- [Proxy Pattern Code(JAVA)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns/src/Proxy.java)
- [Proxy Pattern Code(C#)](https://github.com/zeyadsalah22/Design-Patterns/blob/main/Structural%20Design%20Patterns(C%23)/ProxyPattern/Program.cs)
- Class Diagram(C# implementation might have slight modifications)
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
