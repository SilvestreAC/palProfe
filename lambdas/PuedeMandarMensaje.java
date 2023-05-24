package lambdas;

public interface PuedeMandarMensaje {
    public void mandaMensaje(String mensaje);
    public default void imprimirDosVeces(String mensaje){
        System.out.println(mensaje);
        System.out.println(mensaje);
    }
}
