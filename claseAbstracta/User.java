package claseAbstracta;

public abstract class User {
    static int idContador=0;

    private int id;
    private String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public User(String nombre) {
        idContador++;
        this.id = idContador;
        System.out.println("user created with unique id="+idContador);
        this.nombre=nombre;
        cargarPrivilegios();
        conectarRed();
    }

    protected abstract void conectarRed();

    abstract void cargarPrivilegios() ;

    public int getId() {
        return id;
    }

    public abstract boolean login(int id, String password);
}
