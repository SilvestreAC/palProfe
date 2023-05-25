package InyyecionDependencias;

public class runner {
    public static void main(String[] args) {

        //AQUI SE MUESTRAN LOS PERIMETROS DE LAS FIGURAS QUE ESTAN INYECTADAS CON FIELD INYECTION Y ESTAN OR DEFAULT SI NO SE MANDA UN ARREGLO AL CONSTRUCTOR
        ColeccionDeFiguras coleccionDeFiguras = new ColeccionDeFiguras();
        for (Figuras figura: coleccionDeFiguras.getFiguras()){
            System.out.println(figura.perimetro());
        }


        //AHORA HACEMOS INYECCION POR CONSTRUCTOR , LAS FIGURAS ANTERIORES YA NO SON LAS MISMAS SE REEMPLAZAN POR EL NUEVO ARREGLO
        coleccionDeFiguras = new ColeccionDeFiguras(
                new Figuras[]{
                        new FigurasTriangulo(1, 2, 3), new FigurasCudrado(1), new FigurasPentagono(3),
                        new FigurasTriangulo(4, 2, 3), new FigurasCudrado(1), new FigurasPentagono(3),
                        new FigurasTriangulo(5, 2, 3), new FigurasCudrado(1), new FigurasPentagono(3),
                        new FigurasTriangulo(6, 2, 3), new FigurasCudrado(1), new FigurasPentagono(3),
                        new FigurasTriangulo(8, 2, 3), new FigurasCudrado(1), new FigurasPentagono(3),
                });

            for (Figuras figura: coleccionDeFiguras.getFiguras()){
                System.out.println(figura.perimetro());
            }

        // POR ULTIMO PROBAMOS LA INYECCION POR SETTER TAMBIEN SE REEMPLAZA LE ARRAY CON LOS NUEVOS DATOS
        //PRIMERO DECLARAMOS UN ARREGLO Y LO LLENAMOS CON NUEVOS DATOS
        Figuras[] arregloDefiguras= {
                new FigurasTriangulo(1,2,3),
                new FigurasCudrado(1),
                new FigurasPentagono(3),
                new FigurasTriangulo(1,2,3),
                new FigurasCudrado(1),
                new FigurasPentagono(3)
            };

            //Y LO INYECTAMOS SON SETTER
        coleccionDeFiguras.setFiguras(arregloDefiguras);
        for (Figuras figura: coleccionDeFiguras.getFiguras()){
            System.out.println(figura.perimetro());
        }

        /// otra forma de inyectar con setter es crear el arreglo directamente al momento de enviarlo parecido al contructor inyection
        coleccionDeFiguras.setFiguras(new Figuras[]{
                new FigurasPentagono(1),
                new FigurasCudrado(10),
                new FigurasTriangulo(1,2,3)
        });

        for (Figuras figura: coleccionDeFiguras.getFiguras()){
            System.out.println(figura.perimetro());
        }












    }
}
