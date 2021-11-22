
package project_ds;

import java.util.Scanner;


public class Project_DS_main {
    
    public static void main(String[] args) {
        
       Scanner x = new Scanner(System.in);
       
 //ASk user
        System.out.print(" the size of array = ");
        String y = x.nextLine();
        int n = Integer.parseInt(y);
        System.out.print(" the items of array is { ");
         int[] arr  =new int[n];
        for(int i=0;i<=n-1;i++){
            String z= x.nextLine(); 
            int v=Integer.parseInt(z);
            arr[i]= v;
  
       if(i==n-1){
            System.out.println("}");
       }
      
        }
        
         System.out.println("Please select your fav type of sort: ( 1- Bubble , 2- Insertion"
                 + " ,3- quick ,4- marge 5- Selection, 6- Heap 7- shell )");
     System.out.print("My choice = ");   
             String z= x.nextLine(); 
             int v=Integer.parseInt(z);
             
             
             
             
      switch(v){
            case 1:
        //bubble 
        Bubble ob1 =new Bubble();
        ob1.bubbleSort(arr, n);
        ob1.printArray(arr, n);
        


              break;
            case 2:
    //insertion
     Insertion ob2=new Insertion();
     ob2.insertionSort(arr, n);
      ob2.printArray(arr, n);
        
              break;
              case 3:
       //Quick Sort
             Quick  ob3 =new Quick ();
          ob3.quickSort(arr,0,n-1 );
            ob3.printArray(arr, n);
        
              break;
              case 4:
                  //Merge Sort
              Merge ob4 = new Merge();
              ob4.mergeSort(arr, 0, n-1);
              ob4.printArray(arr, n);
              break;
              case 5:
                  //Selection Sort
              Selection ob5= new Selection();
              ob5.selectionSort(arr, n);
              ob5.printArray(arr, n);
              break;
              case 6:
                  //HEAP SORT
              Heap ob6=new Heap();
              ob6.heapSort(arr, n);
              ob6.printArray(arr, n);
              
              break;
              case 7:
              //Shell Sort
                  Shell ob7 =new Shell();
                  ob7.shellSort(arr, n);
                  ob7.printArray(arr, n);
              break;
           
                
      }
      

        
    }
    
}
