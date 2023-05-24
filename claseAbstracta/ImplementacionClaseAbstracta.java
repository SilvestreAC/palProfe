package claseAbstracta;

public class ImplementacionClaseAbstracta extends ClaseAbstracta {
    @Override
    public String metodoAbstracto(String mensaje) {
        System.out.println("PRIMER metodo abstracto implementado "+mensaje);
        return "IMPRIME MENSAJE 1 VES ";
    }
}
