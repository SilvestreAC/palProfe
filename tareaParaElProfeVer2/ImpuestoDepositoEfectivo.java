package tareaParaElProfeVer2;

public class ImpuestoDepositoEfectivo implements CalculadoraImpuesto{
    private  double deposito;

    public ImpuestoDepositoEfectivo(double deposito) {
        this.deposito = deposito;
    }

    @Override
    public double calculadoraImpuesto() {
        if (deposito>15000)
        return 15000*.03;
        else return 0;
    }

    @Override
    public String toString() {
        return "ImpuestoDepositoEfectivo{" +
                "deposito=" + deposito +
                '}';
    }
}
