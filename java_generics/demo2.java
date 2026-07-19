package java_generics;

public class demo2 {
    public static void main(String[] args) {
        Box<Integer> b1=new Box(10); //Type Parameter
        Box<String> b2=new Box("Hello");
         Box<Boolean> b3=new Box(true);

        System.out.println(b1.getvalue()+5);
        System.out.println(b2.getvalue()+5);
        System.out.println(b3.getvalue());
        





        

    }
}
class Box <T>{   //Type parameter
  private T value;

  Box(T value){
    this.value=value;
  }

  public T getvalue(){
   return this.value;
  }

  public void setvalue(T value){
    this.value=value;
  }
}
