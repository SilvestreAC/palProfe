package claseAbstracta;

public class ImplementacionClaseAbstracta2 extends ClaseAbstracta {
    @Override
    public String metodoAbstracto(String mensaje) {
        System.out.println("segundo metodo abstracto implementado "+mensaje+" "+mensaje);
        return "2do metodo imprime mensaje 2 veces ";
    }
}
