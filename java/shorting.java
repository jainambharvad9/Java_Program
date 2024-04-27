import org.omg.Messaging.SyncScopeHelper;

public class shorting {
    
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7,1,4,6,2,9,3,5,8,10};


        // // BUBBLE SORT
        //  for(int i=0;i<=arr.length-1;i++){
        //      for(int j=0;j<arr.length-i-1;j++){
        //          if(arr[j]>arr[j+1]){
        //              //swap
        //              int temp = arr[j];
        //            arr[j] = arr[j+1];
        //              arr[j+1] = temp;
        //          }
        //      }
        //  }
        
        // //selection sort
        // for(int i=0;i<=arr.length-1;i++){
        //     int sml =i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[sml] > arr[j]){
        //             sml = j;
        //         }
        //     }
        //     int temp = arr[sml];
        //     arr[sml] = arr[i];
        //     arr[i]   = temp;
        //  }
            
        //insertion sort
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;

            }
            //placement
            arr[j+1] = current; 

        }
            printArray(arr);
       
     }
        
    
}
