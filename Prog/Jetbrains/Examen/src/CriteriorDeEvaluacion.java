public class CriteriorDeEvaluacion {

    static double calcularAprobado(double[] calificaciones){
        double media = 0;
        double sumaNotas = 0;
        int totalAprobadas = 0;
        //supera por media si es mas de 5
        //supera si 4 estan aprobadas
        for (int i = 0; i < calificaciones.length; i++) {
            sumaNotas += calificaciones[i];
            if(calificaciones[i] >= 5) totalAprobadas++;
        }
        media = sumaNotas/6;
        if(media >= 5) System.out.println("Aprobado por media = " + media);
        if(totalAprobadas >=4) System.out.println("Aprobado por tener " + totalAprobadas + " asignaturas aprobadas");
        return media;
    }

    static CodigoNota getCodigo(double media){

        CodigoNota resultado = CodigoNota.Insuficiente;

        if(media > 0 && media <4) resultado = CodigoNota.Insuficiente;
        if(media >=4 && media <5) resultado = CodigoNota.Suficiente;
        if(media >=5 && media <7) resultado = CodigoNota.Bien;
        if(media >=7 && media <9) resultado = CodigoNota.Notable;
        if(media >=9 && media <=10) resultado = CodigoNota.Sobresaliente;

        return resultado;
    }

}
