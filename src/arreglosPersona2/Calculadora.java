package arreglosPersona2;

public interface Calculadora {
    default double getTotalDeImpuestoAPagar(double i, boolean esFronterizo){
        double impuesto;
        if (esFronterizo==true){
            impuesto=.08;
        }else impuesto=.16;
        double totalImpuesto;
        totalImpuesto=i*impuesto;
        return totalImpuesto;
    }
}
