package TareasRandom;
import java.util.*;

public class R5_V2_VocalONoVocal {
    public static void main(String[]args){
        /*
        La actividad numero 5 de repetitivas pero quiere que metamos todos de una en lugar de letra a letra
        
        Explicacion de como funciona indexOf...basicamente indica la posicion de un caracter en cadena
        o palabra o elemento en array(no estoy tan seguro de esto ultimo), en caso de que el elemento que metamos
        no cumpla la condicion previa, es decir no este en nuestro string, nos duvuelve -1
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables chachis
        ArrayList<Character> vocales=new ArrayList<>();
        ArrayList<Character> consonantes=new ArrayList<>();
        ArrayList<Character> numeros=new ArrayList<>();
        ArrayList<Character> simbolos=new ArrayList<>();
        
        //variables
        String letra="";
        int longLetra;
        char caracterLetra;
        
        //programa
        System.out.println("Dime todas tus letras a estudiar");
        letra=scanner.nextLine();
        
        longLetra=letra.length();//para saber cuantas letras tenemos en total
        
        for(int i=0;i!=longLetra;i++){//un bucle que mira todos los caracteres desde el comienzo hasta el final
            
            caracterLetra=letra.charAt(i);
            
            if("aeiouAEIOU".indexOf(caracterLetra)!=-1){//distinguimos si es o no vocal
                //System.out.println(cartConvert+" es una vocal");
                if(!vocales.contains(caracterLetra)){//me aseguro de que no se repitan vocales
                    vocales.add(caracterLetra);
                }  
            }
            else if("123456789".indexOf(caracterLetra)!=-1){//distinguimos numeros
                if(!numeros.contains(caracterLetra)){
                    numeros.add(caracterLetra);
                }
            }
            else if("qwrtypsdfghjklñzxcvbnmQWRTYPSDFGHJKLÑZXCVBNM".indexOf(caracterLetra)!=-1){//distinguimos consonantes
                if(!consonantes.contains(caracterLetra)){
                    consonantes.add(caracterLetra);
                }
            }
            else{//todo lo que no sean numeros ni letras
                //System.out.println(cartConvert+" es una consonante");
                if(!simbolos.contains(caracterLetra)){
                    simbolos.add(caracterLetra);
                }

            }
        }//fin del for
        scanner.close();
        
        //salida
        System.out.println("Has introducido las siguiente vocales: "+vocales);
        System.out.println("Has introducido las siguientes no vocales: "+consonantes);
        System.out.println("Has introducido los siguientes numeros: "+numeros);
        System.out.println("Has introducido los siguientes simbolos: "+simbolos);
    }
}
