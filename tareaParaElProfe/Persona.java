package tareaParaElProfe;

public class Persona {
    private double sueldoIngreso;
    private String nombre;
    private String zonaACobrarImpuesto;
    public CalculadoraImpuesto calculadoraImpuesto;
    double impuesto;

    public Persona(double sueldoIngreso, String nombre,String zonaACobrarImpuesto) {
        this.sueldoIngreso = sueldoIngreso;
        this.nombre = nombre;
        this.zonaACobrarImpuesto= zonaACobrarImpuesto;


        if (zonaACobrarImpuesto=="sur"){
            this.calculadoraImpuesto=new ImpuestoSur(this.sueldoIngreso);
        } else if (zonaACobrarImpuesto=="norte") {
            this.calculadoraImpuesto=new ImpuestoNorte(this.sueldoIngreso);
            /*2. asi que por eso el ultimo else-if esta en ".equals" y los otros estan como yo los hice con "=="*/
        } else if (zonaACobrarImpuesto.equals("frontera")) {
            this.calculadoraImpuesto=new ImpuestoFrontera(this.sueldoIngreso);
            /*1. la manera en como yo lo hice fue utilizando (==) para la logica. El programa me indico utilzar el ".equals" por como indica.
             Return "true if the given object represents a String equivalent to this string, false otherwise"  */
        }
        impuesto=calculadoraImpuesto.calculadoraImpuesto();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "sueldoIngreso=" + sueldoIngreso +
                ", nombre='" + nombre + '\'' +
                ", zonaACobrarImpuesto='" + zonaACobrarImpuesto + '\'' +
                ", impuesto=" + impuesto +
                '}';
    }
}
