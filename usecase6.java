public class OOPSBannerUC6 {

    public static void main(String[] args) {

        // Get patterns for each character
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble banner lines using methods
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper Method for O
    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper Method for P
    public static String[] getPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Helper Method for S
    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}