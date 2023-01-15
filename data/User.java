package data;

public abstract class User {
    private String fio;
    private int age;
    private int passport;

    public User(String fio){
        this.fio = fio;
    }

    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public Student getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }
}
