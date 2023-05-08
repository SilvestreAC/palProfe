package Impuestos;

public class CalculadoraFrontera implements CalculadoraImpuestos{

    private double ingresoGravable;

    public CalculadoraFrontera(double ingresoGravable) {
        this.ingresoGravable = ingresoGravable;
    }

    @Override
    public double calcularImpuesto(){
        return ingresoGravable * 0.08;
    }


}
