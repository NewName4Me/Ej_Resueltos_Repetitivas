package Repetitivos;
import java.util.Scanner;


public class R6_ParesEnRango {
    public static void main(String[]args){
        
        Scanner pregunta=new Scanner(System.in);
        System.out.println("Dime dos números y te diré todos los pares que se encuentran entre estos dos");
        
        System.out.print("Primer numero: ");
        int n1=pregunta.nextInt();
        System.out.print("Segundo numero: ");
        int n2=pregunta.nextInt();
        
        int temp; //en caso de que haga falta intercambiar la posicion de los numeros
        
        if (n1>n2){//para determinar cual es mayor y establecer el limite superior de rango
            temp=n2;
            n2=n1;
            n1=temp; 
        }
        
        while(n2>=n1){//necisto que sea >=, si no no tiene en cuente el el valor mas pequeño del rango en caso de que sea par
            
            if (n2%2==0){//asi es como chequeo si es par o no
                System.out.println("Los números pares entre tus dos valores son: "+n2);
            }
            n2=n2-1;/*no me gusta mucho que me de los pares de mayor a menor, preferiria al reves, 
            para eso simplemente cuenta hacia delante sumandole 1 al menor (n1) */
        }
    }
}
