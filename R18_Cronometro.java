package Repetitivos;
import java.util.concurrent.TimeUnit;//esto es para el tiempo

/*
throws InterruptedException{
Hace que el main no controle de forma directa el flujo del programa
si no que le pasara la responsabilidad de esto al entorno de ejecución, lo cual es 
necesario para poder hacer que el programa pare o espere por cierto tiempo
*/
public class R18_Cronometro {
    public static void main(String[]args)throws InterruptedException{
        int segundos=0;
        int minutos=0;
        int horas=0;
        
        while(true){
            segundos=segundos+1;
            
             TimeUnit.SECONDS.sleep(1);//que espere un segundo
                    
            if (segundos==60){
                minutos=minutos+1;
                segundos=0;
            }
            if (minutos==60){
                horas=horas+1;
                minutos=0;
            }
            
            clearScreen();
            System.out.print(horas+".");
            System.out.print(minutos+".");
            System.out.print(segundos);
            
        }
    }
    
    //esto es una forma de simular una limpieza de pantalla dado que no se puede hacer de forma directa
    public static void clearScreen(){ 
        int i=0;
        while (i!=50){
            i=i+1;
            System.out.println();
        }
    }
}
