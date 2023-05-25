package figuras;

public class Poligono implements PerimtroCalculable {
    int lado1,lado2,lado3,lado4;
    int perimetro;

    public Poligono(int lado1, int lado2, int lado3, int lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public double calcularPerimetro() {
        perimetro=lado1+lado2+lado3+lado4;
        return perimetro;
    }
}
