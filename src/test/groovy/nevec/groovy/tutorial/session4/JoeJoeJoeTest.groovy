package nevec.groovy.tutorial.session4

import spock.lang.Specification

class JoeJoeJoeTest extends Specification {

    def "test do it"() {
        setup:
            Joe joe = Mock(Joe)
            JoeJoeJoe joe3 = new JoeJoeJoe(joe)

        when:
            joe3.execption()

        then:
            thrown(IOException)
    }
}
