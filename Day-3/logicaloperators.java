public class logicaloperators {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=15;

        boolean d= (a<b) & (b<c);

        //short circuit 
        System.out.println(d); //true
    }
}
