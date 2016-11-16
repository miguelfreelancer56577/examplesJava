/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.model;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author SPPDF
 */
public class Agenda {
    
    private Hashtable<String,Persona> personas;
    
    public Agenda() {
        personas = new Hashtable<String,Persona>();
    }

    public Hashtable<String, Persona> getPersonas() {
        return personas;
    }
    
    public boolean setPersonas(String dni,Persona persona){
        if(!personas.contains(persona)){
            personas.put(dni,persona);
            return true;
        }
        return false;
    }
    
    public Persona eliminar(String dni){
        return personas.remove(dni);
    }
    
    public Persona buscar(String dni){
        return personas.get(dni);
    }
    
}
