public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args){
        testaddTodoList();
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

    public static void testShowTodoList(){
        model[0]= "Belajar Java Dasar";
        model[1]= "Studi Kasus Java Dasar: Aplikasi Todo List";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        //cek kapasitas array, apakah penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
                //kapasitas 'model' masih ada yang kosong (masih tersedia)
                isFull = false;
                break;
            }
        }

        //jika penuh, maka akan di resize 2x lipat
        if (isFull){
            var temp = model;
            model = new String[model.length*2];
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

    //tambahkan ke posisi yang data arraynya NULL
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testaddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo Ke: " + i);
        }
        showTodoList();
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
