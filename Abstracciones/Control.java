package Abstracciones;

public class Control {
    private boolean prender;
    private int volumen;
    private int canales;

    public static int min_volumen=0;
    public static int max_volumen=100;
    public static int min_canales=1;
    public static int max_canales=100;
    public Control() {

    }

    public boolean estaPrendido() {
        return prender;
    }

    public void setPrender(boolean prender) {
        this.prender = prender;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen>min_volumen && volumen<max_volumen){
            this.volumen = volumen;
        }


    }

    public int getCanales() {
        return canales;
    }

    public void setCanales(int canales) {
        if (canales>=min_canales && canales<=max_canales)
        this.canales = canales;
    }
}
