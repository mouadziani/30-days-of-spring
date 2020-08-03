## Day 03 : DI and Spring IOC

**Task**: Covering Dependency injection using spring IOC and XML configuration

### Introduction to DI:
First of all, what is dependency injection is ? Let's imagine how the car factory works, as we know that the car is a skeleton that combines a set of parts like (car chairs, engine etc...), So to make it constructed, the car factory needs these parts as requirements, So they start by making these parts, and then they will inject them in the car skeleton  
**inject** word means : **use** that requirements inside the car skeleton  
So basically **DI**: Outsource the construction and **injection** of your objects to an external entity  

### DI in OOP and in Spring :
Dependency injection in object-oriented programming is: A design pattern that allows us to inject an external object(s) inside another object, (if the construction of this object requires this requirement)  
The spring framework offers 2 ways to inject dependencies into the java bean class  
- Setter Injection  
- Constructor injector  
