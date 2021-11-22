package project_ds;

/**
 *
 * @author abdos
 */
public class Heap {
      public void heapSort(int arr[],int n)
    {
      
 
      
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        
        for (int i = n - 1; i > 0; i--) {
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
         
            heapify(arr, i, 0);
        }
    }
 

    void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
     
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
    
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
     
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
         
            heapify(arr, n, largest);
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
