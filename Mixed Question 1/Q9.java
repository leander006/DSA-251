class Q9 {
    /*
	Time complexity: O(N)
	Space complexity: O(1)

	Where 'N' is the length of the string.
*/
    public static int minimumOperations(String a, String b) {

        if (a.length() != b.length()) {
            return -1;
        }

        // Length of the given string.
        int n = a.length();

        // To store the required answer.
        int count = 0;

        char c1, c2, c3, c4;

        // Run a loop upto 'n'/2.
        for (int i = 0; i < n / 2; i++) {

            c1 = a.charAt(i);
            c2 = a.charAt(n - i - 1);
            c3 = b.charAt(i);
            c4 = b.charAt(n - i - 1);

            // Cases that doesn't require any preprocessing move.
            if ((c1 == c2 && c3 == c4) || (c1 == c3 && c2 == c4) || (c1 == c4 && c2 == c3)) {
                continue;
            }

            // Cases that require only one preprocessing move.
            else if (c1 == c3 || c1 == c4 || c2 == c3 || c2 == c4 || c3 == c4) {
                count++;
            }

            // All remaining cases require 2 changes.
            else {
                count += 2;
            }
        }

        // If 'n' is odd.
        if (n % 2 == 1 && a.charAt(n / 2) != b.charAt(n / 2)) {
            count++;
        }

        return count;
    }

}