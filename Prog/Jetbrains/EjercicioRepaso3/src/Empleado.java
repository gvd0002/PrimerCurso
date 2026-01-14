public abstract class Empleado implements Pagable{
    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    abstract String getTipo();

    public abstract double calcularPago(int horas, double precio);
    public abstract double calcularPago(double sueldo);

}
