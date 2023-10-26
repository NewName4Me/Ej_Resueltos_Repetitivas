package Repetitivos;
import java.util.Scanner;

public class R15_ElDobleCadaMes {
    public static void main(String[]args){
        /*
        Programa en el cual intrudicimos cuanto hemos pagado un mes
        y a sabiendas de este hace que cada mes peguemos el doble del anterior
        hasta haber estado pagando durante 20 meses
        */
        Scanner pregunta=new Scanner(System.in);
        
        //variables
        int pago;
        int sumaPagos=0;
        int meses=0;//contador de los meses a pagar
        
        pago=pregunta.nextInt();
        
        while(meses<20){
            meses=meses+1;
            System.out.println("El mes nº "+meses+" pagaras: "+pago);
            pago=pago*2;//cada mes se dupplica el pago
            sumaPagos=sumaPagos+pago;//almacenar pago total
        }
        System.out.println("Al final de los 20 meses pagaras: "+sumaPagos);
        
    }
}
