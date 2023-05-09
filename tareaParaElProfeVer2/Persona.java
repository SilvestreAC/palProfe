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

//        this.zonaACobrarImpuesto= zonaACobrarImpuesto;
//        if (zonaACobrarImpuesto=="sur"){
//            this.calculadoraImpuesto=new ImpuestoSur(this.sueldoIngreso);
//        } else if (zonaACobrarImpuesto=="norte") {
//            this.calculadoraImpuesto=new ImpuestoNorte(this.sueldoIngreso);
//            /*2. asi que por eso el ultimo else-if esta en ".equals" y los otros estan como yo los hice con "=="*/
//        } else if (zonaACobrarImpuesto.equals("frontera")) {
//            this.calculadoraImpuesto=new ImpuestoFrontera(this.sueldoIngreso);
//            /*1. la manera en como yo lo hice fue utilizando (==) para la logica. El programa me indico utilzar el ".equals" por como indica.
//             Return "true if the given object represents a String equivalent to this string, false otherwise"  */
//        }

        /**
         * CON EL PASO SIGUIENTE TE AHORRAS TODOO LO QUE ESTA EN COMENTARIO REALIZAS UNA INYECCION DE LA DEPENDENCIA EN EL COSTRUCTOR
         * RECIBES  COMO PARAMETRO calculadoraImpuesto QUE ES LA CALCULADORA QUE DESEAS (frontera norte, sur etc)  Y PONES EN PRACTICA EL POLIMORFISMO
         */
        this.calculadoraImpuesto=calculadoraImpuesto;
        impuesto=calculadoraImpuesto.calculadoraImpuesto();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "sueldoIngreso=" + sueldoIngreso +
                ", nombre='" + nombre + '\'' +
                ", calculadoraImpuesto=" + calculadoraImpuesto +
                ", impuesto=" + impuesto +
                '}';
    }
}
