public class PrintAllElementsOfSubarray {
    public static void printSubarray(int[] arr){
       int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
            }
        }
       }
    }
    public static void main(String[] args){
        int[] array={1,2,3,4};
        printSubarray(array);
    }
}
