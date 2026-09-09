package MultiThreading;

public class Demo1 {
    
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
    }
}

class Mythread extends Thread{
    @Override 
    public void run(){
        System.out.println("My thread is running");
    }
}

//t1.start()-->JVM ask OS to create thread -->thread get's its stack space and pc
//-->thread excutes the run() method