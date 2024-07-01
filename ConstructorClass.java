
public class ConstructorClass{
    public static void main(String args[]){
        StudentConstructor s1=new StudentConstructor("siri",100);
        StudentConstructor s2=new StudentConstructor("anu",100);
    System.out.println(s1.name+" "+s1.rollno+" r"+StudentConstructor.college);
    System.out.println(s2.name+" "+s2.rollno+" "+StudentConstructor.college);  
}

}