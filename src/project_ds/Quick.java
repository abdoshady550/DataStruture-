package project_ds;


 class Quick {
   
 int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
           
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
  
        return i+1;
    }
  
  
   
    void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            
            int pi = partition(arr, low, high);
  
         
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
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