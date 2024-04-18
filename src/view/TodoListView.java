package view;

import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {

    private final TodoListService todoListService;

    public TodoListView(TodoListService todoListService){
        this.todoListService = todoListService;
    }

    public void menu() {
        while(true) {
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Ubah");
            System.out.println("4. Tampilkan");
            System.out.println("x. Keluar");

            var input = utils.InputUtil.input("Pilih Menu");
            if(input.equals("1")) {
                add();
            }else if(input.equals("2")) {
                remove();
            } else if(input.equals("3")) {
                update();
            } else if(input.equals("4")) {
                show();
            } else if(input.equals("x")) {
                break;
            } else {
                System.out.println("Invalid Menu");
            }
        }
    }

    public void show(){
        todoListService.show();
    }

    public void add(){
        var todo = utils.InputUtil.input("Todo (x Jika Batal)");
        todoListService.store(todo);
    }

    public void update(){
        var index = utils.InputUtil.input("Nomor yang Diubah (x Jika Batal)");
        var todo = utils.InputUtil.input("Todo Baru (x Jika Batal)");
        todoListService.update(Integer.valueOf(index), todo);
    }

    public void remove(){
        var index = utils.InputUtil.input("Nomor yang Dihapus (x Jika Batal)");
        todoListService.remove(Integer.valueOf(index));
    }
}
