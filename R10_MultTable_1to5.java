package Repetitivos;

public class R10_MultTable_1to5 {
    public static void main(String[]args){
        /*
        tabla de multiplicar del 1 al 5
        */
        
        int num=1;//numeros del 1 al 5
        int mult=1;//multiplicador del 1 al 10, si empezara en 0 daria al comienzo 1X0=0 y no nos interesa esa cuenta
        
        
        while(num<=5){
            int res=num*mult;
            System.out.println(num+"X"+mult+"="+res);
            
            mult=mult+1;
            if (mult==11){//como siempre se le suma uno, si llega a 11 que vuelva a 1
                mult=1;
                num=num+1;
            }
            
        }
    }
}
