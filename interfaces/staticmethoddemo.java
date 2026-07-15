public class staticmethoddemo {
    public static void main(String[] args) {
        int result= mathex.square(5);
        System.out.println(result);
    }
}
interface mathex{
    static int square(int x){
        return x*x;
    }
    static int cube(int x){
        return x*x*x;
    }
}
