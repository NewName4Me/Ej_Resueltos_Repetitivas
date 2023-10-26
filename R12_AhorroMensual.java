package Repetitivos;
import java.util.Random;

public class R12_AhorroMensual {
    public static void main(String[]args){
        /*
        un programa donde el usuario ahorra una cantidad aleatoria entre 250 y 1 al mes
        y calculamos su ahorro anual en funcion de este randomizado
        */
        Random random=new Random();
        
        int sum=0;//calcular el ahorro anual
        int i=0;//contador de meses
        int num;
        
        while (i<12){//doce meses del año
            i=i+1;
            num=random.nextInt(250)+1;//no me apetecia poner cuanto ahorra cada mes a mano asi que al azar
            sum=sum+num;
            System.out.println("El mes nº"+i+" ahorro un total de "+num);
        }
        System.out.println("Al final del año ahorraste un total de: "+sum);
    }
}
