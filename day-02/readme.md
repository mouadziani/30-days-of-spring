## Day 02 : DI and Spring IOC

**Task**: Discovering of DI (Dependency injection) using Spring IOC with XML configuration.

### Introduction to DI:
First of all, what is dependency injection is ? Let's imagine how the car factory works, as we know that the car is a skeleton that combines a set of parts like (car chairs, engine etc...), So to make it constructed, the car factory needs these parts as requirements, So they start by making these parts, and then they will inject them in the car skeleton  
**inject** word means : **use** that requirements inside the car skeleton  
So basically **DI**: Outsource the construction and **injection** of your objects to an external entity  

### DI in OOP:
Dependency injection in object-oriented programming is: A design pattern that allow us to inject an external object(s) inside another object, (if the construction of this object requires this requirement)  

### DI in Spring
The spring framework offers 2 ways to inject dependencies into the java bean class  
- Setter Injection  
- Constructor injector  

**How it works:**  
- They start by reading the application context file (only if you used XML configuration, or they will read it, using the way you configured it)
- Based on the information they found in this file, the spring container will start with the construction of each bean founded **(by using java reflexion)**  
- And then if the bean needs a dependency, it will search for them in the container and inject them as you configured it
