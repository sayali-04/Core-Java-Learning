public class iterative_smt {

    public static void printsquarepattern(){
        for(int i=0; i<4;i++){
            for(int j=1; j<=4;j++){
                System.out.print("*");
            }
                 System.out.println();
        }
    }

    public static void printsquarenumber(){
        for(int i=1; i<=4;i++){
            for(int j=1; j<=4;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }

    public static void increasetriangle(){
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void continoustriangle(){
        int num=1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    
    public static void pyramidpatt() {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // printsquarepattern();
        // printsquarenumber();
        // increasetriangle();
        continoustriangle();
        pyramidpatt();
      
    }
}