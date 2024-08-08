
# Lesson - 309.6 - Inversion of Control Dependency Injection in Spring

Slide 11 thru 17

The Tightly Coupled Object is an object that needs to know quite a bit about other object,  <br> 
and is usually highly dependent upon interfaces. Changing one object in a tightly coupled  <br>
application often requires changes to a number of other objects.   <br>

Loosely coupled objects seek to reduce the inter-dependencies between components of a system <br> 
with the goal of reducing the risk that changes in one component requiring changes in any other component.<br>
Loose coupling is a much more generic concept, which is intended to increase the flexibility of a system, <br>
make it more maintainable, and make the entire framework more stable.  <br>
When an object gets the object to be used from the outside, then it is a loose coupling situation, <br>
as the main object is merely using the object, which can be changed from the outside world, <br>
easily marking it as a loosely coupled object.
