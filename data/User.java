package data;

public abstract class User {
    private String fio;
    private int age;
    private int passport;

    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }
}
