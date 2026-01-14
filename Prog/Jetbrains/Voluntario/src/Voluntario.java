import java.util.Scanner;
public class Voluntario {

    public static void main(String[] argv){
        Scanner scan = new Scanner(System.in);

        String atacante;
        do{
            System.out.println("Escriba el tipo del atacante:");
            atacante = scan.nextLine();
        }
        while(!atacante.equals("Agua") && !atacante.equals("Fuego") && !atacante.equals("Planta") && !atacante.equals("Electrico"));

        String defensor;
        do{
            System.out.println("Escriba el tipo del defensor:");
            defensor = scan.nextLine();
        }
        while(!defensor.equals("Agua") && !defensor.equals("Fuego") && !defensor.equals("Planta") && !defensor.equals("Electrico"));

        double ataque;
        do{
            System.out.println("Escriba potencia de ataque:");
            ataque = scan.nextDouble();
        }
        while(ataque < 1 || ataque > 100);

        double defensa;

        do{
            System.out.println("Escriba potencia de defensa:");
            defensa = scan.nextDouble();
        }
        while(defensa < 1 || defensa > 100);

        double efectividad = 0;
//efectivo x2 neutral x1 poco efectivo x0.5
        switch (atacante){
            case "Agua":
                if(defensor.equals("Agua")){
                    efectividad = 0.5;
                }
                else {
                    if (defensor.equals("Fuego")) {
                        efectividad = 2;
                    }
                    else{
                        if(defensor.equals("Planta")){
                            efectividad = 0.5;
                        }
                        else{
                            efectividad = 1;
                        }
                    }
                }
                break;
            case "Fuego":
                if(defensor.equals("Agua")){
                    efectividad = 0.5;
                }
                else {
                    if (defensor.equals("Fuego")) {
                        efectividad = 0.5;
                    }
                    else{
                        if(defensor.equals("Planta")){
                            efectividad = 2;
                        }
                        else{
                            efectividad = 1;
                        }
                    }
                }
                break;
            case "Planta":
                if(defensor.equals("Agua")){
                    efectividad = 2;
                }
                else {
                    if (defensor.equals("Fuego")) {
                        efectividad = 0.5;
                    }
                    else{
                        if(defensor.equals("Planta")){
                            efectividad = 0.5;
                        }
                        else{
                            efectividad = 1;
                        }
                    }
                }
                break;
            case "Electrico":
                if(defensor.equals("Agua")){
                    efectividad = 2;
                }
                else {
                    if (defensor.equals("Fuego")) {
                        efectividad = 1;
                    }
                    else{
                        if(defensor.equals("Planta")){
                            efectividad = 0.5;
                        }
                        else{
                            efectividad = 0.5;
                        }
                    }
                }
                break;
            default:
                break;
        }
        double danio = 50*(ataque/defensa)*efectividad;

        System.out.println("El daño provocado es de " + danio);
    }

}
