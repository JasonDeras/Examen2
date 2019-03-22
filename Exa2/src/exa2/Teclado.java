package exa2;

import java.awt.*;

public class Teclado extends Parte {

    private String material;
    private Color c;

    public Teclado() {
        super();
    }

    public Teclado(String material, Color c, int tiempo) {
        super(tiempo);
        this.material = material;
        this.c = c;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString()+ "Teclado Material=" + material + ", Color=" + c + '}';
    }

}
