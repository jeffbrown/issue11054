package issue11054

class DemoController {

    def createPerson(PersonCommand command) {
        Person p = new Person()
        bindData p, command

        render "City: ${p.homeAddress?.city}"
    }
}

class PersonCommand {
    String name
    Address homeAddress
}
