package InyyecionDependencias;

public class ColeccionDeFiguras {
    Figuras[] figuras= {
            new FigurasCudrado(1), new FigurasPentagono(1),new FigurasTriangulo(31,3,4),
            new FigurasCudrado(2), new FigurasPentagono(2),new FigurasTriangulo(32,3,4),
            new FigurasCudrado(3), new FigurasPentagono(3),new FigurasTriangulo(33,3,4),
            new FigurasCudrado(4), new FigurasPentagono(4),new FigurasTriangulo(34,3,4),
            new FigurasCudrado(5), new FigurasPentagono(5),new FigurasTriangulo(34,3,4),
            new FigurasCudrado(6), new FigurasPentagono(6),new FigurasTriangulo(35,3,4),
            new FigurasCudrado(7), new FigurasPentagono(7),new FigurasTriangulo(53,3,4),
            new FigurasCudrado(8), new FigurasPentagono(28),new FigurasTriangulo(37,3,4),
            new FigurasCudrado(9), new FigurasPentagono(27),new FigurasTriangulo(39,3,4),
            new FigurasCudrado(10), new FigurasPentagono(26),new FigurasTriangulo(93,3,4),

    };



    public ColeccionDeFiguras(Figuras[] figuras) {
        this.figuras = figuras;
    }

    public ColeccionDeFiguras() {
    }

    public Figuras[] getFiguras() {
        return figuras;
    }

    public void setFiguras(Figuras[] figuras) {
        this.figuras = figuras;
    }
}
