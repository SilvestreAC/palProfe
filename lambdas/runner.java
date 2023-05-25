package lambdas;

public class runner {
    public static void main(String[] args) {

        Saludar(new MandarMensajePorConsola());
        Show();
    }

    private static void Show() {
        Saludar(new MandarMensajePorConsola());
        Saludar(new MandarMensajePorVentana());

        Saludar(new PuedeMandarMensaje() {
            @Override
            public void mandaMensaje(String mensaje) {
                System.out.println("implementacion anonima");
            }
        });

        Saludar(mensaje -> System.out.println("implementacion con lambdas") );
        Saludar(runner::mandaMensaje);
    }


    private static void Saludar(PuedeMandarMensaje puedeMandarMensaje) {
        puedeMandarMensaje.mandaMensaje("saludos desde metodo Saludar");

    }

    private static void mandaMensaje(String mensaje) {
        System.out.println("implementacion con high order functions");
    }
}
