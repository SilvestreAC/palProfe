package tareaParaElProfe;

public class ImpuestoFrontera implements CalculadoraImpuesto{
    private double CantidadAGravar;

    public ImpuestoFrontera(double cantidadAGravar) {
        CantidadAGravar = cantidadAGravar;
    }

    @Override
    public double calculadoraImpuesto() {
        return this.CantidadAGravar*0.08;
    }
}
