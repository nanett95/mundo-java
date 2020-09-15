
import java.util.Scanner;

public class claseScannerTema6 {
    
    public static void main(String args[]){
        System.out.println("Escribe el Titulo:");
        Scanner consola = new Scanner (System.in);
        var usuario = consola.nextLine();
        System.out.println("Escribe el Autor");
        var usuario_ = consola.nextLine();
        System.out.println(usuario + " fue escrito por " + usuario_);
        
    }
    
}
