package Module7;
import java.util.Scanner;
public class LinearSearchandBinarySearch {

        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 40, 50};
            int key;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter element to search:");
            key = sc.nextInt();

            // Linear Search
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("Linear Search: Element found at position " + (i + 1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Linear Search: Element not found");
            }

            // Binary Search
            int low = 0, high = arr.length - 1, mid;
            found = false;

            while (low <= high) {
                mid = (low + high) / 2;

                if (arr[mid] == key) {
                    System.out.println("Binary Search: Element found at position " + (mid + 1));
                    found = true;
                    break;
                }
                else if (arr[mid] < key) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            if (!found) {
                System.out.println("Binary Search: Element not found");
            }
        }
    }
