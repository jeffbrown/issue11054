package issue11054

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    void "test binding command properties"() {
        when:
        params.name = 'Jeff'
        params.'homeAddress.city' = 'St. Louis'
        params.'homeAddress.state' = 'Missouri'

        controller.createPerson()

        then:
        response.text == 'City: St. Louis'
    }
}
