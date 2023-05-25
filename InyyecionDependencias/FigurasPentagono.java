package InyyecionDependencias;

public class FigurasPentagono implements Figuras {
    int lado;

    public FigurasPentagono(int lado) {
        this.lado = lado;
    }

    @Override
    public int perimetro() {
        return lado*5;
    }
}
