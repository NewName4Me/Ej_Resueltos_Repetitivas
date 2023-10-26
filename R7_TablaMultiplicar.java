package Repetitivos;
import java.util.Scanner;

public class R7_TablaMultiplicar {
    public static void main(String[]args){
        /*
        El usuario mete un numero cualquiera y nosotros le damos la tabla de multiplar de ese numero
        */
        Scanner pregunta=new Scanner (System.in);
        
        int mult=0;//para en el mensaje determinar por cual numero se esta multiplicando el nuestro
        int vueltas=10;//si quieres que en lugar del 1 al 10 sea del uno a mas cambia este numero
        System.out.print("De qué número quieres ver la tabla?: ");
        int num=pregunta.nextInt();
        
        while(vueltas>0){
            vueltas=vueltas-1;
            mult=mult+1;
            int res=mult*num;//para mostrar el resultado de las operaciones de la tabla
            
            System.out.println(num+"X"+mult+"="+res);
        }
    }
}
