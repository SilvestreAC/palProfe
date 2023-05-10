package tareaParaElProfeVer2;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {


        Persona[] personas = {      //INYECTAS DIRECTAMENTE LA DEPENDENCIA CON LA ZONA QUE DESEAS PARA EL IMPUESTO
                                    // UTILIZANDO LA TECNICA DE  CONSTRUCTOR INYECTION MANDAS LA IMPLEMENTACION
                                    // DIRECTAMENTE CON -->> new ImpuestoSur(1000) O SEGUN EL CASO QUE REQUIERAS

                new Persona(1000, "paco", new ImpuestoSur(1000)),
                new Persona(1000, "juan", new ImpuestoNorte(1000)),
                new Persona(1000, "pedro", new ImpuestoFrontera(1000))
        };

        // CON ESTE METODO DESACOPLAS A PERSONA Y AL TIPO DE CALCULADORA de impuestos ASI YA NO TIENEN UNA DEPENDENCIA
        // DIRECTA ESA TU LA INYECTAS
        // y cuando  SE REQUIERA UNA NUEVA LOGICA PARA CALCUALR OTRO TIPO DE IMPUESTO ISR IVA. ISPT
        // etc  SOLO CREAS LA NUEVA IMPLEMENTACION POR SEPARADO SIN AFECTAR NADA Y LA USAS CUANDO LA NECESITES


        System.out.println("-----------IMPUESTOS POR ZONAS ECONOMICAS---------------------------");
        System.out.printf("| %20s | %10s | %10s | %15s |%n", "NOMBRE", "SUELDO","IMPUESTO","ZONA APLICADA");
        System.out.println("--------------------------------------------------------------------");
        for (Persona persona1:personas){
            System.out.printf("%s %15s |%n",persona1,persona1.calculadoraImpuesto);
        }
        System.out.println("--------------------------------------------------------------------");

        // ALGUNOS EJEMPLOS DE IMPUESTOS QUEHAY EN MEXICO
        // SON
        //    Impuesto sobre la Renta (ISR)
        //    Impuesto al Valor Agregado (IVA)
        //    Impuesto Especial sobre Producción y Servicios (IEPS)
        //    Impuesto sobre Automóviles Nuevos (ISAN)
        //    Impuesto Empresarial a Tasa Única (IETU)
        //    Impuesto a los Depósitos en Efectivo (IDE)
        //
        //    Impuesto Predial
        //    Impuesto sobre la Adquisición de Inmuebles
        //    Impuesto sobre Espectáculos Públicos
        //    Impuesto sobre el Patrimonio

        //    Y CUALQUIERA DE ELLOS LO PUEDES AGREGAR SIN MUCHO PROBLEMA
        //por ejemplo SI SE REQUIERE CALCULAR EL ISPT CREAMOS LA NUEVA IMPLEMENTACION QUE A PESAR DE SER LABORIOSA
        // SE INTEGRA CON FACILIDAD A TODAS LAS DEMAS ESTO LO HAREMOS EL MIERCOLES TE INCLUYO UN ARCHIVO DE EXCEL CON
        // LA FORMULA PARA ESE IMPUESTO ESTA SENCILLA PERO ALGO ELABORADA
        //
        // ISPT.xlsx   es el archivo de excel

        //A CONTINUACION AGREGUE UNA NUEVA IMPLEMENTACION QUE ES UN IMPuESTO A LOS DEPOSITOS EN EFECTIVO
        //
        // Tasa del IDE es del 3% cuando el deposito excede 15,000.
        //
        //

        Persona[] personaDeposita = {
                new  Persona(400,"luisa1",new ImpuestoDepositoEfectivo(400)),
                new  Persona(17000,"luisa2",new ImpuestoDepositoEfectivo(17000)),
                new  Persona(900,"luisa3",new ImpuestoDepositoEfectivo(900)),
                new  Persona(19000,"luisa4",new ImpuestoDepositoEfectivo(19000)),
                new  Persona(1600,"luisa5",new ImpuestoDepositoEfectivo(1600)),
                new  Persona(18000,"luisa6",new ImpuestoDepositoEfectivo(18000)),
                new  Persona(100,"luisa7",new ImpuestoDepositoEfectivo(100)),
        };


        //tabla creada con funciones lambdas y streams
        System.out.println("------IMPUESTO A LOS DEPOSITOS EN EFECTIVO-------");
        System.out.printf("| %20s | %10s | %10s |%n", "NOMBRE", "DEPOSITO","I.D.E.");
        System.out.println("-------------------------------------------------");
        Arrays.stream(personaDeposita).forEach(persona -> System.out.println(persona));
        System.out.println("-------------------------------------------------");


        Persona[] personasConISR= {
                new Persona(100, "javier1", new ISR2022(100)),
                new Persona(500, "javier2", new ISR2022(500)),
                new Persona(5000, "javier3", new ISR2022(5000)),
                new Persona(8000, "javier4", new ISR2022(8000)),
                new Persona(9000, "javier5", new ISR2022(9000)),
                new Persona(11000, "javie6r", new ISR2022(11000)),
                new Persona(21000, "javie7r", new ISR2022(21000)),
                new Persona(33000, "javie8r", new ISR2022(33000)),
                new Persona(63000, "javie9r", new ISR2022(63000)),
                new Persona(84000, "javier10", new ISR2022(84000)),
                new Persona(260000.00, "javier11", new ISR2022(260000.00))
        };


        //tabla creada con programacion funcional y streams
        System.out.println("----CALCULAR EL IMPUESTO SOBRE LA RENTA 2022------");
        System.out.printf("| %20s | %10s | %10s |%n", "NOMBRE", "SUELDO","ISR 2022");
        System.out.println("-------------------------------------------------");
        Arrays.stream(personasConISR).forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }
}
