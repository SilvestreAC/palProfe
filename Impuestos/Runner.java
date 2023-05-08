package Impuestos;

public class Runner {
    public static void main(String[] args) {

        Persona[] personas = { new Persona(1000,"krsna",true),
                new Persona(2000,"krsna",true),
                new Persona(3000,"pepe",false),
                new Persona(4000,"carlos",true),
                new Persona(5000,"ramiro",false),
                new Persona(6000,"lola",true),
                new Persona(7000,"carmen",false),
                new Persona(8000,"patricia",true),
        };

        for (Persona persona :personas){
            System.out.printf("nombre: %s, sueldo %.2f, es Fronterizo, %b, impuesto %f %n",persona.getNombres(),persona.getSueldo(),persona.isEsFronterizo(),
                    persona.getImpuesto());
        }

    }
}
