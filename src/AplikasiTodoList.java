public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args){

    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no+ ". " + todo);
            }
        }
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(){

    }

    /**
     * Untuk menghapus todo dari list
     */
    public static void removeTodoList(){

    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){

    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){

    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){

    }
}
