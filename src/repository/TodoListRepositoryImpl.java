package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    TodoList[] data = new TodoList[2];

    public boolean isFull(){
        boolean isFull = true;
        for (TodoList datum : data) {
            if (datum == null) {
                isFull = false;
                break;
            }
        }

        return isFull;
    }

    public void resize() {
        if(isFull()) {
            TodoList[] temp = data;
            data = new TodoList[data.length * 2];
            System.arraycopy(temp, 0, data, 0, temp.length);
        }
    }

    @Override
    public TodoList[] findAll() {
        return data;
    }

    @Override
    public void save(TodoList todoList) {
        resize();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean update(Integer index, TodoList todoList) {
        index -= 1;
        if(index >= data.length) {
            return false;
        }
        data[index] = todoList;
        return true;
    }

    @Override
    public boolean remove(Integer index) {
        index -= 1;
        if(index >= data.length) {
            return false;
        }

        for (int i = index; i < data.length; i++) {
            if(i == data.length - 1) {
                data[i] = null;
            }else {
                data[i] = data[i + 1];
            }
        }
        return false;
    }
}
