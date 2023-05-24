package claseAbstracta;

import java.util.Random;

public abstract class ClaseAbstracta {
    public abstract String metodoAbstracto(String mensaje);

    private int algunValor;

    public ClaseAbstracta() {
        Random random =new Random();
        algunValor=random.nextInt();
        System.out.println("constructor de clase abstrascta + valor propiedad algunValor="+algunValor);
    }

    public int getAlgunValor() {
        return algunValor;
    }

    public void setAlgunValor(int algunValor) {
        this.algunValor = algunValor;
    }
}
