package TrabajoEnClase1;

import java.util.ArrayList;

public class Listas {


    private ArrayList<String> comprasHechas;
    private String nombres;

    public Listas(String nombres) {
        this.nombres = nombres;
        this.comprasHechas = new ArrayList<>();
    }

    public void añadirPacientes(String paciente){
        comprasHechas.add(paciente);
    }

    public ArrayList<String> getComprasHechas() {
        return comprasHechas;
    }



}
