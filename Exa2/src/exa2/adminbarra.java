package exa2;

import javax.swing.*;

public class adminbarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int n;

    public adminbarra(JProgressBar barra, int n) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
        this.n = n;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void run() {
        int tiempo = 0;
        while (vive) {
            if (avanzar) {
                tiempo = 1000 * n;
                barra.setMaximum(n);
                barra.setValue(barra.getValue() + 1);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
