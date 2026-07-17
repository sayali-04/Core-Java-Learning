package strings;

public class stringbuilderdemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Sayali"); //SayaliPawar
        sb.append("Pawar");
        sb.append("Engineer");

        //6 + 5 + 8= 19--- greater than inital capacity so its doubles 16*2+2=34

        // //insert
         sb.insert(2, 'i'); //SaiyaliPawar
         System.out.println(sb);

        // //delete
         sb.delete(0, 2);
         System.out.println(sb); //iyaliPawar

        // //deletecharAt
        sb.deleteCharAt(1); //ialiPawar
        System.out.println(sb);

        //replace
        sb.replace(1, 3,"XY");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.charAt(1);
        sb.setCharAt(1,'P');

       System.out.println(sb.length());

       System.out.println(sb.capacity());

        sb.ensureCapacity(100);
       System.out.println(sb.capacity());

       sb.trimToSize();
       System.out.println(sb.capacity());
    }
}
