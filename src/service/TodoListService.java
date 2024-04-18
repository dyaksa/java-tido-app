package service;

public interface TodoListService {
    void show();

    void store(String todo);

    void update(Integer number, String todo);

    void remove(Integer number);
}
