package lambdas;

import javax.swing.*;

public class MandarMensajePorVentana implements PuedeMandarMensaje {
    @Override
    public void mandaMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null,mensaje,"titulo con mensaje por ventana"+mensaje,JOptionPane.PLAIN_MESSAGE);
    }
}
