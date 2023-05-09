package tareaParaElProfe;

public class ImpuestoSur implements CalculadoraImpuesto{
    private double CantidadAGravar;

    public ImpuestoSur(double cantidadAGravar) {
        CantidadAGravar = cantidadAGravar;
    }

    @Override
    public double calculadoraImpuesto() {
        return this.CantidadAGravar*0.24;
    }
}
