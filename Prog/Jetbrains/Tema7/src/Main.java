public class Main {
    static void main() {
        /*Coche coche1 = new Coche("a3", "audi", "4532nvr", 2020, 20000);
        coche1.precio = 10000;
        System.out.println(coche1.precio);
        Persona yo = new Persona("Gonzalo", "Viedma Díaz", "54201306N");
        CuentaBancaria cuenta1 = new CuentaBancaria(yo);
        cuenta1.titular.mostrarInfo();*/
        Contrasenia mipassword = new Contrasenia();
        Contrasenia mipassword2 = new Contrasenia(20);

        System.out.println("Contraseña 1: " + mipassword.getPassword());
        System.out.println("Contraseña 2: " + mipassword2.getPassword());
        System.out.println("Seguridad de la primera contraseña: " + mipassword.esFuerte());
        System.out.println("Seguridad de la segunda contraseña: " + mipassword2.esFuerte());


    }
}
