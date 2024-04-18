package test;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListTest {
    public static void main(String[] args) {
        testRemove();
    }

    public static void testShow() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.store("Belajar Java Dasar");
        todoListService.store("Belajar Java OOP");
        todoListService.store("Belajar Java Standard Classes");

        todoListService.show();
    }

    public static void testUpdate() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.store("Belajar Java Dasar");
        todoListService.store("Belajar Java OOP");
        todoListService.store("Belajar Java Standard Classes");

        todoListService.update(2, "Belajar Java OOP Lanjutan");

        todoListService.show();
    }

    public static void testRemove() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.store("Belajar Java Dasar");
        todoListService.store("Belajar Java OOP");
        todoListService.store("Belajar Java Standard Classes");

        todoListService.remove(2);

        todoListService.show();
    }
}
