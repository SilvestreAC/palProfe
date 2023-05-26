package BaseDeDatos;

public class MySql implements BaseDeDatos {
    @Override
    public boolean create(Cliente cliente) {
        System.out.println("MYSQL -> cliente creado con exito"+cliente);
        return true;
    }


    @Override
    public Cliente read(int id) {
        System.out.println("MYSQL -> cliente leido de la base de datos CON EXITO ");

        Cliente cliente = new Cliente(id,"fulano de tal",10000);
        return cliente;
    }

    @Override
    public void delete(int id) {
        Cliente cliente = new Cliente(id,"fulano",1000);
        System.out.println(" MYSQL ->  cliente borrado de la base de datos"+cliente);

    }

    @Override
    public void update(Cliente cliente) {
        System.out.println("MYSQL -> cliente actualizado en la base de datos"+cliente);

    }
}
