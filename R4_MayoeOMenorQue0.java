package Repetitivos;
import java.util.Scanner;

public class R4_MayoeOMenorQue0 {
    public static void main(String[]args){
        /*
        Programa donde el usuario indica cuantos numeros quiere chequear, y al final le decimos
        cuantos eran mayores a cero, cuantos menores cuantos iguales
        */
        Scanner pregunta=new Scanner(System.in);
        
        //Variables
        double num;//numeros a introducir
        int cuantas;//para ver cuantos numeros tenemos que comprobar
        //las tres siguientes variables son contadores
        int ceros=0;
        int positivos=0;
        int negativos=0;
        
        System.out.println("Cuántos números quieres revisar");
        cuantas=pregunta.nextInt();
        
        while (cuantas>0){
            System.out.print("Tú "+cuantas+"º numero es:");
            num=pregunta.nextDouble();
            cuantas=cuantas-1; //recuerda ponerlo debajo del mensaje de arriba porque si no el mensaje no tiene sentido
            
            if (num==0){//para diferenciar las tres posibilidades
                ceros=ceros+1;
            }
            else if(num>0){
                positivos=positivos+1;
            }
            else{
                negativos=negativos+1;
            }
        }
        System.out.println("Has introducido: "+ceros+" ceros, "+positivos+" positivos y "+negativos+" negativos.");
    }
}
