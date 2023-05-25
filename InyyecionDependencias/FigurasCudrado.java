package InyyecionDependencias;

public class FigurasCudrado implements Figuras {
    int lado;

    public FigurasCudrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int perimetro() {
        return lado*4;
    }
}
