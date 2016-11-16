package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import practice.model.Agenda;
import practice.model.Persona;
import practice.model.User;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		instance to file
		File file = new File("contacts.obj");
		file.createNewFile();
        Hashtable personas;
        Agenda ag = new Agenda();
        if(file.exists()){
			FileInputStream input = new FileInputStream(file);
			ObjectInputStream oInput = new ObjectInputStream(input);
			ag = (Agenda)oInput.readObject();
			System.out.println("Contacts loaded");
		}
        
        Persona p;
        int op;
        String dni;
        String nombre;
        Long telefono;
        try {
            do {                
                System.out.println("Ingrese el numero de la opcion que desea");
                System.out.println("1.- Agregar Persona");
                System.out.println("2.- Buscar Persona");
                System.out.println("3.- Eliminar Persona");
                System.out.println("4.- Mostrar todas las Personas");
                System.out.println("5.- Salir");
                op = sc.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Ingrese el Dni");
                        dni = sc.next();
                        System.out.println("Ingrese el Nombre");
                        nombre = sc.next();
                        System.out.println("Ingrese el Telefono");
                        telefono = sc.nextLong();
                        if(ag.setPersonas(dni, new Persona(dni, nombre, telefono))){
                            System.out.println("La persona se agrego con exito.");
                        }else{
                            System.out.println("La persona ya existe.");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el Dni de la persona.");
                        dni = sc.next();
                        p = ag.buscar(dni);
                        if(p == null){
                            System.out.println("La Persona no existe.");
                        }else{
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el Dni de la persona que desea remover.");
                        dni = sc.next();
                        p = ag.eliminar(dni);
                        if(p != null){
                            System.out.println("El siguiente registro se elimino con exito."+p.toString());
                        }else{
                            System.out.println("No se pudo eliminar a la persona.");
                        }
                        break;
                    case 4: 
                        personas = ag.getPersonas();
                        if(personas.size() == 0){
                            System.out.println("No existe ninguna persona.");
                            break;
                        }
                        Enumeration clave = personas.keys();
                        while (clave.hasMoreElements()) {                            
                            System.out.println(personas.get(clave.nextElement()));
                        }
                        break;
                }
            } while (op != 5);
            
            
        	if(file.exists()){
//    				people
				FileOutputStream fos= new FileOutputStream(file);
				ObjectOutputStream contacts = new ObjectOutputStream(fos);
				contacts.reset();
				contacts.writeObject(ag);
				contacts.close();
				// re-run  an application
			}
            
            System.out.println("fin del programa....");
        } catch (Exception e) {
            System.out.println(e);
        }
    
	}

}
