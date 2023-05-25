package InyyecionDependencias;

public class FigurasTriangulo implements Figuras {
    private int lado1,lado2,lado3;

    public FigurasTriangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public  int perimetro() {
        return lado1+lado2+lado3;

    }
}
