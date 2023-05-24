package lambdas;

public class MandarMensajePorConsola implements PuedeMandarMensaje {
    @Override
    public void mandaMensaje(String mensaje) {

        System.out.println("mensaje por consola"+mensaje);
    }
}
