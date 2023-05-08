package Impuestos;

public class Persona {

    private double impuesto;
    private double sueldo ;
    private String nombres ;
    private boolean esFronterizo;
    private CalculadoraImpuestos calculadoraImpuestos;

    public Persona(double sueldo, String nombres, boolean esFronterizo) {
        this.sueldo = sueldo;
        this.nombres = nombres;
        this.esFronterizo = esFronterizo;
        if(esFronterizo)calculadoraImpuestos=new CalculadoraFrontera(this.sueldo);
        else calculadoraImpuestos= new CalculadoraImpuestos2023(this.sueldo);
        this.impuesto=calculadoraImpuestos.calcularImpuesto();
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public boolean isEsFronterizo() {
        return esFronterizo;
    }

    public void setEsFronterizo(boolean esFronterizo) {
        this.esFronterizo = esFronterizo;
        if(esFronterizo)calculadoraImpuestos=new CalculadoraFrontera(this.sueldo);
        else calculadoraImpuestos= new CalculadoraImpuestos2023(this.sueldo);
        this.impuesto=calculadoraImpuestos.calcularImpuesto();
    }

    public double getImpuesto() {
        return impuesto;
    }
}
