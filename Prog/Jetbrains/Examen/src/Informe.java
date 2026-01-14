public class Informe {
    String nombreAlumno;
    String cursoAlumno;
    double media;
    CodigoNota codigo;


    public Informe(String nombreAlumno, String cursoAlumno, double media, CodigoNota codigo) {
        this.nombreAlumno = nombreAlumno;
        this.cursoAlumno = cursoAlumno;
        this.media = media;
        this.codigo = codigo;

    }

    public String toString(){
        return "El alumno: " + this.nombreAlumno + " del curso: " + this.cursoAlumno +
                " tiene de media: " + this.media + " y el código de nota es: " + this.codigo;
    }
}
