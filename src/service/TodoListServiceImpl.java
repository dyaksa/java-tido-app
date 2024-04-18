package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void show() {
        TodoList[] todo = todoListRepository.findAll();

        System.out.println("TODOLIST : ");

        for(int i = 0; i < todo.length; i++) {
            if(todo[i] != null) {
                System.out.println((i + 1) + ". " + todo[i].getTodo());
            }
        }
    }

    @Override
    public void store(String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRepository.save(todoList);
    }

    @Override
    public void update(Integer number, String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRepository.update(number, todoList);
    }

    @Override
    public void remove(Integer number) {
        todoListRepository.remove(number);
    }
}
