public class Alumno {
    String nombre;
    String curso;
    double calificaciones[];


    public Alumno(String nombre, String curso, double[] calificaciones) {
        this.nombre = nombre;
        this.curso = curso;
        this.calificaciones = new double[6];
        for (int i = 0; i < this.calificaciones.length; i++) {
            this.calificaciones[i] = calificaciones[i];
        }

    }

    public Informe crearInforme(){
        double media = CriteriorDeEvaluacion.calcularAprobado(calificaciones);
        Informe informe = new Informe(this.nombre, this.curso, media, CriteriorDeEvaluacion.getCodigo(media));

        return informe;
    }
}
