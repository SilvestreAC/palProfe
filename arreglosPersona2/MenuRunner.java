package arreglosPersona2;

import java.util.Arrays;
import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TuVasAqui tuVasAqui=new TuVasAqui();
        int opciones=0,opciones2=0;

        while (opciones!=4){
            System.out.println("1.Registrase\n"+"2.Base de datos\n"+"3.No elijas esta opcion\n"+"4.Salir");
            opciones=scanner.nextInt();
            if (opciones==1){
                System.out.println("Favor de elegir un espacio del 0 al 4");
                opciones2=scanner.nextInt();
                if (opciones2>-1 && opciones2<5){
                    tuVasAqui.eligeQueCelda(opciones2);
                    System.out.println("Dame tu nombre");
                    tuVasAqui.dameNombre(scanner.next());
                    System.out.println("Dame tu sueldo");
                    tuVasAqui.dameSueldo(scanner.nextDouble());
                    System.out.println("Dime eres fronterizo");
                    tuVasAqui.dameEsFronterizo(scanner.nextBoolean());
                    tuVasAqui.dameImpuestos(tuVasAqui.getTotalaPagarImpuesto());
                }

            } else if (opciones==2) {
                System.out.printf("╔════════════════════════════════════════════════════════════════════════════════════════════════════════╗ %n");
                System.out.printf("║%20S|%20S|%20S|%20S|%20S║ %n","Nombre","Sueldo","Frontero","Impuesto","ImpuestoAPagar");
                System.out.printf("║────────────────────┬────────────────────┬────────────────────┬────────────────────┬────────────────────║ %n");
                for (int indice=0;indice<5;indice++){
                    System.out.printf("║%20S|%20.2f|%20b|%20.2f|%20.2f║%n",tuVasAqui.getNombre()[indice],tuVasAqui.getSueldo()[indice],tuVasAqui.getEsFronterizo()[indice],tuVasAqui.getImpuestos()[indice],tuVasAqui.getTotalDeImpuestoAPagar(tuVasAqui.getSueldo()[indice], tuVasAqui.getEsFronterizo()[indice]),tuVasAqui.getEsFronterizo());
                }
                System.out.printf("╚════════════════════════════════════════════════════════════════════════════════════════════════════════╝ %n");
//                System.out.println(Arrays.toString(tuVasAqui.getNombre()));
//                System.out.println(Arrays.toString(tuVasAqui.getSueldo()));
//                System.out.println(Arrays.toString(tuVasAqui.getEsFronterizo()));
            } else if (opciones==3) {
                System.out.println("No hay nada, te dije que no eligieras esta opcion");
            }
        }

    }
}
