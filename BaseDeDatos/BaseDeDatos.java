package BaseDeDatos;

public interface BaseDeDatos {
    public boolean create(Cliente cliente);
    public Cliente read(int id);
    public void update(Cliente cliente);
    public void delete(int id);
}
