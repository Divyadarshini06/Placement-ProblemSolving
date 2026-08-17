import java.util.Arrays;

public class SearchMissEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println("Missing element is: " + (arr[i] + 1));
                return;
            }
        }
        System.out.println("No missing element found.");
    }
}