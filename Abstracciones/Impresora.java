package Abstracciones;

public class Impresora {
    private boolean prendido;
    private boolean imprimiendo;

    public Impresora() {
        prendido=false;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public boolean isImprimiendo() {
        return imprimiendo;
    }

    public void setImprimiendo(boolean imprimiendo) {
        this.imprimiendo = imprimiendo;
    }
}
