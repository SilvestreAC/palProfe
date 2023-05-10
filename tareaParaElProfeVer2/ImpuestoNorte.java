package tareaParaElProfeVer2;

public class ImpuestoNorte implements CalculadoraImpuesto {
    private double CantidadAGravar;

    public ImpuestoNorte(double cantidadAGravar) {
        CantidadAGravar = cantidadAGravar;
    }

    @Override
    public double calculadoraImpuesto() {
        return this.CantidadAGravar*0.16;
    }

    @Override
    public String toString() {
        return "Norte(16%)";
    }
}
