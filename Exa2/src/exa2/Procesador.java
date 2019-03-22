package exa2;

public class Procesador extends Parte {

    private int n_nucleos;
    private double velocidad;

    public Procesador() {
        super();
    }

    public Procesador(int n_nucleos, double velocidad, double tiempo) {
        super(tiempo);
        this.n_nucleos = n_nucleos;
        this.velocidad = velocidad;
    }

    public int getN_nucleos() {
        return n_nucleos;
    }

    public void setN_nucleos(int n_nucleos) {
        this.n_nucleos = n_nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Procesador{" + "Numero de Nucleos=" + n_nucleos + ", Velocidad=" + velocidad + '}';
    }

}
