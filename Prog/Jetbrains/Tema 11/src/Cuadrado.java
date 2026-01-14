 class Cuadrado implements FiguraColoreada{
    double longitud;
    String color;

     Cuadrado(double longitud, String color) {
        this.longitud = longitud;
        this.color = color;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public double calcularArea(){
         return this.longitud*this.longitud;
    }

    @Override
    public String getColor(){
         return this.color;
    }

}
