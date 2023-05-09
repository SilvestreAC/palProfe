package tareaParaElProfe;

public class ImpuestoNorte implements CalculadoraImpuesto{
    private double CantidadAGravar;

    public ImpuestoNorte(double cantidadAGravar) {
        CantidadAGravar = cantidadAGravar;
    }

    @Override
    public double calculadoraImpuesto() {
        return this.CantidadAGravar*0.16;
    }

}
