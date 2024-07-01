class Father
{  
    void looks()
    {
        System.out.println("looking");
    }  
    }  
    class Daughter extends Father
    {  
    void behave()
    {
        System.out.println("behaviour");
    }  
    }  
    class Son  extends Father
    {  
    void talk()
    {
        System.out.println("talking");
    }     
    }  
    class HybridInheritance
    {  
    public static void main(String args[])
    {  
    Son s=new Son();  
    s.talk();  
    s.looks();
    Daughter d=new Daughter();
    d.behave();  
    d.looks();  
    }
}  