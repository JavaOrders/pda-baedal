package user.domain;

public abstract class Person {
    public enum PersonType {
        CUSTOMER, OWNER, RIDER
    }

    private String name;
    private PersonType type;

    Person(String name, PersonType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    ;

    public PersonType getType() {
        return type;
    }
}
