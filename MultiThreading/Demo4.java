package MultiThreading;

public class Demo4 {
    public static void main(String[] args) {

        //Print even no 1 to 100
        Thread t1=new Thread(()->{
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println("T1:"+i);
            }
        }
        } );

     //print odd no 1 to 100
        Thread t2=new Thread(()->{
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println("T2:"+i);
            }
        }
        });

        t1.start();
        t2.start();
    }
}
