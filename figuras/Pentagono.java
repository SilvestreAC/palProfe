package figuras;

public class Pentagono implements PerimtroCalculable {
    int longitudLado;
    int perimetro;

    public Pentagono(int longitudLado) {
        this.longitudLado = longitudLado;
    }

    @Override
    public double calcularPerimetro() {
perimetro=longitudLado*5;
        return perimetro;
    }
}
