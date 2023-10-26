package Repetitivos;
import java.util.Scanner;

public class R8_Intevalos {
    public static void main(String[]args){
        /*
        un programa donde metemos dos numeros de un intervalo
        una vez determinado el intervalor introducimos los numeros que queramos
        cuando metamo el cero termina el programa
        tenemos que indicar la suma de los valores dentro del intervalor
        la cantidad de valores fuera de este,la cantidad dentro y cuantos son iguales al intervalo
        */
        Scanner pregunta=new Scanner(System.in);
        
        System.out.println("Dime un valor de tu intervalo");
        int intMay=pregunta.nextInt();//intervalo mayor
        System.out.println("Dime el otro valor de tu intervalo");
        int intMen=pregunta.nextInt();//intervalo menor
        
        
        int num;
        int temp=0;//para intercambiar los numeros en caso de que el intervalo menor sea mas grande que el mayor
        int suma=0;//para guardar la suma de todos los valores dentro del intervalo
        
        //contadores
        int outside=0;
        int inside=0;
        int same=0;
        
        if (intMen>intMay){//intercambiar los valores en caso de que esten al reves
            temp=intMay;
            intMay=intMen;
            intMen=temp;
        }
        
        while(true){
            System.out.println("Dime un número");
            num=pregunta.nextInt();
            
            if (num==0){//si meten el cero termina el programa 
                break;
            }
            else if (num==intMen || num==intMay){//valores iguales al intervalo
                same=same+1;
            }
            else if (num<intMen || num>intMay){//fuera del intervalo
                outside=outside+1;
            }
            else{//dentro del intervalo
                inside=inside+1;
                suma=suma+num;
            }
        }
        //mensajitos
        System.out.println("En total hay "+outside+" valores fuera del intervalo");
        System.out.println("En total hay "+inside+" valores dentro del intervalo");
        System.out.println("En total hay "+same+" que son iguales a los intervalos");
        System.out.println("La suma de todos los valores dentro del itervalo es: "+suma);
    }
}
