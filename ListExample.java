import java.util.ArrayList;
import java.util.List;
public class ListExample{
    public static void main(String args[]){
        List<Integer> a1=new ArrayList<Integer>();
        a1.add(0,100);
        a1.add(1,200);
        System.out.println(a1);
        List<Integer> a2 =new ArrayList<Integer>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a1.addAll(1,a2);
        System.out.println(a1);
        System.out.println(a1);
        System.out.println(a1.get(4));
        System.out.println(a1);
        a1.set(0,6);
        a1.add(1,50);
        a1.remove(2);
        System.out.println(a1);
    }
}