public class Array_Min{
    public static void main(String[] args){
        int arr[] = {2, 6, 3, 5, 8, 9, 10};
        if(arr.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        int min= arr[0];

        for( int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("min element : " + min);
    }
}