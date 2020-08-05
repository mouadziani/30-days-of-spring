## Day 03 : Configure Spring IOC using annotations

**Task**: Discovering of IOC (Inversion of control) using Spring IOC with annotations configuration.

### Notes: 
There are 3 ways to configure spring  
- XML config  
- Annotations  
- Or just by simple using java codes  
 
To configure it with annotation you have to follow these steps :  
- You have to enable annotation config, by adding this tag`<context:component-scan base-package="io.spring.ioc_annotations"/>` in your applicationContext.xml file  
- Specify the package where the spring ioc scanner can found your beans, by affecting the absolute package name of your beans to the base-package parameter  
- Then, you need to apply `@Component` annotation on your java beans classes  
- The `@Component(id="id-of-bean")` accepts an optional parameter which is the id that you will use to get this bean from spring container, **notice** that if you don't affect any value to that id param, the id of that bean will be the name of your real class
