package minitest;

public class Main {
    public static void main(String[] args) {
        StudentManage manage = new StudentManage();
        Student student1 = new Student(1, 18, "Nam", 9);
        Student student2 = new Student(2, 19, "bac", 7);
        Student student3 = new Student(3, 20, "tay", 7);
        Student student4 = new Student(4, 22, "dong", 6);
        Student student5 = new Student(5, 21, "dat", 10);
        manage.add(student1);
        manage.add(student2);
        manage.add(student3);
        manage.add(student4);
        manage.add(student5);
        manage.display();

        System.out.println("Student's position is: " +manage.search(3));

        Student student6 = new Student(6, 22, "son", 8);
        manage.edit(2,student6);
        manage.display();


    }
}
