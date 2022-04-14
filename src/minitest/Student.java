package minitest;

public class Student extends People{
    private double score;

    public Student() {
    }

    public Student(int id, int age, String name, double score) {
        super(id, age, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{ id = " + getId() +
                " name: " + getName() +
                " age= " + getAge() +
                " score=" + score +
                '}';
    }
}
