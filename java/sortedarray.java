public class sortedarray {
    public static boolean Printsorted(int array[],int n) {
    if (n == array.length-1){
        return true;
    }
    if(array[n] >= array[n+1]){
        //return Printsorted(array, n+1);
    }else{
        return false;
    }
    return Printsorted(array, n+1);
    
        
    }
    public static void main(String args[]) {
        int array[] = {1,3,3,5,7};
        System.out.println(Printsorted(array, 0));
        
    }
}
