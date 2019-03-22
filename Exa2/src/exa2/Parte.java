package exa2;

public class Parte {

    private double tiempo;

    public Parte() {
    }

    public Parte(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "Tiempo de Ensamblaje=" + tiempo + '}';
    }

}
