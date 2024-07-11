package user;

public abstract class Person {
    private String name;
    private String id;
    private String password;
    private int type;

    abstract public boolean login(String id, String password);
}
