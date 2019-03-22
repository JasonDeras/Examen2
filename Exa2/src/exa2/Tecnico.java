package exa2;

public class Tecnico {

    private String nombre;
    private int edad;
    private String genero;
    private int compu;

    public Tecnico() {
    }

    public Tecnico(String nombre, int edad, String genero, int compu) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.compu = compu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCompu() {
        return compu;
    }

    public void setCompu(int compu) {
        this.compu = compu;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "Nombre=" + nombre + ", Edad=" + edad + ", Genero=" + genero + ", Computadoras ensambladas con exito=" + compu + '}';
    }

}
