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
            
        }//fin del while

        /*
        Utilizando un for en lugar de un while sería así:

                Scanner scanner=new Scanner(System.in);
        
                //variables
                int num=0;
                int mult=0;
                int res;//resultado del producto entre num y mult
                
                //programa
                for(int i=0;i<5;i++){//delimita la tabla del 1 al 5
                    num++;
                    System.out.println("Tabla del "+num);
                    
                    for(int j=0;j<10;j++){//multiplica del 1 al 10
                        mult++;
                        res=num*mult;
                        System.out.println(num+"X"+mult+"="+res);
                    }
                    
                    mult=0;
                    System.out.println("");//liena espaciadora
                }
        */
    }
}
