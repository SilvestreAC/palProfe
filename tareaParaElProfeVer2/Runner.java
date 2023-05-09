package tareaParaElProfeVer2;



public class Runner {
    public static void main(String[] args) {


        Persona[] personas = {      //INYECTAS DIRECTAMENTE LA DEPENDENCIA CON LA ZONA QUE DESEAS PARA EL IMPUESTO
                                    // UTILIZANDO LA TECNICA DE  CONSTRUCTOR INYECTION MANDAS LA IMPLEMENTACION
                                    // DIRECTAMENTE CON -->> new ImpuestoSur(1000) O SEGUN EL CASO QUE REQUIERAS

                new Persona(1000, "paco", new ImpuestoSur(100d)),
                new Persona(1000, "juan", new ImpuestoNorte(1000)),
                new Persona(1000, "pedro", new ImpuestoFrontera(1000))
        };

        // CON ESTE METODO DESACOPLAS A PERSONA Y AL TIPO DE CALCULADORA de impuestos ASI YA NO TIENEN UNA DEPENDENCIA
        // DIRECTA ESA TU LA INYECTAS
        // y cuando  SE REQUIERA UNA NUEVA LOGICA PARA CALCUALR OTRO TIPO DE IMPUESTO ISR IVA. ISPT
        // etc  SOLO CREAS LA NUEVA IMPLEMENTACION POR SEPARADO SIN AFECTAR NADA Y LA USAS CUANDO LA NECESITES


        for (Persona persona1:personas){
            System.out.println(persona1);
        }

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

        Persona personaDeposita = new Persona(16000,"luisa",new ImpuestoDepositoEfectivo(16000));
        System.out.println(personaDeposita);

    }
}
