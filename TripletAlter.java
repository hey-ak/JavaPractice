public class TripletAlter{
    public static void main(String args[]){
        int arr [] = {1,2,3,4,5};
        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                for( int k =0; k<arr.length; k++){
                    if(sum == arr[k]){
                        count++;
                    }
                }
                
            }
        }
       
        System.out.println(count);
    }
}