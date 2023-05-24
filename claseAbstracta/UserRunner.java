package claseAbstracta;

public class UserRunner {
    public static void main(String[] args) {
        User[] guest = {new Guest("usuario1"),new Guest("usuario1"),new Guest("usuario1")};
        User admin = new  Admin("krsna","123");

        System.out.println(admin);
        admin.login(1,"123");
        admin.login(2,"12");
        admin.login(2,"12");
        admin.login(4,"123");
        admin.login(4,"123");
        admin.login(4,"123");



    }
}
