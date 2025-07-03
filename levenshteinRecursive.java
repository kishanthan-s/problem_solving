public class Main {
    public static void main(String[] args) {
        System.out.println(levenshteinRecursive("books", "book", 5, 4));
    }

    public static int levenshteinRecursive(String str1, String str2, int m, int n) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return levenshteinRecursive(str1, str2, m - 1, n - 1);
        }

        return 1 + Math.min(
            levenshteinRecursive(str1, str2, m, n - 1), // Insert
            Math.min(
                levenshteinRecursive(str1, str2, m - 1, n),     // Remove
                levenshteinRecursive(str1, str2, m - 1, n - 1)  // Replace
            )
        );
    }
}
