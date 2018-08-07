
package javaapplication4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
    int cont = 0;    
    ArrayList<String> nombre = new ArrayList();
    ArrayList<String> celular = new ArrayList();
    ArrayList<String> telefono = new ArrayList(); 
    ArrayList<String> nacim = new ArrayList();
    
    String name,name2;
    boolean encontrado, eliminar;
    int opc; 
    
    do{    
       System.out.println("AGENDA\n"
        + "1. Agregar contacto\n"
        + "2. Buscar contacto\n"
        + "3. Ver contactos\n"
        + "4. Eliminar contacto\n"
        + "5. Salir\n"
        + "\n"
        + "Digite una opción:");
    opc = lector.nextInt();

    switch (opc) {
        case 1:
            
            System.out.println("Digite nombre:");
            nombre.add(lector.next());
            System.out.println("Digite telefono:");
            telefono.add(lector.next());
            System.out.println("Digite celular:");
            celular.add(lector.next());
            System.out.println("Digite fecha de nacimiento dd/mm/aa:");
            nacim.add(lector.next());
            //cont++;
            System.out.println("\nContacto agragado exitosamente\n");
            break; 
        case 2: 
            encontrado=false;
            System.out.println("Ingrese nombre a buscar:");
            name = lector.next();
            for (int i=0; i<nombre.size();i++){
                if(nombre.get(i).equals(name)){  
                System.out.println("Nombre: "+nombre.get(i));
                System.out.println("Celular: "+celular.get(i));
                System.out.println("Telefono: "+telefono.get(i));
                System.out.println("Fecha de nacimiento: "+nacim.get(i)+"\n");                    
                encontrado=true;
                }
                }
            
            if(!encontrado)
                System.out.println("Contacto no encontrado");    
            break;
        case 3:
            for(int i = 0; i < nombre.size(); i++){
                System.out.println("\nContacto # "+(i+1)+"\n");
                System.out.println("Nombre: "+nombre.get(i));
                System.out.println("Celular: "+celular.get(i));
                System.out.println("Telefono: "+telefono.get(i));
                System.out.println("Fecha de nacimiento: "+nacim.get(i)+"\n");
            }
            break;
        case 4:
            System.out.println("Ingrese nombre de contacto a eliminar:");
            name2 = lector.next();
            eliminar=false;
            for (int i=0; i<nombre.size();i++){
                if(nombre.get(i).equals(name2)){
                    nombre.remove(i);
                        celular.remove(i);
                        telefono.remove(i);
                        nacim.remove(i);
                System.out.println("El contacto fue eliminado satisfactoriamente");
                    eliminar=true;    
                }
                    
                }
            
            if(eliminar==false)
                System.out.println("Elcontacto no fue encontrado");
            
            break;
        case 5:
            System.out.println("Hasta luego");
            break;
        default:
            System.out.println("Error: opcion invalida\n");
            break;    
    }
}
while (opc !=5);   
    }
    }
 
  