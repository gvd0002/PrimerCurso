public class Coche {
    String modelo;
    String marca;
    String matricula;
    int anio;
    float precio;


    public Coche(String modelo, String marca, String matricula, int anio, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.anio = anio;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
