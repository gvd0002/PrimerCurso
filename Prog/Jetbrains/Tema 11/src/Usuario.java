public class Usuario extends Persona{

    String nombre;
    int edad;

    Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String mostrarDatos(){
        return "Me llamo " + this.nombre + " y tengo " + this.edad + " años";
    }


}
