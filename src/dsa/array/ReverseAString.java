package dsa.array;

/**
 * Implement a function to reverse a string.
 */
public class ReverseAString {

    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        reverseAString.reverseString("hello");
        reverseAString.reverseString("reverse");
    }

    /**
     * <p>
     * Time Complexity: O(n)
     * <p>
     * The function iterates through the character array arr using a while loop.
     * In each iteration, it performs constant-time operations like variable assignments (l++, r--), character comparisons (l < r), and character swaps (arr[l] = arr[r]).
     * The number of iterations is directly proportional to the length of the input string s. Let n be the length of s.
     * Since the number of iterations scales linearly with n, the time complexity is considered O(n).
     * <p>
     * Space Complexity: O(n)
     * <p>
     * The function creates a new character array arr of size n to hold the characters from the input string s.
     * This additional memory allocation is independent of any input values or function calls within reverseString.
     * Therefore, the space complexity is considered O(n) due to the creation of the character array.
     * Explanation:
     * <p>
     * The two-pointer approach efficiently reverses the characters in-place within the arr array.
     * However, creating a new character array results in additional memory usage that scales linearly with the input string length.
     */
    void reverseString(String s) {
        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            char ch = arr[l];
            arr[l] = arr[r];
            arr[r] = ch;
            l++;
            r--;
        }
        System.out.println("Reversed String: " + new String(arr));
    }
}
