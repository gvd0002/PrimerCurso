public class EmpleadoPorHoras extends Empleado{
    final double precio = 12.50;
    final int horas = 10;

    public EmpleadoPorHoras(String nombre) {
        super(nombre);
    }

    @Override
    String getTipo(){
        return "Empleado Por Horas";
    }

    public double calcularPago(){
        return this.horas*this.precio;
    }

}
