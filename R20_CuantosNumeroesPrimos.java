package Repetitivos;
import java.util.Scanner;

public class R20_CuantosNumeroesPrimos {
    public static void main(String[]args){
        /*
        Progrma donde indicas la cantidad de números primos que quieres ver
        mostrando una lista del 1 en adelante
        */
        Scanner pregunta= new Scanner(System.in);
        
        //variables
        int cuantosNum;
        int num=0;//para imprimir cada numeor que sea primo
        
        //Programa
        System.out.print("Cuántos números primos quieres ver? ");
        cuantosNum=pregunta.nextInt();
        System.out.println("Aquí tienes");
        
        while(cuantosNum!=0){//una vez hayamos impreso los numeros deseados termina
            num=num+1;
            if (num==1 || num==2 || num==3 || num==5 || num==7 || num==11 || num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0 && num%11!=0){//todas las circunstancias para que sea primo
                cuantosNum=cuantosNum-1;
                System.out.println(num);
            }
        }
        
    }
}
