package nevec.groovy.tutorial.session1

@Singleton(strict=false)
class SingletonClass {
    private SingletonClass() { println 'singleton instantiated' }

    def hello() {
        println 'hello'
    }
}

SingletonClass.instance.hello()
SingletonClass.instance.hello()


//Gotchas

