class StaticBlock{
    static int a = 5;
    static int b =10;
    static {
        System.out.println(a);
        System.out.println(b);
         a =10;
         b=20;
         System.out.println("static block");
         System.out.println(a);
         System.out.println(b);

    }
    static void staticMethod(){
         a =40;
         b=50;
         System.out.println("static method");
         System.out.println(a);
         System.out.println(b);

    }
    public static void main(String args[]){
        int a=60;
         int b=70;
        System.out.println("Main Method");
        System.out.println(a);
        System.out.println(StaticBlock.a);
        System.out.println(b);
        System.out.println(StaticBlock.b);
        staticMethod();
    }
}