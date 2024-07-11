package dsa.array;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/description/">...</a>
 * <p>
 * Check if a string is a palindrome.
 * <p>
 * Time Complexity: O(n)
 * <p>
 * The function performs several operations, but the dominant factor is the loop that checks for palindrome characters.
 * This loop iterates through the character array ch (created from the processed StringBuilder) at most n/2 times, where n is the length of the original input string s.
 * In the worst case (a non-palindrome string), the loop will run for the entire length (n).
 * However, for palindromes, the loop might terminate early if a mismatch is found.
 * Since the loop's number of iterations is still bound by n, the time complexity is considered O(n).
 * Other operations like string conversions and character checks are constant-time or have negligible impact on the overall complexity.
 * Space Complexity: O(n)
 * <p>
 * The function creates several temporary objects:
 * StringBuilder sb: To hold the processed characters (potentially up to n characters, depending on the input string).
 * char[] arr: To hold the characters from the trimmed and lowercased string (maximum size n).
 * char[] ch: To hold the characters from the processed StringBuilder (maximum size n).
 * The total space used for these temporary objects scales linearly with the input string length, resulting in an overall space complexity of O(n).
 * Explanation:
 * <p>
 * The function preprocesses the input string to remove non-alphanumeric characters and convert it to lowercase for case-insensitive palindrome checking.
 * It then iterates through the processed characters using a two-pointer approach, comparing characters at the beginning and end.
 * The space complexity is dominated by the temporary character arrays created during the processing and conversion steps, which can potentially hold the entire input string.
 */
class PalindromeString {
    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        System.out.println("result: " + palindromeString.checkIfPalindromeString("A man, a plan, a canal: Panama"));
    }

    boolean checkIfPalindromeString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.trim().toLowerCase().toCharArray();

        for (char c : arr) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        int l = 0;
        int r = sb.length() - 1;

        char[] ch = sb.toString().toCharArray();

        while (l < r) {
            if (ch[l] != ch[r]) return false;
            l++;
            r--;
        }

        return true;
    }
}