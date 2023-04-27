import java.util.*;
public class UnsortedArray{
    public static void main(String args[]){
        int arr[] = {25,1,3,6,78,9};
        int x =0;
        int copyarr[] = Arrays.copyOf(arr,arr.length);
        
        Arrays.sort(copyarr);
        
        for(int i =copyarr.length-1; i>=0; i--){
            
            for(int j =0; j<arr.length; j++){
                if(arr[j]==copyarr[i]){
                    System.out.print(j+" ");
                }
            }
            
        }
        
        
        
    }
}