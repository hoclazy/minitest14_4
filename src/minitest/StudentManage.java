package minitest;

public class StudentManage implements Managerment<Student> {
    private Student[] array = new Student[20];
    private int size = 0;
    public StudentManage() {
    }

    @Override
    public void add(Student student) {
        array[size] = student;
        size++;
    }

    @Override
    public void edit(int id, Student student) {
        array[search(id)] = student;
    }

    @Override
    public int search(int id) {
        for (int i = 0; i < size; i++) {
            if(id == array[i].getId()) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------------");
    }
}
