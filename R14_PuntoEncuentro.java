package Repetitivos;
import java.util.Scanner;

public class R14_PuntoEncuentro {
    public static void main(String[]args){
        /*
        Dime el km en el que se encuentra dos coches que van en direcciones opuestas
        y su velocidad y te digo en que punto se van a encontrar
        */
        
        Scanner pregunta= new Scanner (System.in);
        
        
        //variables
        //todas son dobles debido a que cuando las hice int falle al calcular el tiempo porque no me llevo decimal
        double x1;
        double x2;
        double v1;
        double v2;
        double tiempoEncuentro;
        double posicionEncuentro;
        double temp;//en caso de que x1 sea mayor que x2, se usa para intercambiar su valor
        
        //programa
        System.out.println("Kilómetro del primero");
        x1=pregunta.nextDouble();
        System.out.println("Velocidad del primero");
        v1=pregunta.nextDouble();
        System.out.println("Kilómetro del segundo");
        x2=pregunta.nextDouble();
        System.out.println("Velocidad del segundo");
        v2=pregunta.nextDouble();
        
        /*
        para calcular el tiempo y la posicion de encuentro de encuentro tenemos que ver cual está en el km más 
        alejado para que en los calculos fisicos no nos de resultado o negativo
        o simplemente darle valor absoluto
        */
        
        if (x1>x2){//en caso de que nos los den al reves los cambia de posición
            temp=x1;
            x1=x2;
            x2=temp;
        }
        //pura física de MRU
        tiempoEncuentro=((x2-x1)/(v1+v2));
        posicionEncuentro=v1*tiempoEncuentro+x1;
        
        System.out.println("Los coches se encontrarán en el km "+ posicionEncuentro);
    }
}
