
import java.util.Scanner;


public class TareaOperadoresAritmeticos {
   public static void main (String args[]){
       System.out.println("Alto: ");
       Scanner consola = new Scanner(System.in);
       int alto = Integer.parseInt(consola.nextLine());
       System.out.println("usuario = " + alto);
       
       System.out.println("Ancho: ");
       int ancho = Integer.parseInt(consola.nextLine());
       System.out.println("usuario2 = " + ancho);
       
       int area = alto * ancho;
       System.out.println("area = " + area);
       
       int perimetro = (alto + ancho) * 2;
       System.out.println("perimetro = " + perimetro);
   }
}
