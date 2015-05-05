package nevec.groovy.tutorial.session2


public class C {
    def a = [B: 'B', C: 'C']

    def playGun() {
        println 'playGun'
    }

    def methodMissing(String name, args) {
        a[name[-1]]?:'fdfdsfds'
    }
}

def c = new C()
println c.playGun()
println c.playB()
println c.playC()


//String.metaClass.invokeMethod = { String name, args ->
//    println "before calling method ${name}"
//    def m = delegate.metaClass.getMetaMethod(name, *args)
//    def result = (m ? m.invoke(delegate, *args) : delegate.metaClass.invokeMissingMethod(delegate, name, args))
//    println "after calling method ${name}"
//    result
//}
//
//String.metaClass.methodMissing = { String name, args ->
//    println "methodMissing: " + name
//}


//c = new C()
//c.bla(5)
//c.bla(10)
//c.blub()

//println '123'.toString()
