//Mi clase en Java
public class VariablesTema2 {
    public static void main (String args[]){
        
        //Valor de la Variable. Int: Asigna Numero
    int miVariableEntera = 10;
    System.out.println(miVariableEntera);
    
    //Modificamos el valor de la Variable
    miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        //String: Asigna cadena
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos de Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
         //Valores permitidos en el nombre de variables
         var miVariable = 1;
         var _miVariable = 2;
         var $miVariable = 3;
         // var àVariable = 10; No se recomienda utilizar
         // var #miVariable = 2; No se permite utilizar caracteres especiales
         
    }
}
