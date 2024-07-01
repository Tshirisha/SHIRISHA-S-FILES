public class PassByReference{
    public static void main(String args[]){
        Student stu=new Student();
        System.out.println(stu);
        System.out.println(stu.name+ " "+stu.roll);
        stu.name="siri";
        stu.roll=1;
    System.out.println(stu.name+ " "+stu.roll);
    Student stu1;
    stu1=stu;
    System.out.println(stu.name+" "+stu.roll);
    stu1.name="harika";
    stu1.roll=2;
    System.out.println(stu1.name+ " "+stu1.roll);
    System.out.println(stu.name+ " "+stu.roll);
    }
}