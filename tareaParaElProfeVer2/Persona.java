package tareaParaElProfeVer2;

public class Persona {
    private double sueldoIngreso;
    private String nombre;
   // private String zonaACobrarImpuesto;
    public CalculadoraImpuesto calculadoraImpuesto;
    double impuesto;

    public Persona(double sueldoIngreso, String nombre,CalculadoraImpuesto calculadoraImpuesto) {
        this.sueldoIngreso = sueldoIngreso;
        this.nombre = nombre;
        this.calculadoraImpuesto=calculadoraImpuesto;
        impuesto=calculadoraImpuesto.calculadoraImpuesto();
    }

    @Override
    public String toString() {
        String conFormato = String.format("| %20s | %10.2f | %10.2f |", nombre, sueldoIngreso,impuesto);
        return conFormato;
    }
}
