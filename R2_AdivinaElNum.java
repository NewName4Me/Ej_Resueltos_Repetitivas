package Repetitivos;
import java.util.Scanner;
import java.util.Random;

public class R2_AdivinaElNum {
    public static void main(String[] args){
        
        Scanner pregunta=new Scanner(System.in);
        Random random=new Random();
        
        int guess=random.nextInt(100)+1;//nos dará un número entre 100 y 1
        int tries=10; //para determinar el numero de intentos
        
        System.out.println("Dime un número del 1 al 100 y  te dire si has acertado, tienes 10 intentos");
        
        
        while(tries!=0){
            tries=tries-1;
            int num=pregunta.nextInt();//le preguntara al usuario cada vez el numero a intentar
            
            if (num==guess){
                System.out.println("Ganaste el número correcto era: "+guess);
                System.out.println("Lo conseguiste con "+tries+" intentos restantes");
                break; //esto hace que el programa termine automaticamente si aciertan
            }
            else if (num<guess){
                System.out.println("El número que buscas es mayor que "+num);
            }
            else {
                System.out.println("El número que buscas es menor que "+num);
            }
        }
        if (tries==0){//cuando se quede sin intentos se acabo el programa 
            System.out.println("Perdiste el número era "+guess);
        }
    }
    
}
