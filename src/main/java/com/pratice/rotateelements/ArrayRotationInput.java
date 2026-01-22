package com.pratice.rotateelements;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotationInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get Array Size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Get Array Elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Get Rotation Count (k)
        System.out.print("Enter number of rotations (k): ");
        int k = scanner.nextInt();

        // 4. Perform Rotation
        rotate(arr, k);

        // 5. Print Result
        System.out.println("Rotated Array: " + Arrays.toString(arr));

        scanner.close();
    }

    // --- Logic for Right Rotation ---
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;

        int n = nums.length;
        // Optimization: reduce k if it's larger than array size
        k = k % n;

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the rest
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
