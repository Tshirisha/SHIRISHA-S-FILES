public class ArrayMinEx
{
        static void min(int arr[]){
            int minNum=arr[0];//80
            for(int i=1;i<arr.length;i++){
                 if(minNum > arr[i]){
                 minNum = arr[i];
                 }
            }
        System.out.println(minNum);
        }
        public static void main(String args[]){
            int array[]={80,60,30};
            min(array);//passing array to method
        }
    }
