package project_ds;


public class Selection {
    void selectionSort(int arr[],int n)
    {
        
 
        
        for (int i = 0; i < n-1; i++)
        {
           
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
           
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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