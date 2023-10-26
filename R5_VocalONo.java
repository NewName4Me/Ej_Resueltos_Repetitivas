package Repetitivos;
import java.util.Scanner;

public class R5_VocalONo {
    public static void main(String[]args){
        /*
        Programa que te indica cada letra que metes si es vocal o no, si introduce el espacio termina
        */
        Scanner pregunta=new Scanner(System.in);

        String letra="";
        
        while(!letra.equals("fin")){//creo que tambien se puede usando el letra.isblank(), pero no me sale bien
            System.out.println("Dime una letra y te dire si es vocal o no, si introduces fin, terminaras");
            letra=pregunta.next();
            
            if ("aeiouAEIOU".contains(letra)){ //forma chachi guay de analizar todas las letras en un lugar de un if con 18 |
                System.out.println(letra+" es una vocal");
            }
            else if (letra.equals("fin")){ //para que termine al pulsar fin
                break;
            }
            else{
                System.out.println(letra+" no es una vocal");
            }
        }
    }
}
