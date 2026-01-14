public class EmpleadoFijo extends Empleado{
    final double sueldo = 1300.00;

    public EmpleadoFijo(String nombre) {
        super(nombre);
    }

    @Override
    String getTipo(){
        return "Empleado Fijo";
    }

    public double calcularPago(double sueldo){
        return this.sueldo;
    }

}
