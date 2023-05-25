package figuras;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Figuras figuras=new Figuras();
        System.out.println("field inyection ");
        figuras.imprimirPerimetros();

        System.out.println("consrtuctor inyection ");
        //constructor injection
        figuras=new Figuras(
                new PerimtroCalculable[]{
                        new Pentagono(1),
                        new Poligono(1,2,3,4),
                        new Triangulo(2,3,4)
                }
        );

        figuras.imprimirPerimetros();

        //SETTER INJECTION
        System.out.println("setter injection");
        figuras.setPerimtroCalculables(new PerimtroCalculable[]{new Triangulo(1,2,3), new Pentagono(1)});
        figuras.imprimirPerimetros();


//        figuras.setPerimtroCalculables(new PerimtroCalculable[new Pentagono(1)]);
    }

}
