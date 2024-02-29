
package Persona;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        Persona pers1= new Persona();
        
        System.out.println("Cual es su nombre? ");
       String nombre= lectura.nextLine();
       pers1.setNombre(nombre);
       
      
        System.out.println("\ncual es su edad? ");
        int edad= lectura.nextInt();
         lectura.nextLine();
        pers1.setEdad(edad);
         
        System.out.println("\n  Hola " + pers1.getNombre() + " tu edad es de " + pers1.getEdad());
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println("\ncomeras el dia de hoy?");
        String opcion=lectura.nextLine();
        if("si".equalsIgnoreCase(opcion))
        {
            System.out.println("que comeras hoy?");
            String comida= lectura.nextLine();
            pers1.Comer(comida);
            
        }
        else
        {
            System.out.println("de acuerdo, no tienes hambre al parecer");
        }
        
        System.out.println("\nte tomaras una ducha el dia de hoy?");
        String opcion2=lectura.nextLine();
        if("si".equalsIgnoreCase(opcion2))
        {
            System.out.println("con que jabon?");
            String jabon= lectura.nextLine();
            System.out.println("con agua fria o caliente?");
            String tempAgua= lectura.nextLine();
            pers1.tomarshowerPublico(jabon,tempAgua);
            
        }
        else
        {
            System.out.println("de acuerdo, no te daras una ducha hoy");
        }
        
        
        
        
    }
    
}
