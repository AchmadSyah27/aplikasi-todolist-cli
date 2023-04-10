public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        testInput();
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
    public static boolean removeTodoList(Integer number){
        if ((number - 1) >= model.length){
            return false;
        } else if (model[number - 1] == null) {
            return false;
        }else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testremoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+name);

        var channel = input("Channel");
        System.out.println(channel);
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
