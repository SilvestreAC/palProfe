package BaseDeDatos;

import java.util.Random;

public class SQLServer implements BaseDeDatos{
    @Override
    public boolean create(Cliente cliente) {
        System.out.println("se creo el cleite en SQL SERVER "+cliente);
        return true;
    }

    @Override
    public Cliente read(int id) {
        System.out.println("cliente leido de la base de datos SQLSERVER");

        Cliente cliente = new Cliente(id,"fulano de tal",10000);
        return cliente;
    }

    @Override
    public void delete(int id) {
        Cliente cliente = new Cliente(id,"fulano",1000);
        System.out.println("cliente borrado de la base de datos SQLSERVER"+cliente);

    }

    @Override
    public void update(Cliente cliente) {
        System.out.println("cliente actualizado en la base de datos SQL SERVER"+cliente);

    }
}
