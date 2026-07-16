package strings;

public class stringmethoddemo {
    public static void main(String[] args) {
        String s1=new String("Aditya"); //97+98+99=
        String s2=new String("abd");

        //Emptiness/Length

        // System.out.println(s1.length()); //0
        // System.out.println(s1.isEmpty()); //true
        // System.out.println(s1.isBlank()); //true

        //character access
        //System.out.println(s1.charAt(2)); 
        //char[] arr=s1.toCharArray();


        //comaprison
        //System.out.println(s1.equals(s2)); //False
       // System.out.println(s1.equalsIgnoreCase(s2)); //true

        //lexicograhical comaparison <--- Dictionary
        //System.out.println(s1.compareTo(s2)); 

        //Searching
        // System.out.println(s1.contains("ity"));  //true
        // System.out.println(s1.indexOf('i')); //2
        // System.out.println(s1.lastIndexOf("ity")); //2
        // System.out.println(s1.startsWith("Ad")); //true

        //Extraction or Transformation
        // System.out.println(s1.substring(1,4));//dit
        // System.out.println(s1.substring(1));  //ditya
        // System.out.println(s1.toUpperCase()); //ADITYA
        // System.out.println(s1.toLowerCase()); //aditya
        // System.out.println(s1.trim()); 
        // System.out.println(s1.strip()); //unicode friendly
        // System.out.println(s1.repeat(3)); //AdityaAdityaAditya
        // System.out.println(s1.replace('A','N'));//Nditya
        // // System.out.println(s1.replace("ity","abc"));//Adabca
        // System.out.println(s1.replaceAll("Ad","ab")); //abitya

        //Spliting & joining
        // String s3="Aditya,Rohan,Summit";
        // String[] arr=s3.split(",");
        // for(String s:arr){
        //     System.out.println(s);
        // }

        // System.out.println(String.join("-","a","b","c"));  //a-b-c

        //Conversion
        // String s4=new String(String.valueOf(10));
        // System.out.println(s4);

        // byte[] arr =s1.getBytes();
        // for(byte i:arr){
        //     System.out.print(i + ","); //65,100,105,116,121,97,
        // }

       // Advance pool-related  methods
       //intern()
    //    String s5=new String("Hello");
    //    String s6=s5.intern();
    //    System.out.println(s5==s6);

       //format()
       String name="Aditya";
       int age=18;

        // Using String Concatenation
        System.out.println("Hello " + name + ", your age is " + age);

        // Using String.format()
        System.out.println(String.format("Hello %s, your age is %s", name, age));
       //output:Hello Aditya, your age is 18
            //  Hello Aditya, your age is 18











    }
    
}
