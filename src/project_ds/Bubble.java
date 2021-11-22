package project_ds;

public class Bubble {
    
    
   void bubbleSort(int arr[], int x)
    {
   
    for (int i = 0; i < x-1; i++)
            for (int j = 0; j < x-i-1; j++)
               if (arr[j] > arr[j+1])
                {
                   
                  int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
