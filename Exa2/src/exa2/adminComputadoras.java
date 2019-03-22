package exa2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class adminComputadoras {

    private ArrayList<Computadora> listap = new ArrayList();
    private File archivo = null;
    Computadora p;

    public adminComputadoras(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListap() {
        return listap;
    }

    public void setListap(ArrayList<Computadora> listap) {
        this.listap = listap;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ADMP{" + "listap=" + listap + '}';
    }

    public void setPersona(Computadora p) {
        this.listap.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Computadora t : listap) {
                bw.write(t.getN_serie() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getC() + ";");
                bw.write(t.getMaterial() + ";");
                bw.write(t.getPartes() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner s = null;
        listap = new ArrayList();
        if (archivo.exists()) {
            try {
                s = new Scanner(archivo);
                s.useDelimiter(";");
                while (s.hasNext()) {
                    s.next(p.getN_serie());
                    s.next("" + p.getFecha());
                    s.next("" + p.getC());
                    s.next("" + p.getMaterial());
                    s.next("" + p.getPartes());
                }
            } catch (Exception e) {
            }
            s.close();
        }
    }
}
