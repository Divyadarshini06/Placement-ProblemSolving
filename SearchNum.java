public class SearchNum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;

        for(int i=0; i<arr.length ; i++){
             if(arr[i] == target){
                System.out.println("Number " + target + " found at index " + i);
                return;
            }
        }

        System.out.println("Number " + target + " not found in the array.");
    }
}