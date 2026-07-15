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

    //fibonacci series
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
       int fnm1=fibonacci(n-1);
       int fnm2=fibonacci(n-2);
       int fn=fnm1 + fnm2;
       return fn;
    }
 //to check array is sorted or not
      public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }
    public static void main(String[] args) {
        // int n=5;
        // printdec(n);
        // printinc(n);
        // System.out.println(fact(n));
        // System.out.println(fibonacci(n));
          int arr[] = {1, 2, 3, 4};
        System.out.println(isSorted(arr, 0));
    }
}

