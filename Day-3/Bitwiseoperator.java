public class Bitwiseoperator {

    public static void main(String[] args) {
        int a=2;  //32 bits-> 00000000 00000000 00000000 00000010
        int b=3;  //          00000000 00000000 00000000 00000011
        int c=a &b;  //10 ->2
        int d= a | b; //11 ->3
        int e= a^b; //01 ->1
        int f= ~a ; //  11111111 11111111 11111111 11111101->-3

        System.out.println(c +" , "+ d +" , "+ e + " , "+ f + ", ");
        
        //Shift operators
        int g=1; // 00000000 00000000 00000000 00000001 ->1
        g=g<<32; // 32% 32 =0 10000000 00000000 00000000 0000000 ->2

        System.out.println(g);

        //Right shift
        byte h=1; //byte->8 bits -> 00000001
        h=(byte) (h>>1); //         00000000  
        
        System.out.println(h);
    }
}