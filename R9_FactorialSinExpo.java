package Repetitivos;
import java.util.Scanner;

public class R9_FactorialSinExpo {
    public static void main(String[]args){
        /*
        Programa que calcula la potencia en funcion de una base y expoenente
        sin utilizar el elevado ^
        Basicamente:
        2^3=8 NOOOO
        2*2=4...4*2=8 Síííiíí
        */
        
        Scanner pregunta=new Scanner(System.in);
        
        int base=pregunta.nextInt();
        int expo=pregunta.nextInt();
        int resul=1;
        int expoSave=expo;//solo sirve para hacer bonito el mensaje de salida, guarda el valor orginial del exponente
        
        while(expo>0){//exponente sirve como contador en este caso mas que como exponente
            resul=resul*base;
            expo=expo-1;
        }
        System.out.println(base+"^"+expoSave+"="+resul);
    }
}
