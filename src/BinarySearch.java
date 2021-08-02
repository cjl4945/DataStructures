import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int min = 0, max = arr.length-1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (arr[mid] == target) {
                return arr[min];
            }
            if (arr[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int ar[] = { 2, 3, 4, 10, 40,100,255,345,650,1000 };

        int item = 255;
        int ans = binarySearch(ar, item);
        if (ans == -1)
            System.out.println("Element not present");
        else
            System.out.println("answer: "+ans);
    }
        }

