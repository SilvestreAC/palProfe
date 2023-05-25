package figuras;

public class Triangulo implements PerimtroCalculable {
    int lado1,lado2,lado3;
    int perimetro;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }
}
