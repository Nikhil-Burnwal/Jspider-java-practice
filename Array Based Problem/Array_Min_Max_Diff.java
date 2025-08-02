public class Array_Min_Max_Diff{
    public static void main(String[] args){
        int arr[] = {2, 6, 3, 5, 8, 9, 10};
        if(arr.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        int max= arr[0];
        int min= arr[0];

        for( int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int diff = max- min;

        System.out.println("max element : " + max);
        System.out.println("min element : " + min);
        System.out.println("diff of min and max element : " + diff);
    }
}