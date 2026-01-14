public class cuadrado {
    double lado;
    double area;
    double perimetro;

    public cuadrado(double lado) {
        this.lado = lado;
        this.area = Math.pow(this.lado, 2);
        this.perimetro = this.lado*4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getArea(){
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }

}
