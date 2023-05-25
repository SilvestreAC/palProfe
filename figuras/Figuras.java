package figuras;

public class Figuras {
    PerimtroCalculable[] perimtroCalculables={
            new Pentagono(3),new Poligono(3,7,3,55),new Triangulo(9,4,3),
            new Pentagono(35),new Poligono(3,74,23,55),new Triangulo(49,24,43),
            new Pentagono(35),new Poligono(3,7,3,55),new Triangulo(59,43,13),
            new Pentagono(34),new Poligono(9,2,5,42),new Triangulo(87,32,13),
    };

    public Figuras() {
    }

    public Figuras(PerimtroCalculable[] perimtroCalculables) {
        this.perimtroCalculables = perimtroCalculables;
    }

    public void setPerimtroCalculables(PerimtroCalculable[] perimtroCalculables) {
        this.perimtroCalculables = perimtroCalculables;
    }

    public void imprimirPerimetros(){
        for (PerimtroCalculable perimetro:perimtroCalculables){
            System.out.println(perimetro.calcularPerimetro());
        }
    }



}
