import java.util.ArrayList;
public class Collections{
    public static void main(String args[]){
        ArrayList<String>names=new ArrayList<String>();
        names.add("shirisha");
        names.add("honey");
        names.add("yashu");
        for(String n:names){
            System.out.println(n);
        }
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.add(20);
        num.add(40);
        num.add(50);
        for(Integer n:num){
            System.out.println(n);
        }
    }
}