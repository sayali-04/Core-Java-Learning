class Demo {   //call by value
    void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 10;

        Demo d = new Demo();
        d.change(a);

        System.out.println(a);
    }
}