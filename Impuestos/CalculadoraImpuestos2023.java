package Impuestos;

public class CalculadoraImpuestos2023 implements CalculadoraImpuestos {
    private double ingresoGravable;

    public CalculadoraImpuestos2023(double ingresoGravable) {
        this.ingresoGravable = ingresoGravable;
    }

    @Override
    public double calcularImpuesto(){
        return ingresoGravable * 0.16;
    }
}
