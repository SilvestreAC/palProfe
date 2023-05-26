package BaseDeDatos;

public class runner {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new MySql();

        baseDeDatos.create(new Cliente(1,"kris",10000));
        baseDeDatos.create(new Cliente(2,"kris2",30000));
        baseDeDatos.create(new Cliente(3,"kris3",40000));
        baseDeDatos.create(new Cliente(4,"kris4",50000));
        baseDeDatos.create(new Cliente(5,"kris5",60000));
        baseDeDatos.create(new Cliente(6,"kris6",60000));

        System.out.println(baseDeDatos.read(1));
        System.out.println(baseDeDatos.read(2));
        System.out.println(baseDeDatos.read(3));
        System.out.println(baseDeDatos.read(4));


        Cliente elCliente = new Cliente(1,"kris",10000);
        baseDeDatos.update(elCliente);
        elCliente.setSaldo(2000);
        baseDeDatos.update(elCliente);
        elCliente.setId(5);
        baseDeDatos.update(elCliente);

        baseDeDatos.delete(1);
        baseDeDatos.delete(2);
        baseDeDatos.delete(3);
        baseDeDatos.delete(4);
        baseDeDatos.delete(5);


        baseDeDatos = new SQLServer();



    }
}
