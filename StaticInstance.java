class Variables
{
   int x;//instance variable
   static int y;//static variable

    }
    class StaticInstance{
        int a;//instance variable
        static int b=100;//static variable
        public static void main(String args[]){
          b=12;//static variable will got the memory within the class or method
            Variables.y=13;
            StaticInstance ob1=new StaticInstance();
            ob1.a=14;//Instance variables will got the memory within the object
            Variables ob2=new Variables();
            ob2.x=15;
            System.out.println("b"+b);
            System.out.println("b="+StaticInstance.b);
            System.out.println("y value="+Variables.y);
            System.out.println("a value="+ob1.a);
            System.out.println("x value="+ob2.x);
        }
    }
