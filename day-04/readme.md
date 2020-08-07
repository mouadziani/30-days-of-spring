## Day 04 : Configuration of Spring DI using annotations

**Task**: Discovering how to use java annotations to inject dependencies of a given bean automatically.  

### Notes: 
As I mentioned in my previous [Day-02-repository](https://github.com/MouadZIANI/30DaysOfSpring/tree/master/day-02), the Spring Framework can use 3 ways to inject dependencies into a given bean, 
either by (Constructor, Setter or Field).  

And I also mentioned that the Spring needs some configurations (to allow auto-injection for some beans that need dependencies) with different ways **(Xml, Annotations, Java codes)**.  

**I've explained how to use xml config**, So now let's discover how to configure it with annotations :

**Annotation method: (in my opinion, I've seen that this is the easiest way to configure it)**  

- You must firstly add the `applicationContext.xml` file and enable the auto bean scanner on it (you can follow the instructions mentioned in this repo [Day-03-repository](https://github.com/MouadZIANI/30DaysOfSpring/tree/master/day-03)).
- You should also create your beans and apply the annotation `@Component` to them.
- Then apply the annotation `@Autowired` on your (constructor, setter or field) that you used to inject your dependencies  
- Then you can use your beans as you want !
