package Abstracciones;

public class Coche {
    private boolean prendido;
    private boolean acelerar;
    private int aceleracionVelocidades;
    private boolean frenando;

    public Coche() {
        prendido=false;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public boolean isAcelerar() {
        return acelerar;
    }

    public void setAcelerar(boolean acelerar) {
        this.acelerar = acelerar;
    }

    public int getAceleracionVelocidades() {
        return aceleracionVelocidades;
    }

    public void setAceleracionVelocidades(int aceleracionVelocidades) {
        this.aceleracionVelocidades = aceleracionVelocidades;
    }

    public boolean isFrenando() {
        return frenando;
    }

    public void setFrenando(boolean frenando) {
        this.frenando = frenando;
    }
}
