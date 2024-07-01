public class Static{
    int a;
    static int b;
    public static void main(String args[]){
        Static.b=20;
        System.out.println("b value="+Static.b);
    }
}