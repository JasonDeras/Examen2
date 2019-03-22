package exa2;

public class RAM extends Parte {

    private int tam;
    private String marca;

    public RAM() {
        super();
    }

    public RAM(int tam, String marca, int tiempo) {
        super(tiempo);
        this.tam = tam;
        this.marca = marca;
    }

    public int getTamaño() {
        return tam;
    }

    public void setTamaño(int tamaño) {
        this.tam = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + "RAM Tamaño=" + tam + ", Marca=" + marca + '}';
    }

}
