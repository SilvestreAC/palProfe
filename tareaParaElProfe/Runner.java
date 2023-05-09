package tareaParaElProfe;

public class Runner {
    public static void main(String[] args) {


        Persona[] personas = {
                new Persona(1000, "paco", "sur"),
                new Persona(1000, "juan", "norte"),
                new Persona(1000, "pedro", "frontera")
        };
        for (Persona persona1:personas){
            System.out.println(persona1.toString());
        }
    }
}
