package Repetitivos;
import java.util.Scanner;
import java.util.Random;

public class R16_SalarioSemanal_V2 {
    public static void main(String[]args){
        /*
        Programa donde indicamos el numero de empleados que tenemos 
        y sabiendo (lo hare al azar por rapidez) las horas que trabajan cada uno a la semana
        calcular el sueldo que debo a cada uno y el total
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
        //int salarioTotal=salario*horasSemana por algun motivo hacer esto y reeemplazarlo por salario*horasSemana no me funciona
        
        //programa
        System.out.println("Cuántos empleados tienes?");
        
        numEmpleados=pregunta.nextInt();
        
        while(numEmpleados>0){//tenemos que ver cada empleado asi que repetimos todo hasta que no quede empleado por analizar
            while(dias>1){//trabajan cinco dias a la semana por lo que tenemos que ver las horas diarias una a una
                horas=random.nextInt(8)+1;
                horasSemana=horasSemana+horas;
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
