package java_generics;

public class demo1 {
    public static void main(String[] args) {
        // Box b1=new Box(10);
        // System.out.println(b1.getvalue());

        Box b1=new Box(10);
        Box b2=new Box("Hello");
        Box b3=new Box(true);

       // System.out.println(b2.getvalue());

        //To perform specific operations we do Downcasting
        Integer x=(Integer)b1.getvalue();
        String s=(String)b2.getvalue();
        Boolean b=(Boolean)b3.getvalue();

        System.out.println(x+5);
        System.out.println(s+5);
        

    }
}
/* 
class Box{
    private int value;
    Box(int value){
        this.value=value;
    }
  public int getvalue(){
    return this.value;
  }
  public void setvalue(){
    this.value=value;
  }
}  */

//Solution to this is ->Object class
class Box{
  private Object value;

  Box(Object value){
    this.value=value;
  }

  public Object getvalue(){
   return this.value;
  }

  public void setvalue(Object value){
    this.value=value;
  }
}