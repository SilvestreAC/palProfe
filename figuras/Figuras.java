package figuras;

public class Figuras {
    //declarar PerimetroCalculabe com privado porque es un campo de la clase
    private PerimtroCalculable[] perimtroCalculables={
            new Pentagono(3),new Poligono(3,7,3,55),new Triangulo(9,4,3),
            new Pentagono(35),new Poligono(3,74,23,55),new Triangulo(49,24,43),
            new Pentagono(35),new Poligono(3,7,3,55),new Triangulo(59,43,13),
            new Pentagono(34),new Poligono(9,2,5,42),new Triangulo(87,32,13),
    };

    public Figuras() {
    }


    //METODO AGREGADO PARA RETORNAR LOS OBJETOS EN LA LISTA
    public PerimtroCalculable[] getPerimtroCalculables() {
        return perimtroCalculables;
    }

    //constructor equipado con inyeccion de dependencia
    public Figuras(PerimtroCalculable[] perimtroCalculables) {
        this.perimtroCalculables = perimtroCalculables;
    }

    //METODO USADO PARA setter Injection
    public void setPerimtroCalculables(PerimtroCalculable[] perimtroCalculables) {
        this.perimtroCalculables = perimtroCalculables;
    }

    public void imprimirPerimetros(){
        for (PerimtroCalculable perimetro:perimtroCalculables){
            System.out.println(perimetro.calcularPerimetro());
        }
    }



}
