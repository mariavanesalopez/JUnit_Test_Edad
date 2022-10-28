package main.test;

import main.Grupo;
import main.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrupoTest {
    @Test
     public void controlAltaPersona(){
        //Given (datos dados)
        Persona juan= new Persona("juan", 19);
        Persona pedro= new Persona("pedro", 25);
        Persona ana= new Persona("ana", 30);
        Persona luis= new Persona("luis", 28);
        Persona julian= new Persona("julian", 32);
        Grupo grupoDePersonas= new Grupo();

        //When (cuando menciono un metodo)
        grupoDePersonas.agregarPersona(juan);
        grupoDePersonas.agregarPersona(pedro);
        grupoDePersonas.agregarPersona(ana);
        grupoDePersonas.agregarPersona(luis);
        grupoDePersonas.agregarPersona(julian);

        //Then (entonces)
        Assertions.assertTrue(grupoDePersonas.cantidadDePersonasEnElListado() == 2);
    }


}
