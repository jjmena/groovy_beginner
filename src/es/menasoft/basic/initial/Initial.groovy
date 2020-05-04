import groovy.transform.ToString
import groovy.transform.TupleConstructor

// @TupleConstructor generate a constructor with all parameters.
@TupleConstructor
// Annotation to generate a toString function to show object fields.
@ToString
class Actor {
    def name
    def surname
    def films
    def awards
}

// An actor created
// Attribute films is a list of String. [] is used for lists
// Attribute awards is a map of award per year.[:] is the way to define maps.
def actor = new Actor("Harrison", "Ford", ["Star Wars", "Indiana Jones"], [2010: ["Oscar", "Cannes"], 2011: ["Golden Bear"]])

// We are able to call methods in groovy without parenthesis
println actor

// Strings could be expressed in two ways with "" and ''. With "" we can interpolate fields
println "Hello $actor.name $actor.surname. How are you?"
println 'This is a not interpolated String.'

//Everything in Groovy is an object. No basic types like Java.
println 1.plus(10)

// We shown before two important types in groovy: List and Maps.
// There is another one really interesting called Ranges.
println 1..10
assert 1..2 == [1, 2]

// One of the most important features of Groovy is Closure feature.
// Closure is based on functional programming paradigm of functions as first class object.
// We are able to pass them as parameter, define in a variable etc..
// In this first function we can receive an actor as parameter to process it.
def firstClosure = { a -> println "Printed actor inside a closure: $a.name $a.surname"}
firstClosure(actor)


// Groovy code 100% compatible with Java code.
// We can write directly Java code a it'll be interpreted well in Groovy
if ("My String".contains("String")) {
    System.out.println("I can use directly Java code inside groovy script.")
}
