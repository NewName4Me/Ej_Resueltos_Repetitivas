package Repetitivos;
import java.util.Random;

public class R13_SalarioSemanal_V1 {
    public static void main(String[]args){
        /*
        A sabiendas de las horas que hace un trabajador a la semana calcular su salario
        */
        Random random=new Random();
        
        int horasDiarias;
        int sueldoHora=10;
        int diasTrabajo=0;//contador que va de 1 dia hasta 6(trabaja 6 dias a la semana)
        int horasSemana=0;//sumatoria de las horas hechas a diario con la variable horasDiarias
        
        
        while(diasTrabajo<6){
            diasTrabajo=diasTrabajo+1;
            horasDiarias=random.nextInt(8)+1;//se lo asigno al azar por no introducir yo los datos
            horasSemana=horasSemana+horasDiarias;//almacena las horas diarias 
            System.out.println("El día nº "+diasTrabajo+" curraste "+horasDiarias+" horas");
        }
        int sueldoSemanal=sueldoHora*horasSemana;//para calcular tu salario total de la semana
        System.out.println("En total hiciste "+horasSemana+" horas esta semana. Por tanto tu sueldo es de "+sueldoSemanal);
    }
}
