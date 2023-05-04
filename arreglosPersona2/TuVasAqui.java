package arreglosPersona2;

public class TuVasAqui implements Calculadora {
    private double[] sueldo=new double[5];
    private String[] nombres=new String[5];
    private boolean[] esFronterizo=new boolean[5];
    private double[] impuestos=new double[5];
    static int celda1;
    static double impuesto;

    public TuVasAqui() {
    }
    public double getTotalaPagarImpuesto(){

        if (esFronterizo[celda1]==true){
            impuesto=.08;
        }else impuesto=.16;
        return impuesto;
    }
    public void dameImpuestos(double impu){
        impuestos[celda1]=impu;
    }

    public void eligeQueCelda(int celda){
        celda1=celda;
//        sueldo[celda]=getSueldo()[celda];
//        nombres[celda]=getNombre()[celda];
//        esFronterizo[celda]=getEsFronterizo()[celda];
    }

    public void dameNombre(String nom){
        nombres[celda1]=nom;
    }
    public void dameSueldo(double sueld){
        sueldo[celda1]=sueld;
    }
    public void dameEsFronterizo(boolean esFron){
        esFronterizo[celda1]=esFron;
    }

    public double[] getSueldo() {
        return sueldo;
    }

    public String[] getNombre() {
        return nombres;
    }

    public boolean[] getEsFronterizo() {
        return esFronterizo;
    }

    public double[] getImpuestos() {
        return impuestos;
    }
}
