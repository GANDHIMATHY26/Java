class Solution {
    static int arraySum(int arr[]) {
        int sum=0;
        int size=arr.length;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Sum of array elements: "+arraySum(arr));
    }
}



