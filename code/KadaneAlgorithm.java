import java.util.Scanner;

// BY RISHI HUSTLER

public class KadaneAlgorithm {

    // Kadane's Algorithm to find maximum subarray sum
    static int maxSubArraySum(int[] arr, int n) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < n; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    // Print array
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- KADANE'S ALGORITHM PROGRAM ---");
            System.out.println("1. Find Maximum Subarray Sum");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements: ");
                    int n = sc.nextInt();

                    int[] arr = new int[n];
                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    System.out.print("Array: ");
                    printArray(arr);

                    int maxSum = maxSubArraySum(arr, n);
                    System.out.println("Maximum Subarray Sum: " + maxSum);
                    break;

                case 2:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
