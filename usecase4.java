public class usecase4 {

    public static void main(String[] args) {

        // O pattern (7 lines)
        String[] O = {
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        };

        // P pattern
        String[] P = {
                "*******  ",
                "*     *  ",
                "*     *  ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };

        // S pattern
        String[] S = {
                " *****   ",
                "*     *  ",
                "*        ",
                " *****   ",
                "      *  ",
                "*     *  ",
                " *****   "
        };

        // Banner array to store OOPS lines
        String[] banner = new String[7];

        // Populate banner using String.join()
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("", O[i], O[i], P[i], S[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}