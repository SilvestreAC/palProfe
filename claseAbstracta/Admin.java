package claseAbstracta;

public class Admin extends User {
    private String password;
    private int intento=0;


    public Admin(String nombre, String password) {
        super(nombre);
        this.password = password;
        System.out.println(nombre+ " admin created with id"+getId());
    }

    @Override
    public String toString() {
        return "Admin{ nombre:" + getNombre() + " id:"+getId()+"}";
    }

    @Override
    protected void conectarRed() {
        System.out.println("conectando DE ALTA VELOCIDAD a la red de adminstracion empresarial ....... ");
        System.out.println("LOGIN PARA COMPLEGAR LA CONEXION..... ");
    }

    @Override
    void cargarPrivilegios() {

        System.out.println("CARGANDO PRIVILEGIOS DE ADMISTRADOR PARA "+getNombre());
        System.out.println("privilgios cargados .... CREATE, READ, UPDATE, DELETE .....  ");

    }

    @Override
    public boolean login(int id, String password) {

        boolean  esLoginValido= ++intento<=3 && id==this.getId() && this.password.equals(password);
        if(intento>3)
            System.out.println("maximo de intentos realizado credenciales invalidas");
        else
        if (esLoginValido)
            System.out.println("CONEXION VPN:  bieenvenido :"+ getNombre().toUpperCase() +" al sistema como admin su ID="+getId());
        else System.out.println("id o pasword invalido intente de nuevo");

        return esLoginValido ;
    }

}
