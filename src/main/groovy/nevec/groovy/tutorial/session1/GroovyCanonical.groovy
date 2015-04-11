package nevec.groovy.tutorial.session1

import groovy.transform.Canonical

@Canonical
class Person {
    String firstName
    String lastName
    int age
}

def joe = new Person(firstName: 'JoeJoeJoeJoeJoe', lastName: '?????', age: 28)
println joe


//delegate
