package exa2;

public class Orden_Ensamblaje {

    private Computadora c;
    private Tecnico t;

    public Orden_Ensamblaje() {
    }

    public Orden_Ensamblaje(Computadora c, Tecnico t) {
        this.c = c;
        this.t = t;
    }

    public Computadora getC() {
        return c;
    }

    public void setC(Computadora c) {
        this.c = c;
    }

    public Tecnico getT() {
        return t;
    }

    public void setT(Tecnico t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Orden_Ensamblaje{" + "Computadora=" + c + ", Tecnico=" + t + '}';
    }
    
}
