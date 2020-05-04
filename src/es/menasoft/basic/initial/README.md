# Initial Example

This is the initial example.
 
In this example we show show some of the features offered by Groovy language.

Some of the features explained in this example:


* Class definition. Groovy is an object oriented language and it offers class defintion structures.
```groovy
class Actor {
    def name
    def surname
    def films
    def awards
}
```
* Annotations: Some features could be added to groovy script via annottions. In the example we are using:
    * `@TupleConstructor`: Annotation to generate a default constructor with all attributes defined in the class
    * `@ToStrin`: Annotation to override toString method built to show information of all fields that belong to the object.
* String definition. There is to ways to define String
    * With `""`: This kind of strings could be interpolated with parameters: `"Hello $name"`
    * With `''`: Simple static string: `'Hello World'`
* Complex datatypes: We are showing three different kind of Groovy non-basic dataypes:
* Lists: Are defined with operator `[]`.
```groovy
def list = [1,2,3]
```
* Maps: Are defined with operator `[:]`. 
```groovy
def map = [name:'John', value:'Smith']
```
* Ranges: Are defined with operator `..`.  
```groovy
println 1..10
```
* Closures: One of the main features of Groovy. It manages functioprintln 1..10println 1..10ns as first class elements. Here an example with a closure definition in a variable:
```groovy
def firstClosure = { a -> println "Printed actor inside a closure: $a.name $a.surname"}
firstClosure(actor)
```
* Java compatibility: Another Groovy feature is related with Java compatibility. It allows us to write Java code which is compatible with Groovy.
```groovy
if ("My String".contains("String")) {
    System.out.println("I can use directly Java code inside groovy script.")
}
```   
 