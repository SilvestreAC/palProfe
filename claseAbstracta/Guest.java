package claseAbstracta;

public class Guest extends User {


    public Guest(String nombre) {
        super(nombre);
    }

    @Override
    protected void conectarRed() {
        System.out.println("conexion gratuita de baja velocidad ...... ");
        login(getId(),getNombre());
    }

    @Override
    void cargarPrivilegios() {
        System.out.println("cargando privilegios de Guest SOLO LECTURA........");
    }

    @Override
    public boolean login(int id, String password) {
        System.out.println("bienvenido "+getNombre()+" al sistema gratuito - guest ID= "+id);
        return true;
    }

    @Override
    public String toString() {
        return "Guest{}"+getId();
    }
}
