package Module9;

public class SubsetsSetNumber {
    static void generateSubsets(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        generateSubsets(arr, index + 1, current);
        generateSubsets(arr, index + 1, current + arr[index] + " ");
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        generateSubsets(arr, 0, "  ");
    }
}
