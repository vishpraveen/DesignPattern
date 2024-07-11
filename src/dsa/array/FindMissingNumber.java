package dsa.array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Find the missing number in an array of 1 to N.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{1, 2, 3, 0, 5};

        FindMissingNumber findMissingNumber = new FindMissingNumber();
        System.out.println(
                "Missing number using hashing is: " + findMissingNumber.findMissingNumberUsingHashMap(n, arr)
        );

        System.out.println(
                "Missing number using math formula: " + findMissingNumber.findMissingNumberUsingMathsFormula(n, arr)
        );

        System.out.println(
                "Missing number using XOR: " + findMissingNumber.findMissingNumberUsingXOR(n, arr)
        );
    }

    /**
     * has time and space complexity issue.
     */
    int findMissingNumberUsingHashMap(int n, int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i + 1, false);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (map.containsKey(arr[i + 1])) {
                map.put(arr[i + 1], true);
            }
        }

        AtomicInteger num = new AtomicInteger();

        map.forEach((key, value) -> {
            if (!value) {
                num.set(key);
            }
        });

        return num.get();
    }

    /**
     * has overflow issue
     */
    int findMissingNumberUsingMathsFormula(int n, int[] arr) {
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;
    }

    /**
     * resolves the overflow issue
     *
     * @param arr integer array
     * @param n   size of array
     */
    int findMissingNumberUsingXOR(int n, int[] arr) {
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            System.out.println("XOR for loop1: " + xor);
        }

        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
            System.out.println("XOR for loop2: " + xor);
        }
        return xor;
    }
}
