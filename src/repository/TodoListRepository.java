package repository;

import entity.TodoList;

public interface TodoListRepository {

    TodoList[] findAll();

    void save(TodoList todoList);

    boolean update(Integer index, TodoList todoList);

    boolean remove(Integer index);
}
