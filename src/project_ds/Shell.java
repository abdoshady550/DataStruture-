
package project_ds;

public class Shell {
    int shellSort(int arr[],int n)
    {
 
        
        for (int gap = n/2; gap > 0; gap /= 2)
        {
          
            for (int i = gap; i < n; i += 1)
            {
               
                int temp = arr[i];
 
                
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
 
             
                arr[j] = temp;
            }
        }
        return 0;
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

    

