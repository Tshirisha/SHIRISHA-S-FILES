public class CopyArray
{
 public static void main(String args[]){
    
 //intialize array   
int[] arr1=new int[]{5,20,25,30};
/*copy first array to second     
array with size of first array*/
int[] arr2=new int[arr1.length];
/*copying all elements of one 
array to another*/
for(int i=0; i<arr1.length;i++)
{
arr2[i]=arr1[i];
}
//display elements of first array
System.out.println("Elements of First Array:");
for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i]+"");
}
System.out.println();
//display  elements of second array
System.out.println("Elements of second Array:");
for(int i=0;i <arr2.length;i++){
    System.out.print(arr2[i]+"");
}
}
}