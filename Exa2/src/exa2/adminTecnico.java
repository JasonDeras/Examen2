package exa2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class adminTecnico {

    private ArrayList<Tecnico> listap = new ArrayList();
    private File archivo = null;

    public adminTecnico(String path) {
        archivo = new File(path);
    }

    public ArrayList<Tecnico> getListap() {
        return listap;
    }

    public void setListap(ArrayList<Tecnico> listap) {
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

    public void setPersona(Tecnico p) {
        this.listap.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Tecnico t : listap) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getGenero() + ";");
                bw.write(t.getCompu() + ";");
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
                    listap.add(new Tecnico(s.next(), s.nextInt(), s.next(),s.nextInt()));
                }
            } catch (Exception e) {
            }
            s.close();
        }
    }
}
