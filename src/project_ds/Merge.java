package project_ds;

/**
 *
 * @author abdos
 */
public class Merge {
    void merge(int arr[], int l, int m, int r)
    {
      
        int n1 = m - l + 1;
        int n2 = r - m;
 
       
        int L[] = new int[n1];
        int R[] = new int[n2];
 
  
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        
        int i = 0, j = 0;
 
      
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
             else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
      
         while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
      }
 
      while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
   }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
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