package data;

public class Teacher extends User {
    private String kafedra;

    public Teacher(String fio, int age, int passport, String kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }

    public String getKafedra() {
        return kafedra;
    }
//    public void setRank(String rank) {
//        this.kafedra = kafedra;
//    }
}
