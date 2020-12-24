import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 4, 5, 6, 7, 8, 9};
        int x = 10;

        System.out.println( Arrays.stream(arr).count());
    }
}
