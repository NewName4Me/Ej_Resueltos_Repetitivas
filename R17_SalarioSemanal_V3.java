
package Repetitivos;
import java.util.Random;
import java.util.Scanner;

public class R17_SalarioSemanal_V3 {
   public static void main(String[]args){
       /*
       El problema 16 pero indicando las horas que hiceron cada dia de la semana
       */
        Scanner pregunta=new Scanner(System.in);
        Random random=new Random();
        
        //variables
        int dias=5;//trabajan 5 dias a la semana 
        int horas;
        int numEmpleados;
        int horasSemana=0;
        int salario=10;
        int pagoTotal=0;
        String diita="";//para indicar el dia de la semana
        //int salarioTotal=salario*horasSemana por algun motivo hacer esto y reeemplazarlo por salario*horasSemana no me funciona
        
        //programa
        System.out.println("Cuántos empleados tienes?");
        
        numEmpleados=pregunta.nextInt();
        
        while(numEmpleados>0){//tenemos que ver cada empleado asi que repetimos todo hasta que no quede empleado por analizar
            while(dias>0){//cambie esto a 0 porque si no uno de los dias se lo saltaba directamente
                horas=random.nextInt(8)+1;
                horasSemana=horasSemana+horas;
                switch(dias){//para mostrar el  dias de la semana en funcion del dia en el que estemos
                    case 1:diita="lunes";
                    break;
                    case 2:diita="martes";
                    break;
                    case 3:diita="miercoles";
                    break;
                    case 4:diita="jueves";
                    break;
                    case 5:diita="viernes";
                    break;
                    
                }
                System.out.println("El empleado nº"+numEmpleados+" trbajo el "+diita+ " un total de "+horas+" horas");
                dias=dias-1;
            }
            System.out.println("El empleado nº"+numEmpleados+" trabajó "+horasSemana+" horas esta semana, por tanto hay que pagarle: "+horasSemana*salario);
            pagoTotal=pagoTotal+salario*horasSemana;
            dias=5;//reseteamos los valores dias y horasSemana para que los otros empleados puedan estudiarse correctamente
            horasSemana=0;
            numEmpleados=numEmpleados-1;//contador hacia atras para ver cuantos empleados nos quedan
        }  
        System.out.println("En total debes pagar entre todos tus empleados esta semana: "+pagoTotal);
   } 
}
