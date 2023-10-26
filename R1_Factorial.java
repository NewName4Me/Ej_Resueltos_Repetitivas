package Repetitivos;
import java.util.Scanner;

public class R1_Factorial {
    
    public static void main(String[]args){
        //Programa donde el usuario mete cualquier número y le damos el factorial
        Scanner pregunta=new Scanner(System.in);
        
        System.out.println("Dime un número entero y te dire su factorial");
        int num=pregunta.nextInt();//preguntamos al usuario cualquier número
        
        int fact=1;//para almacenar nuestro resultado
        int numSave=num; //para guardar el valor de num y poder indicar al final cual era el orignial;
        
        while (num>1){
            
            fact=fact*num;
            num=num-1;  
        }
        
        if (num>=0){ //para comprobar si me meten un numero inferior a 0, si no lo hago aunque sea negativo me dara 1 
            System.out.println(numSave+" factorial("+numSave +"!) es igual a "+fact);
        }
        else{
            System.out.println("Error no existen factoriales de numeros inferiores a 0");
        }
        
    }
}
