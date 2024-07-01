public class EvenNumEx
{
    public static void main(String args[])
    {
        int number=30;
        System.out.println("Even numbers from 20 to"+number+":-");
        for(int i=20;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(i +"");
            }
        }
    }
}