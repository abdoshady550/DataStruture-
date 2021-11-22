package project_ds;

public class Insertion {
    void insertionSort(int arr[],int x)
    {
   
        for (int i = 1; i < x; ++i) {
            int key = arr[i];
            int j = i - 1;
 
          
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
   
    void printArray(int arr[],int x)
    {
         System.out.print("array sorted ={");
        for (int i = 0; i < x; ++i){
            System.out.print(arr[i] + ", ");
        if(i==x-1){
          System.out.print(  "}" );
        }
 
        }
    }
}
