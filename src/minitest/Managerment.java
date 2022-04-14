package minitest;

public interface Managerment<T> {
    void add(T t);
    void edit( int id, T t);

    int search(int id);
    void display();



}
