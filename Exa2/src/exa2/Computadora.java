package exa2;

import java.awt.Color;
import java.util.*;

public class Computadora {

    private String n_serie;
    private Date fecha;
    private Color c;
    private String material;
    private ArrayList<Parte> partes = new ArrayList();

    public Computadora() {
    }

    public Computadora(String n_serie, Date fecha, Color c, String material) {
        this.n_serie = n_serie;
        this.fecha = fecha;
        this.c = c;
        this.material = material;
    }

    public String getN_serie() {
        return n_serie;
    }

    public void setN_serie(String n_serie) {
        this.n_serie = n_serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    public void setparte(Parte p) {
        this.partes.add(p);
    }

    @Override
    public String toString() {
        return "Computadora{" + "Numero de serie=" + n_serie + ", Año=" + fecha + ", Color=" + c + ", Material=" + material + ", partes=" + partes + '}';
    }

}
