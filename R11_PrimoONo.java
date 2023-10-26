package Repetitivos;
import java.util.Scanner;

public class R11_PrimoONo {
    public static void main(String[]args){
        /*
        Programa donde metamos numeros y nos diga si son o no primos
        cuando introduzcamos el cero termina el programa
        */
        
        Scanner pregunta= new Scanner(System.in);
        
        int num;
        
        do{
            System.out.println("Dame un número");
            num=pregunta.nextInt();
            
            if (num==0){//forma mas comoda de finalizar el bucle para que no me diga que el 0 no es primo
                break;
            }
            
            if (num%2==0 || num%3==0 || num%5==0 || num%7==0 || num%11==0){//todos los divisibles entre estos no son primos
                if (num==1 || num==2 || num==3 || num==5 || num==7 || num==11){//salvo estos mismo que si que lo son por eso los divido asi
                    System.out.println("Primo");
                }
                else{
                    System.out.println(" No Primo");
                }
            }
            else{
                System.out.println("Primo");
            }
            
        }while(num!=0);//podria cambiarlo por un true ya que finaliza con el break de arriba pero lo dejo para que se entienda sin tener que buscar esta línea
    }
}
