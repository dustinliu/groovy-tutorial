package nevec.groovy.tutorial.session1

import groovy.transform.Canonical

@Canonical
class Person {
    String firstName
    String lastName
    int age
}

def joe = new Person(firstName: 'JoeJoeJoe', lastName: '?????', age: 28)
println joe

def joejoejoe = new Person(firstName: 'JoeJoeJoe', lastName: '?????', age: 28)
println "joe is joejoejoe ? ${joe == joejoejoe}"
println "hashcode of joe : ${joe.hashCode()}"
println "hashcode of joejoejoe : ${joejoejoe.hashCode()}"


//delegate
