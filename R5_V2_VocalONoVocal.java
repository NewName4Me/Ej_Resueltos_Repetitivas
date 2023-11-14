package TareasRandom;
import java.util.*;

public class R5_V2_VocalONoVocal {
    public static void main(String[]args){
        /*
        La actividad numero 5 de repetitivas pero quiere que metamos todos de una en lugar de letra a letra
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables chachis
        ArrayList<String> vocales=new ArrayList<>();
        ArrayList<String> consonantes=new ArrayList<>();
        
        //variables
        String letra="";
        int longLetra;
        char caracterLetra;
        String cartConvert;
        
        //programa
        System.out.println("Dime todas tus letras a estudiar");
        letra=scanner.nextLine();
        
        longLetra=letra.length();//para saber cuantas letras tenemos en total
        
        for(int i=0;i!=longLetra;i++){//un bucle que mira todos los caracteres desde el comienzo hasta el final
            
            caracterLetra=letra.charAt(i);
            cartConvert=Character.toString(caracterLetra);//lo convierto a String poruqe el metodo contains es solo para string
            
            if("aeiouAEIOU".contains(cartConvert)){//distinguimos si es o no vocal
                //System.out.println(cartConvert+" es una vocal");
                if(!vocales.contains(cartConvert)){//me aseguro de que no se repitan vocales
                    vocales.add(cartConvert);
                }  
            }
            else{
                //System.out.println(cartConvert+" es una consonante");
                if(!consonantes.contains(cartConvert)){//me aseguro que no se repitan consonantes
                    consonantes.add(cartConvert);
                }

            }
        }//fin del for
        scanner.close();
        
        //salida
        System.out.println("Has introducido las siguiente vocales: "+vocales);
        System.out.println("Has introducido las siguientes no vocales: "+consonantes);
        


    }
}
