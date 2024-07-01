class GreatGrandMother{  
    void looks()
    {
        System.out.println("looking");
    }  
    }  
    class  GrandMother extends GreatGrandMother
    {  
    void cooks()
    {
        System.out.println("cooking");}  
    }  
    class Mother extends GrandMother
    {  
    void works()
    {
        System.out.println("working");
    }  
    }  
    class MultilevelInheritance
    {  
    public static void main(String args[])
    {  
    Mother m=new Mother();  
    m.works();  
    m.cooks();  
    m.looks();  
    }
}  