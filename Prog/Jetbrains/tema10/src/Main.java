public class Main {
    static void main(){
        /*Perro perro1 = new Perro("dalmata", "toby", 12);
        perro1.hacerRuido();
        perro1.comer();
        Animal animal1 = new Animal("oso", 14);
        animal1.hacerRuido();
        animal1.comer();*/

        Triangulo triangulo = new Triangulo(7);
        triangulo.dibujarPoligono();
        Cuadrado cuadrado = new Cuadrado(5
        v);
        cuadrado.dibujarPoligono();
    }
}

class Animal {
    String nombre;
    int edad;

     Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void hacerRuido(){
        System.out.println(this.nombre + " está haciendo ruido");
    }

    void comer(){
        System.out.println(this.nombre + " come");
    }

}

class Perro extends Animal{
    String raza;

    Perro(String raza, String nombre, int edad){
        this.raza = raza;
        super(nombre, edad);
    }

    @Override
    void hacerRuido(){
        System.out.println(this.nombre + " ladra");
    }
}