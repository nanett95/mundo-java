
import java.util.Scanner;


public class tarea {
    public static void main (String args[]){
        System.out.println("Nombre:");
        Scanner consola = new Scanner (System.in);
        var nombre = consola.nextLine();
        
        System.out.println("Id:");
        var id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Precio:");
        var precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        
        System.out.println("Envio Gratuito: " + envioGratuito);
     } 
}
