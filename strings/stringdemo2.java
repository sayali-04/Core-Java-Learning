package strings;

public class stringdemo2 {
    public static void main(String[] args) {
        String s1="ja"+ "va"; //java at compile time
        String s2=s1;

        //System.out.println(s1==s2); //true
        
        String s3="hello";
        String s4=s3+"world";
        String s5="Hello world";

       // System.out.println(s3==s4); //false
      //  System.out.println(s4==s5);//false

       String s6="Hello";
       String s7=s6;

       //System.out.println(s6==s7); //True

       String s8="Hello";
       s8="world";
       
      // System.out.println(s8);//world

      String s9=new String("Hello");
      String s10="Hello";
      
      System.out.println(s9==s10); //false



    }
    
}
