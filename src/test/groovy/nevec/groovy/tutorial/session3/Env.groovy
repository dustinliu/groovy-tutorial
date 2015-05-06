import cucumber.api.groovy.Hooks
import groovyx.net.http.RESTClient

this.metaClass.mixin(Hooks)

class Util {

    def getTutorialClient() {
        new RESTClient('http://signmine.corp.sg3.yahoo.com:4080')
    }
}

class Config {
    def aaa = "dddddddddddd"
}


World {
    def world = new Util()
    world.metaClass.mixin(Config)
    world
}
