package user.domain;

public abstract class Person {
    private String name;
    private int type;

    Person(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    };

    public int getType() {
        return type;
    }
}
