public class recursiondemo {

    //print number in decreasing order
    public static void printdec(int n){
     //base call
     if(n==1){
        System.out.print(n);
        return;
     }
        System.out.println(n+ " ");
        printdec(n-1);
        
    }
    
    //print number in increasing order
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        printinc(n-1);
        System.out.println(n);
    }

    //print factorial of n numbers
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn= n * fact(n-1);
        return fn;

    }
    public static void main(String[] args) {
        int n=5;
        // printdec(n);
        // printinc(n);
        System.out.println(fact(n));
    }
}

