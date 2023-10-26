package Repetitivos;
import java.util.Scanner;

public class R3_Suma_Promedio {
    public static void main(String[]args){
        Scanner pregunta=new Scanner(System.in);
        
        System.out.println("Dame todos los números que quieras y te dare su media y sumatoria, cuando quiras termianr inserta el cero");
        
        /*Cambie todas las variables a doubles en lugar de int para que me de las decimales en la media*/
        double sum=0; //suma de todos los numeros
        double avg=1;//media de todos los numeoros
        double i=0;//para saber cuantos números lleva introducido el usuario
        
        while (true){/*mientras que todo vaya bien esto se ejecuta, pero en cuanto nos salga un break rompemos el bucle
            lo hice asi porque me daba problemas con la parte de introducir variables con num y querer usarlo al principio
            como determinante de finalizar el bucle*/
            int num=pregunta.nextInt();
            
            if (num==0){//cuando insertan el valor cero el programa termina
                break;
            }
            sum=sum+num;
            i=i+1;
            avg=sum/i;
        }
        System.out.println(sum);
        //System.out.println(i);
        System.out.println(avg);
    }
}
