class Mother{
    void looks()
    {
        System.out.println("looking");
    }
}
class Daughter extends Mother
{
    void talk()
    {
        System.out.println("talking");
    }
}
class SingleInheritance
{
    public static void main(String args[])
    {
     Daughter d=new Daughter();
     d.talk();
     d.looks();
    }
}