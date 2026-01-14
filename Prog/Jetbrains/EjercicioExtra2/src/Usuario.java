public class Usuario implements AutenticarRegistrar{

    String nombre;
    String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.registrar(nombre,contraseña);
        System.out.println("Usuario registrado con éxito");
    }

    @Override
    public boolean autenticar(String nombre, String contraseña) {
        boolean confirmacion = false;
        if(this.nombre.equals(nombre) && this.contraseña.equals(contraseña)) { confirmacion = true;}

        return confirmacion;
    }

    @Override
    public void registrar(String nombre, String contraseña) {

        this.nombre = nombre;
        this.contraseña = contraseña;

    }
}
