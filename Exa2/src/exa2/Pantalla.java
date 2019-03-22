package exa2;

public class Pantalla extends Parte{

    private String tipo;
    private String tactil;

    public Pantalla() {
        super();
    }

    public Pantalla(String tipo, String tactil, int tiempo) {
        super(tiempo);
        this.tipo = tipo;
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    @Override
    public String toString() {
        return super.toString()+"Pantalla Tipo=" + tipo + ", Tactil=" + tactil + '}';
    }

}
