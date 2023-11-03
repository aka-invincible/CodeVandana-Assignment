
public class usingbruteForce {
    private static void shuffleArray(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            // Swap array[i] and array[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(arr);
        for (int ele : arr)
            System.out.print(ele + " ");
    }
}