package main;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> listaPersona;

    public Grupo() {
        this.listaPersona = new ArrayList<Persona>();
    }

    //agregar personas en el listado
    public void agregarPersona(Persona p) {
        if (p.getEdad() >= 18 && p.getNombre().length() >=5) {
            listaPersona.add(p);
        } else {

            System.out.println("no se puede agregar a " + p);
        }

    }

    public int cantidadDePersonasEnElListado(){
        return listaPersona.size();
    }

}
