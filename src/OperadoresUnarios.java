
public class OperadoresUnarios {
    
    public static void main (String args[]){
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c; //Operador unario para negacion (!) solo en booleano
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1.preincremento ( simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa un valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
       //2.postincremento (simbolo despues de la variable)
       var g = 5;//g = 6 por el incremento
       var h = g++;
       System.out.println("g = " + g);
       System.out.println("h = " + h);
       
       //decremento
       //1.predecremento
       var i = 2;
       var j = --i;
        System.out.println("i = " + i);// ya esta decrementada
        System.out.println("j = " + j);
        
        //2.postdecremento
        var k = 4;
        var l = k--;//primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k);
        System.out.println("l = " + l);
       
       
       
    }
    
    
}
