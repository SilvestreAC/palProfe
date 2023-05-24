package claseAbstracta;

public class runner {
    public static void main(String[] args) {
        ClaseAbstracta claseAbstracta = new ImplementacionClaseAbstracta();
        ClaseAbstracta claseAbstracta2 = new ImplementacionClaseAbstracta2();

//
//        claseAbstracta.algunValor=10;
//        claseAbstracta.getAlgunValor();
//        claseAbstracta.setAlgunValor(20);
        System.out.println(" algunValor impl1"+claseAbstracta.getAlgunValor());
        System.out.println(" algunValor imp2"+claseAbstracta2.getAlgunValor());

        System.out.println(claseAbstracta2.metodoAbstracto("hello"));



    }
}
